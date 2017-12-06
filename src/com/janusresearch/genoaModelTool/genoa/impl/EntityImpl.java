package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.dom.GenoaXmlTags;
import com.janusresearch.genoaModelTool.genoa.Entity;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class EntityImpl extends GenoaObjectImpl implements Entity {
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
        this.setName("Entity");
        this.updateNodeText();
    }

    public EntityImpl(XmlTag xmlTag) {
        this.entityTag = xmlTag;
        this.setName(xmlTag.getSubTagText(GenoaXmlTags.NAME));
        this.setSuperEntityName(xmlTag.getSubTagText(GenoaXmlTags.SUPER_ENTITY_NAME));
        this.setComment(xmlTag.getSubTagText(GenoaXmlTags.COMMENT));
        this.setDescription(xmlTag.getSubTagText(GenoaXmlTags.DESCRIPTION));
        this.setAbstract_(xmlTag.getSubTagText(GenoaXmlTags.ABSTRACT));
        this.updateNodeText();
    }

    public XmlTag getEntityTag() {
        return entityTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.getEntityTag().findFirstSubTag(GenoaXmlTags.NAME).getValue().setText(name);
        this.updateNodeText();
    }

    public String getSuperEntityName() {
        return superEntityName;
    }

    public void setSuperEntityName(String superEntityName) {
        this.superEntityName = superEntityName;
        this.getEntityTag().findFirstSubTag(GenoaXmlTags.SUPER_ENTITY_NAME).getValue().setText(superEntityName);
        this.updateNodeText();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
        this.getEntityTag().findFirstSubTag(GenoaXmlTags.COMMENT).getValue().setText(comment);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.getEntityTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION).getValue().setText(description);
    }

    public String getNodeText() {
        return nodeText;
    }

    public void updateNodeText() {
        this.nodeText = getName() + "." + getSuperEntityName();
    }

    public String getAbstract_() {
        return abstract_;
    }

    public void setAbstract_(String abstract_) {
        this.abstract_ = abstract_;
        this.getEntityTag().findFirstSubTag(GenoaXmlTags.ABSTRACT).getValue().setText(abstract_);
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
