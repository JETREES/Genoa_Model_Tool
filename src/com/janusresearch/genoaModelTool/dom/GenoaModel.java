package com.janusresearch.genoaModelTool.dom;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.xml.XmlFile;
import com.intellij.psi.xml.XmlTag;
import com.intellij.ui.treeStructure.Tree;
import com.intellij.util.xml.DomManager;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

@SuppressWarnings("ConstantConditions")
public class GenoaModel {
    private final JTree myTree;
    private final VirtualFile myFile;
    private final GenoaRoot genoaRoot;
    private final String fileName;
    private final String filePath;
    private final XmlTag genoaRootTag;

    public GenoaModel(Project project, VirtualFile file) {
        myFile = file;
        filePath = file.getPath().substring(file.getPath().indexOf(project.getName()));
        fileName = file.getNameWithoutExtension();

        //Create DomManager, FileDescription and register the description
        DomManager manager = DomManager.getDomManager(project);

        //Get PsiFile from VirtualFile and cast that to XmlFile
        XmlFile xmlFile = (XmlFile) PsiManager.getInstance(project).findFile(file);

        //Get the GenoaRoot File Element
        genoaRoot = manager.getFileElement(xmlFile, GenoaRoot.class).getRootElement();
        genoaRootTag = genoaRoot.getXmlTag();

        myTree = createTree();

    }

    private JTree createTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(genoaRoot.getXmlTag().findFirstSubTag("name").getValue());
        DefaultMutableTreeNode node = new DefaultMutableTreeNode();
        DefaultMutableTreeNode subNode_1 = new DefaultMutableTreeNode();
        DefaultMutableTreeNode subNode_2 = new DefaultMutableTreeNode();
        DefaultMutableTreeNode subNode_3 = new DefaultMutableTreeNode();
        DefaultMutableTreeNode subNode_4 = new DefaultMutableTreeNode();

        XmlTag[] tag = genoaRootTag.findSubTags("entity");
        for (XmlTag t : tag) {
            for (XmlTag s1 : t.findSubTags("attr")) {

            }
        }

        for (XmlTag x : genoaRootTag.findSubTags("prototype")) {

        }

        for (XmlTag x : genoaRootTag.findSubTags("behavior")) {

        }








        final Tree tree = new Tree(new DefaultTreeModel(root));


        return tree;
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
