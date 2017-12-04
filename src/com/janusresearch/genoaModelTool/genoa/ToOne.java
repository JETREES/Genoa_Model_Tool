package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;

@SuppressWarnings("ConstantConditions")
public class ToOne {
    private XmlTag toOneTag;
    private String name = "";
    private String description = "";
    private String comment = "";
    private String transient_ = "";
    private String destination = "";
    private String inversePath = "";
    private String auto = "";
    private String bindable = "";
    private String toOneNodeText = "";

    public ToOne() {
        this.setName("toOne");
        this.setAuto("true");
        updateToOneNodeText();
    }

    public ToOne(XmlTag xmlTag) {
        this.toOneTag = xmlTag;
        this.setName(xmlTag.getSubTagText("name"));
        this.setDescription(xmlTag.getSubTagText("description"));
        this.setComment(xmlTag.getSubTagText("comment"));
        this.setTransient_(xmlTag.getSubTagText("transient"));
        this.setDestination(xmlTag.getSubTagText("destination"));
        this.setInversePath(xmlTag.getSubTagText("inversePath"));
        this.setAuto(xmlTag.getSubTagText("auto"));
        this.setBindable(xmlTag.getSubTagText("bindable"));
        updateToOneNodeText();
    }

    public XmlTag getToOneTag() {
        return toOneTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.getToOneTag().findFirstSubTag("name").getValue().setText(name);
        this.updateToOneNodeText();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.getToOneTag().findFirstSubTag("description").getValue().setText(description);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
        this.getToOneTag().findFirstSubTag("comment").getValue().setText(comment);
    }

    public String getTransient_() {
        return transient_;
    }

    public void setTransient_(String transient_) {
        this.transient_ = transient_;
        this.getToOneTag().findFirstSubTag("transient").getValue().setText(transient_);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
        this.getToOneTag().findFirstSubTag("destination").getValue().setText(destination);
    }

    public String getInversePath() {
        return inversePath;
    }

    public void setInversePath(String inversePath) {
        this.inversePath = inversePath;
        this.getToOneTag().findFirstSubTag("inversePath").getValue().setText(inversePath);
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
        this.getToOneTag().findFirstSubTag("auto").getValue().setText(auto);
    }

    public String getBindable() {
        return bindable;
    }

    public void setBindable(String bindable) {
        this.bindable = bindable;
        this.getToOneTag().findFirstSubTag("bindable").getValue().setText(bindable);
    }

    public String getToOneNodeText() {
        return toOneNodeText;
    }

    private void updateToOneNodeText() {
        this.toOneNodeText = getName();
    }
}
