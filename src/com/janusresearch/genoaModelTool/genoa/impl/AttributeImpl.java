package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.dom.GenoaXmlTags;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class AttributeImpl extends GenoaObject implements com.janusresearch.genoaModelTool.genoa.Attribute {
    private XmlTag attrTag;
    private String name = "";
    private String typeName = "";
    private String nodeText = "";
    private String description = "";
    private String source = "";
    private String target = "";
    private List<ChoicesImpl> choicesImplList = new ArrayList<>();

    public AttributeImpl() {
        this.setName("Attribute");
        this.setTypeName("String");
        updateNodeText();
    }

    public AttributeImpl(XmlTag xmlTag) {
        this.attrTag = xmlTag;
        this.setName(xmlTag.getSubTagText(GenoaXmlTags.NAME));
        this.setTypeName(xmlTag.getAttribute(GenoaXmlTags.TYPE_NAME).getValue());
        this.setDescription(xmlTag.getSubTagText(GenoaXmlTags.DESCRIPTION));
        this.setSource(xmlTag.getSubTagText(GenoaXmlTags.SOURCE));
        this.setTarget(xmlTag.getSubTagText(GenoaXmlTags.TARGET));
        updateNodeText();
    }

    public XmlTag getAttrTag() {
        return attrTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.getAttrTag().findFirstSubTag(GenoaXmlTags.NAME).getValue().setText(name);
        this.updateNodeText();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
        this.getAttrTag().setAttribute(GenoaXmlTags.TYPE_NAME, typeName);
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

    public void setDescription(String description) {
        this.description = description;
        this.getAttrTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION).getValue().setText(description);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
        this.getAttrTag().findFirstSubTag(GenoaXmlTags.SOURCE).getValue().setText(source);
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
        this.getAttrTag().findFirstSubTag(GenoaXmlTags.TARGET).getValue().setText(target);
    }

    public List<ChoicesImpl> getChoicesImplList() {
        return choicesImplList;
    }

    public ChoicesImpl addChoice(XmlTag value) {
        ChoicesImpl choice = new ChoicesImpl(value);
        this.getChoicesImplList().add(choice);
        return choice;
    }
}
