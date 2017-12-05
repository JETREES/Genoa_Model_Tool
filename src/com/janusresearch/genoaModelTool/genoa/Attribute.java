package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class Attribute {
    private XmlTag attrTag;
    private String name = "";
    private String typeName = "";
    private String nodeText = "";
    private String description = "";
    private String source = "";
    private String target = "";
    private List<Choices> choicesList = new ArrayList<>();

    public Attribute() {
        this.setName("Attribute");
        this.setTypeName("String");
        updateAttrNodeText();
    }

    public Attribute(XmlTag xmlTag) {
        this.attrTag = xmlTag;
        this.setName(xmlTag.getSubTagText("name"));
        this.setTypeName(xmlTag.getAttribute("typeName").getValue());
        this.setDescription(xmlTag.getSubTagText("description"));
        this.setSource(xmlTag.getSubTagText("source"));
        this.setTarget(xmlTag.getSubTagText("target"));
        updateAttrNodeText();
    }

    public XmlTag getAttrTag() {
        return attrTag;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
        this.getAttrTag().findFirstSubTag("name").getValue().setText(name);
        this.updateAttrNodeText();
    }

    public String getTypeName() {
        return typeName;
    }

    private void setTypeName(String typeName) {
        this.typeName = typeName;
        this.getAttrTag().setAttribute("typeName", typeName);
    }

    public String getNodeText() {
        return nodeText;
    }

    private void updateAttrNodeText() {
        this.nodeText = getName();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.getAttrTag().findFirstSubTag("description").getValue().setText(description);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
        this.getAttrTag().findFirstSubTag("source").getValue().setText(source);
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
        this.getAttrTag().findFirstSubTag("target").getValue().setText(target);
    }

    public List<Choices> getChoicesList() {
        return choicesList;
    }

    public Choices addChoice(XmlTag value) {
        Choices choice = new Choices(value);
        this.getChoicesList().add(choice);
        return choice;
    }
}
