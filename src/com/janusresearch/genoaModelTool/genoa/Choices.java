package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;

public class Choices {
    private XmlTag valueTag;
    private String name = "";
    private String choiceNodeText = "";

    public Choices() {
        this.setName("Choice");
        updateChoiceNodeText();
    }

    public Choices(XmlTag value) {
        this.valueTag = value;
        this.setName(value.getText());
        updateChoiceNodeText();
    }

    public XmlTag getValueTag() {
        return valueTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.getValueTag().getValue().setText(name);
        this.updateChoiceNodeText();
    }

    public String getChoiceNodeText() {
        return choiceNodeText;
    }

    private void updateChoiceNodeText() {
        this.choiceNodeText = getName();
    }
}
