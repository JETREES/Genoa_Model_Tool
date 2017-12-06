package com.janusresearch.genoaModelTool.dom;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;
import com.intellij.ui.treeStructure.Tree;
import com.intellij.util.xml.DomManager;
import com.janusresearch.genoaModelTool.genoa.Model;
import com.janusresearch.genoaModelTool.genoa.impl.*;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.Objects;

import icons.*;

@SuppressWarnings("ConstantConditions")
public class GenoaModel {
    private JTree myTree;
    private Model model;
    private DefaultTreeModel myTreeModel;
    private final VirtualFile myFile;
    private final String fileName;
    private final String filePath;
    private EntityImpl currentEntity;
    private PrototypeImpl currentPrototype;
    private BehaviorImpl currentBehavior;

    public GenoaModel(Project project, VirtualFile file) {
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

    private void buildTree(XmlTag rootTag){
        this.model = new ModelImpl(rootTag);
        GenoaObjectImpl test = new ModelImpl(rootTag);
        DefaultMutableTreeNode rootTreeNode = new DefaultMutableTreeNode(model);
        myTreeModel = new DefaultTreeModel(rootTreeNode);
        myTree = new Tree(myTreeModel);

        CustomRenderer customRenderer = new CustomRenderer();

        addChildren(rootTreeNode, rootTag);
        myTree.setCellRenderer(customRenderer);
    }

    private void addChildren(DefaultMutableTreeNode parentTreeNode, XmlTag parentXmlTag) {
        XmlTag[] childTags = parentXmlTag.getSubTags();
        DefaultMutableTreeNode childTreeNode = null;
        for (XmlTag t : childTags) {
            switch(t.getName()) {
                case GenoaXmlTags.NAME :
                case "comment" :
                case "description" :
                case "destination" :
                case "entityName" :
                case "superEntityName" :
                case "varName" :
                    break;
                case "entity" :
                    childTreeNode = new DefaultMutableTreeNode(new EntityImpl(t));
                    parentTreeNode.add(childTreeNode);
                    addChildren(childTreeNode, t);
                    break;
                case "choices" :
                    for (XmlTag c : t.getSubTags()) {
                        DefaultMutableTreeNode choice = new DefaultMutableTreeNode(t);
                        parentTreeNode.add(choice);
                    }
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
                    addChildren(childTreeNode, t);
                    break;
            }
        }
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
