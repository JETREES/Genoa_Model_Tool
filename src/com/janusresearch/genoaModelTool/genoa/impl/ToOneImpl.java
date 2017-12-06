package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.dom.GenoaXmlTags;

@SuppressWarnings("ConstantConditions")
public class ToOneImpl extends GenoaObject implements com.janusresearch.genoaModelTool.genoa.ToOne {
    private XmlTag toOneTag;
    private String name = "";
    private String description = "";
    private String comment = "";
    private String transient_ = "";
    private String destination = "";
    private String inversePath = "";
    private String auto = "";
    private String bindable = "";
    private String nodeText = "";

    public ToOneImpl() {
        this.setName("To One");
        this.setAuto("true");
        updateNodeText();
    }

    public ToOneImpl(XmlTag xmlTag) {
        this.toOneTag = xmlTag;
        this.setName(xmlTag.getSubTagText(GenoaXmlTags.NAME));
        this.setDescription(xmlTag.getSubTagText(GenoaXmlTags.DESCRIPTION));
        this.setComment(xmlTag.getSubTagText(GenoaXmlTags.COMMENT));
        this.setTransient_(xmlTag.getSubTagText(GenoaXmlTags.TRANSIENT));
        this.setDestination(xmlTag.getSubTagText(GenoaXmlTags.DESTINATION));
        this.setInversePath(xmlTag.getSubTagText(GenoaXmlTags.INVERSE_PATH));
        this.setAuto(xmlTag.getSubTagText(GenoaXmlTags.AUTO));
        this.setBindable(xmlTag.getSubTagText(GenoaXmlTags.BINDABLE));
        updateNodeText();
    }

    public XmlTag getToOneTag() {
        return toOneTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.getToOneTag().findFirstSubTag(GenoaXmlTags.NAME).getValue().setText(name);
        this.updateNodeText();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.getToOneTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION).getValue().setText(description);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
        this.getToOneTag().findFirstSubTag(GenoaXmlTags.COMMENT).getValue().setText(comment);
    }

    public String getTransient_() {
        return transient_;
    }

    public void setTransient_(String transient_) {
        this.transient_ = transient_;
        this.getToOneTag().findFirstSubTag(GenoaXmlTags.TRANSIENT).getValue().setText(transient_);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
        this.getToOneTag().findFirstSubTag(GenoaXmlTags.DESTINATION).getValue().setText(destination);
    }

    public String getInversePath() {
        return inversePath;
    }

    public void setInversePath(String inversePath) {
        this.inversePath = inversePath;
        this.getToOneTag().findFirstSubTag(GenoaXmlTags.INVERSE_PATH).getValue().setText(inversePath);
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
        this.getToOneTag().findFirstSubTag(GenoaXmlTags.AUTO).getValue().setText(auto);
    }

    public String getBindable() {
        return bindable;
    }

    public void setBindable(String bindable) {
        this.bindable = bindable;
        this.getToOneTag().findFirstSubTag(GenoaXmlTags.BINDABLE).getValue().setText(bindable);
    }

    public String getNodeText() {
        return nodeText;
    }

    public void updateNodeText() {
        this.nodeText = getName();
    }
}
