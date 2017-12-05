package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class Entity {
    private XmlTag entityTag;
    private String name = "";
    private String superEntityName = "";
    private String nodeText = "";
    private String comment = "";
    private String description = "";
    private String abstract_ = "";
    private List<Attribute> attributeList = new ArrayList<>();
    private List<ToOne> toOneList = new ArrayList<>();

    public Entity() {
        this.name = "Entity";
        this.updateEntityNodeText();
    }

    public Entity(XmlTag xmlTag) {
        this.entityTag = xmlTag;
        this.name = xmlTag.getSubTagText("name");
        this.superEntityName = xmlTag.getSubTagText("superEntityName");
        this.comment = xmlTag.getSubTagText("comment");
        this.description = xmlTag.getSubTagText("description");
        this.abstract_ = xmlTag.getSubTagText("abstract");
        this.updateEntityNodeText();
    }

    public XmlTag getEntityTag() {
        return entityTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.getEntityTag().findFirstSubTag("name").getValue().setText(name);
        this.updateEntityNodeText();
    }

    public String getSuperEntityName() {
        return superEntityName;
    }

    public void setSuperEntityName(String superEntityName) {
        this.superEntityName = superEntityName;
        this.getEntityTag().findFirstSubTag("superEntityName").getValue().setText(superEntityName);
        this.updateEntityNodeText();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
        this.getEntityTag().findFirstSubTag("comment").getValue().setText(comment);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.getEntityTag().findFirstSubTag("description").getValue().setText(description);
    }

    public String getNodeText() {
        return nodeText;
    }

    private void updateEntityNodeText() {
        this.nodeText = getName() + "." + getSuperEntityName();
    }

    public String getAbstract_() {
        return abstract_;
    }

    public void setAbstract_(String abstract_) {
        this.abstract_ = abstract_;
        this.getEntityTag().findFirstSubTag("abstract").getValue().setText(abstract_);
    }

    public List<Attribute> getAttributeList() {
        return attributeList;
    }

    public Attribute addAttribute(XmlTag attrTag) {
        Attribute attribute = new Attribute(attrTag);
        this.getAttributeList().add(attribute);
        return attribute;
    }

    public List<ToOne> getToOneList() {
        return toOneList;
    }

    public ToOne addToOne(XmlTag toOneTag) {
        ToOne toOne = new ToOne(toOneTag);
        this.getToOneList().add(toOne);
        return toOne;
    }
}
