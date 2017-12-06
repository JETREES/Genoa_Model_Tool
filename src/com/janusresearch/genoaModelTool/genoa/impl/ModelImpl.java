package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.project.Project;
import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.dom.GenoaXmlTags;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class ModelImpl extends GenoaObject implements com.janusresearch.genoaModelTool.genoa.Model {
    private final Project project;
    private XmlTag modelTag;
    private String name = null;
    private String packageString = null;
    private String description = null;
    private String uri = null;
    private List<String> importList = new ArrayList<>();
    private List<EntityImpl> entityImplList = new ArrayList<>();
    private List<PrototypeImpl> prototypeImplList = new ArrayList<>();
    private List<BehaviorImpl> behaviorImplList = new ArrayList<>();

    public ModelImpl(Project project, XmlTag xmlTag) {
        this.modelTag = xmlTag;
        this.project = project;
        this.setName(xmlTag.getSubTagText(GenoaXmlTags.NAME));
        this.setPackageString(xmlTag.getSubTagText(GenoaXmlTags.PACKAGE_STRING));
        this.setDescription(xmlTag.getSubTagText(GenoaXmlTags.DESCRIPTION));
        this.setUri(xmlTag.getSubTagText(GenoaXmlTags.URI));
        this.setImportList();
        this.setType(GenoaXmlTags.MODEL);
    }

    public XmlTag getModelTag() {
        return modelTag;
    }

    public String getName() {
        return name;
    }

    public boolean hasNameTag() {
        return this.getModelTag().findFirstSubTag(GenoaXmlTags.NAME) != null;
    }

    public void setName(String name) {
        if (hasNameTag()) {
            this.name = name;
            WriteCommandAction.runWriteCommandAction(project, () -> {
                this.getModelTag().findFirstSubTag(GenoaXmlTags.NAME).getValue().setText(name);
            });
        }
    }

    public String getPackageString() {
        return packageString;
    }

    public boolean hasPackageStringTag() {
        return this.getModelTag().findFirstSubTag(GenoaXmlTags.PACKAGE_STRING) != null;
    }

    public void setPackageString(String packageString) {
        if (hasPackageStringTag()) {
            this.packageString = packageString;
            this.getModelTag().findFirstSubTag(GenoaXmlTags.PACKAGE_STRING).getValue().setText(packageString);
        }
    }

    public String getDescription() {
        return description;
    }

    public boolean hasDescriptionTag() {
        return this.getModelTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION) != null;
    }

    public void setDescription(String description) {
        if (hasDescriptionTag()) {
            this.description = description;
            this.getModelTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION).getValue().setText(description);
        }
    }

    public String getUri() {
        return uri;
    }

    public boolean hasUriTag() {
        return this.getModelTag().findFirstSubTag(GenoaXmlTags.URI) != null;
    }

    public void setUri(String uri) {
        if (hasUriTag()) {
            this.uri = uri;
            this.getModelTag().findFirstSubTag(GenoaXmlTags.URI).getValue().setText(uri);
        }
    }

    public List<String> getImportList() {
        return importList;
    }

    public void setImportList() {
        for (XmlTag x : getModelTag().findSubTags(GenoaXmlTags.IMPORT)) {
            if (x != null) {
                this.addImport(x.getValue().getText());
            }
        }
    }

    public void addImport(String import_) {
        this.importList.add(import_);
    }

    public List<EntityImpl> getEntityImplList() {
        return entityImplList;
    }

    public EntityImpl addEntity(XmlTag entityTag) {
        EntityImpl entityImpl = new EntityImpl(entityTag);
        this.getEntityImplList().add(entityImpl);
        return entityImpl;
    }

    public List<PrototypeImpl> getPrototypeImplList() {
        return prototypeImplList;
    }

    public PrototypeImpl addPrototype(XmlTag prototypeTag) {
        PrototypeImpl prototypeImpl = new PrototypeImpl(prototypeTag);
        this.getPrototypeImplList().add(prototypeImpl);
        return prototypeImpl;
    }

    public List<BehaviorImpl> getBehaviorImplList() {
        return behaviorImplList;
    }

    public BehaviorImpl addBehavior(XmlTag behaviorTag) {
        BehaviorImpl behaviorImpl = new BehaviorImpl(behaviorTag);
        this.getBehaviorImplList().add(behaviorImpl);
        return behaviorImpl;
    }
}
