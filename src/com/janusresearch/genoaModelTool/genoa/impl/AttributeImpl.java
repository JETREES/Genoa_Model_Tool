package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.project.Project;
import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.dom.GenoaXmlTags;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class AttributeImpl extends GenoaObject implements com.janusresearch.genoaModelTool.genoa.Attribute {
    private final Project project;
    private XmlTag attrTag;
    private String name = null;
    private String typeName = null;
    private String nodeText = null;
    private String description = null;
    private String source = null;
    private String target = null;
    private List<ChoicesImpl> choicesImplList = new ArrayList<>();

    public AttributeImpl(Project project) {
        this.project = project;
        this.setType(GenoaXmlTags.ATTRIBUTE);
        this.setName("Attribute");
        this.setTypeName("String");
        updateNodeText();
    }

    AttributeImpl(Project project, XmlTag xmlTag) {
        this.project = project;
        this.setType(GenoaXmlTags.ATTRIBUTE);
        this.attrTag = xmlTag;
        if (hasNameTag()) {
            this.setName(xmlTag.getSubTagText(GenoaXmlTags.NAME));
        }
        if (hasTypeNameAttr()) {
            this.setTypeName(xmlTag.getAttribute(GenoaXmlTags.TYPE_NAME).getValue());
        }
        if (hasDescriptionTag()) {
            this.setDescription(xmlTag.getSubTagText(GenoaXmlTags.DESCRIPTION));
        }
        if (hasSourceTag()) {
            this.setSource(xmlTag.getSubTagText(GenoaXmlTags.SOURCE));
        }
        if (hasTargetTag()) {
            this.setTarget(xmlTag.getSubTagText(GenoaXmlTags.TARGET));
        }
        updateNodeText();
    }

    public XmlTag getAttrTag() {
        return attrTag;
    }

    public String getName() {
        return name;
    }

    public boolean hasNameTag() {
        return this.getAttrTag().findFirstSubTag(GenoaXmlTags.NAME) != null;
    }

    public void setName(String name) {
        this.name = name;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAttrTag().findFirstSubTag(GenoaXmlTags.NAME).getValue().setText(name));
        this.updateNodeText();
    }

    public String getTypeName() {
        return typeName;
    }

    public boolean hasTypeNameAttr() {
        return this.getAttrTag().getAttribute(GenoaXmlTags.ATTRIBUTE) != null;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAttrTag().getAttribute(GenoaXmlTags.TYPE_NAME).setValue(typeName));
    }

    public String getNodeText() {
        return nodeText;
    }

    public void updateNodeText() {
        this.nodeText = getName();
    }

    public String getDescription() {
        return description;
    }

    public boolean hasDescriptionTag() {
        return this.getAttrTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION) != null;
    }

    public void setDescription(String description) {
        this.description = description;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAttrTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION).getValue().setText(description));
    }

    public String getSource() {
        return source;
    }

    public boolean hasSourceTag() {
        return this.getAttrTag().findFirstSubTag(GenoaXmlTags.SOURCE) != null;
    }

    public void setSource(String source) {
        this.source = source;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAttrTag().findFirstSubTag(GenoaXmlTags.SOURCE).getValue().setText(source));
    }

    public String getTarget() {
        return target;
    }

    public boolean hasTargetTag() {
        return this.getAttrTag().findFirstSubTag(GenoaXmlTags.TARGET) != null;
    }

    public void setTarget(String target) {
        this.target = target;
        WriteCommandAction.runWriteCommandAction(project, () -> this.getAttrTag().findFirstSubTag(GenoaXmlTags.TARGET).getValue().setText(target));
    }

    public List<ChoicesImpl> getChoicesImplList() {
        return choicesImplList;
    }

    public ChoicesImpl addChoice(XmlTag value) {
        ChoicesImpl choice = new ChoicesImpl(project, value);
        this.getChoicesImplList().add(choice);
        return choice;
    }
}
