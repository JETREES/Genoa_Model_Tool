package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class EntityImpl {
    private XmlTag entityTag;
    private String name = "";
    private String superEntityName = "";
    private String nodeText = "";
    private String comment = "";
    private String description = "";
    private String abstract_ = "";
    private List<AttributeImpl> attributeImplList = new ArrayList<>();
    private List<ToOneImpl> toOneImplList = new ArrayList<>();

    public EntityImpl() {
        this.name = "Entity";
        this.updateEntityNodeText();
    }

    public EntityImpl(XmlTag xmlTag) {
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

    public List<AttributeImpl> getAttributeImplList() {
        return attributeImplList;
    }

    public AttributeImpl addAttribute(XmlTag attrTag) {
        AttributeImpl attributeImpl = new AttributeImpl(attrTag);
        this.getAttributeImplList().add(attributeImpl);
        return attributeImpl;
    }

    public List<ToOneImpl> getToOneImplList() {
        return toOneImplList;
    }

    public ToOneImpl addToOne(XmlTag toOneTag) {
        ToOneImpl toOneImpl = new ToOneImpl(toOneTag);
        this.getToOneImplList().add(toOneImpl);
        return toOneImpl;
    }
}
