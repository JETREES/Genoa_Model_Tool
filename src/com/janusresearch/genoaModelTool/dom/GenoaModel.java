package com.janusresearch.genoaModelTool.dom;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.treeStructure.Tree;
import com.janusresearch.genoaModelTool.genoa.impl.*;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.xml.bind.*;
import java.io.*;

import com.janusresearch.genoaModelTool.jaxb.*;
import icons.CustomRenderer;

@SuppressWarnings({"ConstantConditions"})
public class GenoaModel {
    private final Project project;
    private JTree tree;
    private final VirtualFile file;
    private final String fileName;
    private final String filePath;
    private OutputStreamWriter osw;
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;
    private Model model;

    public GenoaModel(Project project, VirtualFile file, JAXBContext jaxbContext) {
        this.file = file;
        this.project = project;
        this.filePath = file.getPath().substring(file.getPath().indexOf(project.getName()));
        this.fileName = file.getNameWithoutExtension();

        //Create DomManager, FileDescription and register the description
//        DomManager manager = DomManager.getDomManager(project);

        //Get PsiFile from VirtualFile and cast that to XmlFile
//        XmlFile xmlFile = (XmlFile) PsiManager.getInstance(project).findFile(file);
        try (InputStream inputStream = file.getInputStream()) {
            try {
                this.unmarshaller = jaxbContext.createUnmarshaller();
                this.marshaller = jaxbContext.createMarshaller();
                JAXBElement<?> modelElement = (JAXBElement<?>) unmarshaller.unmarshal(inputStream);
                this.model = (Model) modelElement.getValue();

//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//            osw = new OutputStreamWriter(file.getOutputStream(null));
//            marshaller.marshal(model, osw);
//            osw.close();

            } catch (JAXBException jaxbe) {
                jaxbe.printStackTrace();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        /*
        * Might use this code again at some point but for now it will remain commented out
        * Get the GenoaRoot File Element
        * XmlTag genoaRoot = manager.getFileElement(xmlFile, GenoaRoot.class).getRootElement().getXmlTag();
        */
        buildTree(this.model);
    }

    private void buildTree(Model model){
        /*this.model = new ModelImpl(project, rootTag);
        GenoaObject myModel = new ModelImpl(project, rootTag);*/
        DefaultMutableTreeNode rootTreeNode = new DefaultMutableTreeNode(getModel());
        DefaultTreeModel treeModel = new DefaultTreeModel(rootTreeNode);
        this.tree = new Tree(treeModel);
        CustomRenderer customRenderer = new CustomRenderer();
//        addChildren(myModel, rootTreeNode);
        addEntities(rootTreeNode);
        tree.setCellRenderer(customRenderer);
    }

    private void addEntities(DefaultMutableTreeNode modelNode) {
        for (Entity entity : getModel().getEntity()) {
            DefaultMutableTreeNode entityNode = new DefaultMutableTreeNode(entity);
            for (Attribute attribute : entity.getAttr()) {
                DefaultMutableTreeNode attrNode = new DefaultMutableTreeNode(attribute);
                for (String choice : attribute.getChoices().getValue()) {
                    DefaultMutableTreeNode choiceNode = new DefaultMutableTreeNode(new Choice(choice));
                    attrNode.add(choiceNode);
                }
                entityNode.add(attrNode);
            }
            for (ToOne t : entity.getToOne()) {

            }
        }
    }

    /*private static String treeNodeLabel(XmlTag childTag) {
        XmlAttribute[] elementAttributes = childTag.getAttributes();
        XmlTag[] subTags = childTag.getSubTags();
        String treeNodeLabel;
        return(treeNodeLabel);
    }*/

    private void addChildren(Model model, DefaultMutableTreeNode parentTreeNode) {
//        XmlTag[] childTags = parentXmlTag.getSubTags();
        DefaultMutableTreeNode childTreeNode = null;
        GenoaObject currentObj;
        /*for (XmlTag t : childTags) {
            switch(t.getName()) {
                case GenoaXmlTags.NAME :
                case GenoaXmlTags.COMMENT :
                case GenoaXmlTags.DESCRIPTION :
                case GenoaXmlTags.DESTINATION :
                case GenoaXmlTags.ENTITY_NAME :
                case GenoaXmlTags.SUPER_ENTITY_NAME :
                case GenoaXmlTags.VAR_NAME :
                    break;
                case GenoaXmlTags.ENTITY :
                    currentObj = ((ModelImpl) parentObj).addEntity(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.ATTRIBUTE :
                    currentObj = ((EntityImpl) parentObj).addAttribute(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.CHOICES :
                    for (XmlTag c : t.getSubTags()) {
                        currentObj = ((AttributeImpl) parentObj).addChoice(c);
                        DefaultMutableTreeNode choice = new DefaultMutableTreeNode(currentObj);
                        parentTreeNode.add(choice);
                    }
                    break;
                case GenoaXmlTags.TO_ONE :
                    currentObj = ((EntityImpl) parentObj).addToOne(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.TO_MANY :
                    currentObj = ((EntityImpl) parentObj).addToMany(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.TO_MANY_MAP :
                    currentObj = ((EntityImpl) parentObj).addToManyMap(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.TO_MANY_LIST :
                    currentObj = ((EntityImpl) parentObj).addToManyList(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.ALIAS :
                    currentObj = ((EntityImpl) parentObj).addAlias(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.PROTOTYPE :
                    currentObj = ((ModelImpl) parentObj).addPrototype(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.ATTRIBUTE_SETTING :
                    currentObj = ((PrototypeImpl) parentObj).addAttributeSetting(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.PROPERTY_PATH_SETTING :
                    currentObj = ((PrototypeImpl) parentObj).addPropertyPathSetting(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.RELATIONSHIP_SETTING :
                    currentObj = ((PrototypeImpl) parentObj).addRelationshipSetting(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.TO_MANY_LIST_SETTING :
                    currentObj = ((PrototypeImpl) parentObj).addToManyListSetting(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.TO_MANY_SETTING :
                    currentObj = ((PrototypeImpl) parentObj).addToManySetting(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.VALUE :
                    currentObj = ((PrototypeImpl) parentObj).addValue(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.SOURCE_PROPERTY_PATH :
                    currentObj = ((PrototypeImpl) parentObj).addSourcePropertyPath(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case GenoaXmlTags.PROTOTYPE_REF :
                    currentObj = ((PrototypeImpl) parentObj).addSourcePropertyPath(t);
                    childTreeNode = new DefaultMutableTreeNode(currentObj);
                    parentTreeNode.add(childTreeNode);
                    addChildren(currentObj, childTreeNode, t);
                    break;
                case "literal" :
                case "variableRef1" :
                    childTreeNode = new DefaultMutableTreeNode(t);
                    parentTreeNode.add(childTreeNode);
                    break;
                case "propertyPath" :
                    String parent = t.getParentTag().getName();
                    switch(parent) {
                        case "clause" :
                        case "setProperty" :
                            childTreeNode = new DefaultMutableTreeNode(t);
                            parentTreeNode.add(childTreeNode);
                    }
                    break;
                case "prototypeRef" :
                    if (Objects.equals(t.getParentTag().getName(), "relationshipSetting")) {
                        String[] split = t.getValue().getText().split(",");
                        for (String s : split) {
                            childTreeNode = new DefaultMutableTreeNode(s);
                        }
                    }
                    else {
                        childTreeNode = new DefaultMutableTreeNode(t);
                    }
                    parentTreeNode.add(childTreeNode);
                    break;
                default :
                    childTreeNode = new DefaultMutableTreeNode(t);
                    parentTreeNode.add(childTreeNode);
                    break;
            }
        }*/
    }


    public Model getModel() {
        return model;
    }

    public JTree getTree() {
        return tree;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public VirtualFile getFile() {
        return file;
    }
}
