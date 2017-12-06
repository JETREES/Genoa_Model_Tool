package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.project.Project;
import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.dom.GenoaXmlTags;
import com.janusresearch.genoaModelTool.genoa.Entity;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class EntityImpl extends GenoaObject implements Entity {
    private final Project project;
    private XmlTag entityTag;
    private String name = null;
    private String superEntityName = null;
    private String nodeText = null;
    private String comment = null;
    private String description = null;
    private String abstract_ = null;
    private List<AttributeImpl> attributeImplList = new ArrayList<>();
    private List<ToOneImpl> toOneImplList = new ArrayList<>();
    private List<ToManyImpl> toManyImplList =  new ArrayList<>();
    private List<ToManyMapImpl> toManyMapImplList = new ArrayList<>();
    private List<ToManyListImpl> toManyListImplList = new ArrayList<>();
    private List<AliasImpl> aliasImplList = new ArrayList<>();

    public EntityImpl(Project project) {
        this.project = project;
        this.setType(GenoaXmlTags.ENTITY);
        this.setName("Entity");
        this.updateNodeText();
    }

    EntityImpl(Project project, XmlTag xmlTag) {
        this.project = project;
        this.entityTag = xmlTag;
        this.setType(GenoaXmlTags.ENTITY);
        if (hasNameTag()) {
            this.setName(xmlTag.getSubTagText(GenoaXmlTags.NAME));
        }
        if (hasSuperEntityNameTag()) {
            this.setSuperEntityName(xmlTag.getSubTagText(GenoaXmlTags.SUPER_ENTITY_NAME));
        }
        if (hasCommentTag()) {
            this.setComment(xmlTag.getSubTagText(GenoaXmlTags.COMMENT));
        }
        if (hasDescriptionTag()) {
            this.setDescription(xmlTag.getSubTagText(GenoaXmlTags.DESCRIPTION));
        }
        if (hasAbstractTag()) {
            this.setAbstract_(xmlTag.getSubTagText(GenoaXmlTags.ABSTRACT));
        }
        this.updateNodeText();
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
        this.name = name;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getEntityTag().findFirstSubTag(GenoaXmlTags.NAME).getValue().setText(name));
        this.updateNodeText();
    }

    public String getSuperEntityName() {
        return superEntityName;
    }

    public boolean hasSuperEntityNameTag() {
        return this.getEntityTag().findFirstSubTag(GenoaXmlTags.SUPER_ENTITY_NAME) != null;
    }

    public void setSuperEntityName(String superEntityName) {
        this.superEntityName = superEntityName;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getEntityTag().findFirstSubTag(GenoaXmlTags.SUPER_ENTITY_NAME).getValue().setText(superEntityName));
        this.updateNodeText();
    }

    public String getComment() {
        return comment;
    }

    public boolean hasCommentTag() {
        return this.getEntityTag().findFirstSubTag(GenoaXmlTags.COMMENT) != null;
    }

    public void setComment(String comment) {
        this.comment = comment;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getEntityTag().findFirstSubTag(GenoaXmlTags.COMMENT).getValue().setText(comment));
    }

    public String getDescription() {
        return description;
    }

    public boolean hasDescriptionTag() {
        return this.getEntityTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION) != null;
    }

    public void setDescription(String description) {
        this.description = description;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getEntityTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION).getValue().setText(description));
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
        this.abstract_ = abstract_;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getEntityTag().findFirstSubTag(GenoaXmlTags.ABSTRACT).getValue().setText(abstract_));
    }

    public List<AttributeImpl> getAttributeImplList() {
        return attributeImplList;
    }

    public AttributeImpl addAttribute(XmlTag attrTag) {
        AttributeImpl attributeImpl = new AttributeImpl(project, attrTag);
        this.getAttributeImplList().add(attributeImpl);
        return attributeImpl;
    }

    public List<ToOneImpl> getToOneImplList() {
        return toOneImplList;
    }

    public ToOneImpl addToOne(XmlTag toOneTag) {
        ToOneImpl toOneImpl = new ToOneImpl(project, toOneTag);
        this.getToOneImplList().add(toOneImpl);
        return toOneImpl;
    }

    public List<ToManyImpl> getToManyImplList() {
        return toManyImplList;
    }

    public ToManyImpl addToMany(XmlTag toManyTag) {
        ToManyImpl toManyImpl = new ToManyImpl(project, toManyTag);
        this.getToManyImplList().add(toManyImpl);
        return toManyImpl;
    }

    public List<ToManyMapImpl> getToManyMapImplList() {
        return toManyMapImplList;
    }

    public ToManyMapImpl addToManyMap(XmlTag toManyMapTag) {
        ToManyMapImpl toManyMapImpl = new ToManyMapImpl(project, toManyMapTag);
        this.getToManyMapImplList().add(toManyMapImpl);
        return toManyMapImpl;
    }

    public List<ToManyListImpl> getToManyListImplList() {
        return toManyListImplList;
    }

    public ToManyListImpl addToManyList(XmlTag toManyListTag) {
        ToManyListImpl toManyListImpl = new ToManyListImpl(project, toManyListTag);
        this.getToManyListImplList().add(toManyListImpl);
        return toManyListImpl;
    }

    public List<AliasImpl> getAliasImplList() {
        return aliasImplList;
    }

    public AliasImpl addAlias(XmlTag AliasTag) {
        AliasImpl AliasImpl = new AliasImpl(project, AliasTag);
        this.getAliasImplList().add(AliasImpl);
        return AliasImpl;
    }
}
