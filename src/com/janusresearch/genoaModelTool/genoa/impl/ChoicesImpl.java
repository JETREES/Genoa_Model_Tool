package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.project.Project;
import com.intellij.psi.xml.XmlTag;

public class ChoicesImpl extends GenoaObject implements com.janusresearch.genoaModelTool.genoa.Choices {
    private final Project project;
    private XmlTag valueTag;
    private String value = null;
    private String nodeText = null;

    public ChoicesImpl(Project project) {
        this.project = project;
        this.setName("Choice");
        updateNodeText();
    }

    ChoicesImpl(Project project, XmlTag value) {
        this.project = project;
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
        WriteCommandAction.runWriteCommandAction(project, () -> this.getValueTag().getValue().setText(value));
        this.updateNodeText();
    }

    public String getNodeText() {
        return nodeText;
    }

    public void updateNodeText() {
        this.nodeText = getName();
    }

}
