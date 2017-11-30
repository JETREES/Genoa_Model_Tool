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
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import java.util.Objects;

@SuppressWarnings("ConstantConditions")
public class GenoaModel {
    private final JTree myTree;
    private final VirtualFile myFile;
    private final String fileName;
    private final String filePath;

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
        myTree = new Tree(buildTree(genoaRoot));
    }

    private DefaultMutableTreeNode buildTree(XmlTag rootTag) {
        DefaultMutableTreeNode rootTreeNode = new DefaultMutableTreeNode(rootTag.findFirstSubTag("name").getValue().getText());
        addChildren(rootTreeNode, rootTag);
        return(rootTreeNode);
    }

    private void addChildren(DefaultMutableTreeNode parentTreeNode, XmlTag parentXmlTag) {
        XmlTag[] childTags = parentXmlTag.getSubTags();
        DefaultMutableTreeNode childTreeNode = null;
        for (XmlTag t : childTags) {
            switch(t.getName()) {
                case "name" :
                case "superEntityName" :
                    break;
                case "entity" :
                case "attr" :
                case "toOne" :
                case "toMany" :
                case "toManyMap" :
                case "toManyList" :
                case "alias" :
                case "prototype" :
                    childTreeNode = new DefaultMutableTreeNode(treeNodeLabel(t.findFirstSubTag("name")));
                    break;
                case "choices" :
                    for (XmlTag c : t.getSubTags()) {
                        DefaultMutableTreeNode choice = new DefaultMutableTreeNode(treeNodeLabel(t));
                        parentTreeNode.add(choice);
                    }
                    break;
                case "behavior" :
                    parentTreeNode.add(createBehavior(t));
                    break;
                default :
                    childTreeNode = new DefaultMutableTreeNode(treeNodeLabel(t));
                    break;
            }
            if (!Objects.equals(t.getName(), "choices")) {
                parentTreeNode.add(childTreeNode);
                addChildren(childTreeNode, t);
            }
        }
    }

    @Nullable
    @Contract(pure = true)
    private MutableTreeNode createEntity(XmlTag t) {
        t.getSubTags();
        DefaultMutableTreeNode entityNode = new DefaultMutableTreeNode(t.findFirstSubTag("name").getValue().getText());
        return null;
    }

    @Nullable
    @Contract(pure = true)
    private MutableTreeNode createPrototype(XmlTag t) {
        return null;
    }

    @Nullable
    @Contract(pure = true)
    private MutableTreeNode createBehavior(XmlTag t) {
        return null;
    }

    private static String treeNodeLabel(XmlTag childTag) {
        XmlAttribute[] elementAttributes = childTag.getAttributes();
        XmlTag[] subTags = childTag.getSubTags();
        String treeNodeLabel;
        treeNodeLabel = childTag.getValue().getText();

        Debug.print(treeNodeLabel);

        /*if (elementAttributes != null && elementAttributes.length > 0) {
            //todo add code here later to handle adding icons????
        }*/
        return(treeNodeLabel);
    }

    private JTree createTree() {
//        DefaultMutableTreeNode root = new DefaultMutableTreeNode(genoaRoot.getXmlTag().findFirstSubTag("name").getValue());
        DefaultMutableTreeNode node = new DefaultMutableTreeNode();
        DefaultMutableTreeNode subNode_1 = new DefaultMutableTreeNode();
        DefaultMutableTreeNode subNode_2 = new DefaultMutableTreeNode();
        DefaultMutableTreeNode subNode_3 = new DefaultMutableTreeNode();
        DefaultMutableTreeNode subNode_4 = new DefaultMutableTreeNode();

        /*XmlTag[] tag = genoaRootTag.findSubTags("entity");
        for (XmlTag t : tag) {
            for (XmlTag s : t.findSubTags("attr")) {
            }
        }
        for (XmlTag x : genoaRootTag.findSubTags("prototype")) {
        }
        for (XmlTag x : genoaRootTag.findSubTags("behavior")) {
        }*/

        /*XmlTag[] tags = genoaRootTag.getSubTags();
        for (XmlTag t : tags) {

        }*/







//        final Tree tree = new Tree(new DefaultTreeModel(root));


        return null;
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
