package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.genoa.Choices;

public class ChoicesImpl extends GenoaObjectImpl implements Choices{
    private XmlTag valueTag;
    private String value = "";
    private String nodeText = "";

    public ChoicesImpl() {
        this.setName("Choice");
        updateNodeText();
    }

    public ChoicesImpl(XmlTag value) {
        this.valueTag = value;
        this.setName(value.getText());
        updateNodeText();
    }

    public XmlTag getValueTag() {
        return valueTag;
    }

    public String getName() {
        return value;
    }

    public void setName(String value) {
        this.value = value;
        this.getValueTag().getValue().setText(value);
        this.updateNodeText();
    }

    public String getNodeText() {
        return nodeText;
    }

    public void updateNodeText() {
        this.nodeText = getName();
    }

}
