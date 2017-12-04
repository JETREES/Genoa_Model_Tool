package com.janusresearch.genoaModelTool.dom;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;
import com.intellij.ui.treeStructure.Tree;
import com.intellij.util.xml.DomManager;
import com.janusresearch.genoaModelTool.debug.Debug;
import com.janusresearch.genoaModelTool.genoa.Entity;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import java.net.MalformedURLException;
import java.util.Objects;

import icons.*;
import org.w3c.dom.Node;

@SuppressWarnings("ConstantConditions")
public class GenoaModel {
    private JTree myTree;
    private DefaultTreeModel myTreeModel;
    private final VirtualFile myFile;
    private final String fileName;
    private final String filePath;
    private CustomIconRenderer customIconRenderer;

    public GenoaModel(Project project, VirtualFile file) throws MalformedURLException {
        myFile = file;
        filePath = file.getPath().substring(file.getPath().indexOf(project.getName()));
        fileName = file.getNameWithoutExtension();

        //Create DomManager, FileDescription and register the description
        DomManager manager = DomManager.getDomManager(project);

        //Get PsiFile from VirtualFile and cast that to XmlFile
        XmlFile xmlFile = (XmlFile) PsiManager.getInstance(project).findFile(file);

        //Get the GenoaRoot File Element
        XmlTag genoaRoot = manager.getFileElement(xmlFile, GenoaRoot.class).getRootElement().getXmlTag();
        buildTree(genoaRoot);
    }

    private DefaultMutableTreeNode buildTree(XmlTag rootTag) throws MalformedURLException {
        DefaultMutableTreeNode rootTreeNode = new DefaultMutableTreeNode(treeNodeLabel(rootTag));
        myTreeModel = new DefaultTreeModel(rootTreeNode);
        myTree = new Tree(myTreeModel);


        customIconRenderer = new CustomIconRenderer();

        myTree.setCellRenderer(new CustomIconRenderer());
        addChildren(rootTreeNode, rootTag);
        myTree.setCellRenderer(customIconRenderer);
        return(rootTreeNode);
    }

    private void addChildren(DefaultMutableTreeNode parentTreeNode, XmlTag parentXmlTag) throws MalformedURLException {
        XmlTag[] childTags = parentXmlTag.getSubTags();
        DefaultMutableTreeNode childTreeNode = null;
        for (XmlTag t : childTags) {
            switch(t.getName()) {
                case "name" :
                case "comment" :
                case "description" :
                case "destination" :
                case "entityName" :
                case "superEntityName" :
                case "varName" :
                    break;
                case "entity" :
                    childTreeNode = new DefaultMutableTreeNode(new Entity(t));
                    parentTreeNode.add(childTreeNode);
                    addChildren(childTreeNode, t);
                    break;
                case "choices" :
                    for (XmlTag c : t.getSubTags()) {
                        DefaultMutableTreeNode choice = new DefaultMutableTreeNode(treeNodeLabel(t));
                        parentTreeNode.add(choice);
                    }
                    break;
                case "literal" :
                case "variableRef1" :
                    childTreeNode = new DefaultMutableTreeNode(treeNodeLabel(t));
                    parentTreeNode.add(childTreeNode);
                    break;
                case "propertyPath" :
                    String parent = t.getParentTag().getName();
                    switch(parent) {
                        case "clause" :
                        case "setProperty" :
                            childTreeNode = new DefaultMutableTreeNode(treeNodeLabel(t));
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
                        childTreeNode = new DefaultMutableTreeNode(treeNodeLabel(t));
                    }
                    parentTreeNode.add(childTreeNode);
                    break;
                default :
                    childTreeNode = new DefaultMutableTreeNode(treeNodeLabel(t));
                    parentTreeNode.add(childTreeNode);
                    addChildren(childTreeNode, t);
                    break;
            }
        }
    }

    private static String treeNodeLabel(XmlTag childTag) {
        XmlAttribute[] elementAttributes = childTag.getAttributes();
        XmlTag[] subTags = childTag.getSubTags();
        String treeNodeLabel;
        switch(childTag.getName()) {
            case "alias" :
            case "attr" :
            case "toManyMap" :
            case "toManyList" :
                treeNodeLabel = childTag.findFirstSubTag("name").getValue().getText();
                break;
            case "attributeSetting" :
            case "propertyPathSetting" :
                treeNodeLabel = childTag.findFirstSubTag("propertyPath").getValue().getText() + " <- " + subTags[1].getValue().getText();
                break;
            case "relationshipSetting" :
            case "toManySetting" :
            case "toManyListSetting" :
                treeNodeLabel = childTag.findFirstSubTag("propertyPath").getValue().getText();
                break;
            case "toOne" :
                treeNodeLabel = childTag.findFirstSubTag("name").getValue().getText() + "." + childTag.findFirstSubTag("destination").getValue().getText();
                break;
            case "entity" :
                treeNodeLabel = childTag.findFirstSubTag("name").getValue().getText() + "." + childTag.findFirstSubTag("superEntityName").getValue().getText();
                break;
            case "prototype" :
                treeNodeLabel = childTag.findFirstSubTag("name").getValue().getText() + "." + childTag.findFirstSubTag("entityName").getValue().getText();
                break;
            case "behavior" :
                treeNodeLabel = childTag.findFirstSubTag("description").getValue().getText();
                break;
            case "factPattern" :
                treeNodeLabel = childTag.findFirstSubTag("varName").getValue().getText() + " : " + childTag.findFirstSubTag("entityName").getValue().getText();
                break;
            case "clause" :
                String operator = elementAttributes[0].getValue();
                StringBuilder treeNodeLabelBuilder = new StringBuilder();
                for (int i = 0; i < subTags.length; i++) {
                    if (i > 0) {
                        treeNodeLabelBuilder.append(" ").append(operator).append(" ");
                    }
                    switch(subTags[i].getName()) {
                        case "propertyPath" :
                            treeNodeLabelBuilder.append(childTag.findFirstSubTag("propertyPath").getValue().getText());
                            break;
                        case "literal" :
                            treeNodeLabelBuilder.append(childTag.findFirstSubTag("literal").getSubTags()[0].getValue().getText());
                            break;
                    }
                }
                treeNodeLabel = treeNodeLabelBuilder.toString();
                break;
            case "literal" :
                treeNodeLabel = childTag.findFirstSubTag("value").getValue().getText();
                break;
            case "setProperty" :
                treeNodeLabel = childTag.findFirstSubTag("variableRef1").findFirstSubTag("varName").getValue().getText()
                        + "." + childTag.findFirstSubTag("propertyPath").getValue().getText()
                        + " <- " + childTag.findFirstSubTag("literal").findFirstSubTag("value").getValue().getText();
                break;
            case "variableRef1" :
                treeNodeLabel = childTag.findFirstSubTag("varName").getValue().getText();
                break;
            case "model" :
                treeNodeLabel = childTag.findFirstSubTag("name").getValue().getText();
                break;
            default :
                treeNodeLabel = childTag.getValue().getText();
                break;
        }
        return(treeNodeLabel);
    }

    public JTree getMyTree() {
        return myTree;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public VirtualFile getMyFile() {
        return myFile;
    }
}
