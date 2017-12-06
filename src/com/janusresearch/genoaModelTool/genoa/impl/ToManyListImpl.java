package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.project.Project;
import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.dom.GenoaXmlTags;
import com.janusresearch.genoaModelTool.genoa.ToManyList;

@SuppressWarnings("ConstantConditions")
public class ToManyListImpl extends GenoaObject implements ToManyList {

    private final Project project;
    private XmlTag toManyListTag;
    private String name = null;
    private String description = null;
    private String comment = null;
    private String transient_ = null;
    private String destination = null;
    private String inversePath = null;
    private String nodeText = null;

    public ToManyListImpl(Project project) {
        this.project = project;
        this.setType(GenoaXmlTags.TO_MANY_LIST);
        this.setName("To Many List");
        updateNodeText();
    }

    ToManyListImpl(Project project, XmlTag xmlTag) {
        this.project = project;
        this.setType(GenoaXmlTags.TO_MANY_LIST);
        this.toManyListTag = xmlTag;
        if (hasNameTag()) {
            this.setName(xmlTag.getSubTagText(GenoaXmlTags.NAME));
        }
        if (hasDescriptionTag()) {
            this.setDescription(xmlTag.getSubTagText(GenoaXmlTags.DESCRIPTION));
        }
        if (hasCommentTag()) {
            this.setComment(xmlTag.getSubTagText(GenoaXmlTags.COMMENT));
        }
        if (hasTransientTag()) {
            this.setTransient_(xmlTag.getSubTagText(GenoaXmlTags.TRANSIENT));
        }
        if (hasDestinationTag()) {
            this.setDestination(xmlTag.getSubTagText(GenoaXmlTags.DESTINATION));
        }
        if (hasInversePathTag()) {
            this.setInversePath(xmlTag.getSubTagText(GenoaXmlTags.INVERSE_PATH));
        }
        updateNodeText();
    }

    public XmlTag getToManyListTag() {
        return toManyListTag;
    }

    public String getName() {
        return name;
    }

    public boolean hasNameTag() {
        return this.getToManyListTag().findFirstSubTag(GenoaXmlTags.NAME) != null;
    }

    public void setName(String name) {
        this.name = name;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getToManyListTag().findFirstSubTag(GenoaXmlTags.NAME).getValue().setText(name));
        this.updateNodeText();
    }
    public String getDescription() {
        return description;
    }

    public boolean hasDescriptionTag() {
        return this.getToManyListTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION) != null;
    }

    public void setDescription(String description) {
        this.description = description;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getToManyListTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION).getValue().setText(description));
    }

    public String getComment() {
        return comment;
    }

    public boolean hasCommentTag() {
        return this.getToManyListTag().findFirstSubTag(GenoaXmlTags.COMMENT) != null;
    }

    public void setComment(String comment) {
        this.comment = comment;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getToManyListTag().findFirstSubTag(GenoaXmlTags.COMMENT).getValue().setText(comment));
    }

    public String getTransient_() {
        return transient_;
    }

    public boolean hasTransientTag() {
        return this.getToManyListTag().findFirstSubTag(GenoaXmlTags.TRANSIENT) != null;
    }

    public void setTransient_(String transient_) {
        this.transient_ = transient_;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getToManyListTag().findFirstSubTag(GenoaXmlTags.TRANSIENT).getValue().setText(transient_));
    }

    public String getDestination() {
        return destination;
    }

    public boolean hasDestinationTag() {
        return this.getToManyListTag().findFirstSubTag(GenoaXmlTags.DESTINATION) != null;
    }

    public void setDestination(String destination) {
        this.destination = destination;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getToManyListTag().findFirstSubTag(GenoaXmlTags.DESTINATION).getValue().setText(destination));
    }

    public String getInversePath() {
        return inversePath;
    }

    public boolean hasInversePathTag() {
        return this.getToManyListTag().findFirstSubTag(GenoaXmlTags.INVERSE_PATH) != null;
    }

    public void setInversePath(String inversePath) {
        this.inversePath = inversePath;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getToManyListTag().findFirstSubTag(GenoaXmlTags.INVERSE_PATH).getValue().setText(inversePath));
    }

    public String getNodeText() {
        return nodeText;
    }

    public void updateNodeText() {
        this.nodeText = getName();
    }
}
