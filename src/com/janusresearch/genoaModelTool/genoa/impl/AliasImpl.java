package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.project.Project;
import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.dom.GenoaXmlTags;
import com.janusresearch.genoaModelTool.genoa.Alias;

@SuppressWarnings("ConstantConditions")
public class AliasImpl extends GenoaObject implements Alias {
    private final Project project;
    private XmlTag aliasTag;
    private String name = null;
    private String typeName = null;
    private String description = null;
    private String comment = null;
    private String transient_ = null;
    private String source = null;
    private String target = null;
    private String aliasPropertyPath = null;
    private String nodeText = null;

    public AliasImpl(Project project) {
        this.project = project;
        this.setType(GenoaXmlTags.ALIAS);
        this.setName("Alias");
        this.setTypeName("String");
        updateNodeText();
    }

    AliasImpl(Project project, XmlTag xmlTag) {
        this.project = project;
        this.setType(GenoaXmlTags.ALIAS);
        this.aliasTag = xmlTag;
        if (hasNameTag()) {
            this.setName(xmlTag.getSubTagText(GenoaXmlTags.NAME));
        }
        if (hasTypeNameAttr()) {
            this.setTypeName(xmlTag.getAttribute(GenoaXmlTags.TYPE_NAME).getValue());
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
        if (hasSourceTag()) {
            this.setSource(xmlTag.getSubTagText(GenoaXmlTags.SOURCE));
        }
        if (hasTargetTag()) {
            this.setTarget(xmlTag.getSubTagText(GenoaXmlTags.TARGET));
        }
        if (hasAliasPropertyPathTag()) {
            this.setAliasPropertyPath(xmlTag.getSubTagText(GenoaXmlTags.ALIAS_PROPERTY_PATH));
        }
        updateNodeText();
    }

    public XmlTag getAliasTag() {
        return aliasTag;
    }

    public String getName() {
        return name;
    }

    public boolean hasNameTag() {
        return this.getAliasTag().findFirstSubTag(GenoaXmlTags.NAME) != null;
    }

    public void setName(String name) {
        this.name = name;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAliasTag().findFirstSubTag(GenoaXmlTags.NAME).getValue().setText(name));
        this.updateNodeText();
    }

    public String getTypeName() {
        return typeName;
    }

    public boolean hasTypeNameAttr() {
        return this.getAliasTag().getAttribute(GenoaXmlTags.ATTRIBUTE) != null;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAliasTag().getAttribute(GenoaXmlTags.TYPE_NAME).setValue(typeName));
    }

    public String getDescription() {
        return description;
    }

    public boolean hasDescriptionTag() {
        return this.getAliasTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION) != null;
    }

    public void setDescription(String description) {
        this.description = description;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAliasTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION).getValue().setText(description));
    }

    public String getComment() {
        return comment;
    }

    public boolean hasCommentTag() {
        return this.getAliasTag().findFirstSubTag(GenoaXmlTags.COMMENT) != null;
    }

    public void setComment(String comment) {
        this.comment = comment;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAliasTag().findFirstSubTag(GenoaXmlTags.COMMENT).getValue().setText(comment));
    }

    public String getTransient_() {
        return transient_;
    }

    public boolean hasTransientTag() {
        return this.getAliasTag().findFirstSubTag(GenoaXmlTags.TRANSIENT) != null;
    }

    public void setTransient_(String transient_) {
        this.transient_ = transient_;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAliasTag().findFirstSubTag(GenoaXmlTags.TRANSIENT).getValue().setText(transient_));
    }

    public String getSource() {
        return source;
    }

    public boolean hasSourceTag() {
        return this.getAliasTag().findFirstSubTag(GenoaXmlTags.SOURCE) != null;
    }

    public void setSource(String source) {
        this.source = source;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAliasTag().findFirstSubTag(GenoaXmlTags.SOURCE).getValue().setText(source));
    }

    public String getTarget() {
        return target;
    }

    public boolean hasTargetTag() {
        return this.getAliasTag().findFirstSubTag(GenoaXmlTags.TARGET) != null;
    }

    public void setTarget(String target) {
        this.target = target;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAliasTag().findFirstSubTag(GenoaXmlTags.TARGET).getValue().setText(target));
    }

    public String getAliasPropertyPath() {
        return aliasPropertyPath;
    }

    public boolean hasAliasPropertyPathTag() {
        return this.getAliasTag().findFirstSubTag(GenoaXmlTags.ALIAS_PROPERTY_PATH) != null;
    }

    public void setAliasPropertyPath(String aliasPropertyPath) {
        this.aliasPropertyPath = aliasPropertyPath;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAliasTag().findFirstSubTag(GenoaXmlTags.ALIAS_PROPERTY_PATH).getValue().setText(target));
    }

    public String getNodeText() {
        return nodeText;
    }

    public void updateNodeText() {
        this.nodeText = getName();
    }
}
