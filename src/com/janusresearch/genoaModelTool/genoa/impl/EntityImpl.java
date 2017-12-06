package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.dom.GenoaXmlTags;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class EntityImpl extends GenoaObject implements com.janusresearch.genoaModelTool.genoa.Entity {
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
        this.setType(GenoaXmlTags.ENTITY);
    }

    public XmlTag getEntityTag() {
        return entityTag;
    }

    public String getName() {
        return name;
    }

    public boolean hasNameTag() {
        return this.getEntityTag().findFirstSubTag(GenoaXmlTags.NAME) != null;
    }

    public void setName(String name) {
        if (hasNameTag()) {
            this.name = name;
            this.getEntityTag().findFirstSubTag(GenoaXmlTags.NAME).getValue().setText(name);
            this.updateNodeText();
        }
    }

    public String getSuperEntityName() {
        return superEntityName;
    }

    public boolean hasSuperEntityNameTag() {
        return this.getEntityTag().findFirstSubTag(GenoaXmlTags.SUPER_ENTITY_NAME) != null;
    }

    public void setSuperEntityName(String superEntityName) {
        if (hasSuperEntityNameTag()) {
            this.superEntityName = superEntityName;
            this.getEntityTag().findFirstSubTag(GenoaXmlTags.SUPER_ENTITY_NAME).getValue().setText(superEntityName);
            this.updateNodeText();
        }
    }

    public String getComment() {
        return comment;
    }

    public boolean hasCommentTag() {
        return this.getEntityTag().findFirstSubTag(GenoaXmlTags.COMMENT) != null;
    }

    public void setComment(String comment) {
        if (hasCommentTag()) {
            this.comment = comment;
            this.getEntityTag().findFirstSubTag(GenoaXmlTags.COMMENT).getValue().setText(comment);
        }
    }

    public String getDescription() {
        return description;
    }

    public boolean hasDescriptionTag() {
        return this.getEntityTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION) != null;
    }

    public void setDescription(String description) {
        if (hasDescriptionTag()) {
            this.description = description;
            this.getEntityTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION).getValue().setText(description);
        }
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

    public boolean hasAbstractTag() {
        return this.getEntityTag().findFirstSubTag(GenoaXmlTags.ABSTRACT) != null;
    }

    public void setAbstract_(String abstract_) {
        if (hasAbstractTag()) {
            this.abstract_ = abstract_;
            this.getEntityTag().findFirstSubTag(GenoaXmlTags.ABSTRACT).getValue().setText(abstract_);
        }
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
