package com.janusresearch.genoaModelTool.genoa.impl;

import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.dom.GenoaXmlTags;
import com.janusresearch.genoaModelTool.genoa.Model;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class ModelImpl extends GenoaObjectImpl implements Model {
    private XmlTag modelTag;
    private String name = "";
    private String packageString = "";
    private String description = "";
    private String uri = "";
    private List<String> importList = new ArrayList<>();
    private List<EntityImpl> entityImplList = new ArrayList<>();
    private List<PrototypeImpl> prototypeImplList = new ArrayList<>();
    private List<BehaviorImpl> behaviorImplList = new ArrayList<>();

    public ModelImpl(XmlTag xmlTag) {
        this.modelTag = xmlTag;
        this.setName(xmlTag.getSubTagText(GenoaXmlTags.NAME));
        this.setPackageString(xmlTag.getSubTagText(GenoaXmlTags.PACKAGE_STRING));
        this.setDescription(xmlTag.getSubTagText(GenoaXmlTags.DESCRIPTION));
        this.setUri(xmlTag.getSubTagText(GenoaXmlTags.URI));
        this.setImportList();
    }

    public XmlTag getModelTag() {
        return modelTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.getModelTag().findFirstSubTag(GenoaXmlTags.NAME).getValue().setText(name);
    }

    public String getPackageString() {
        return packageString;
    }

    public void setPackageString(String packageString) {
        this.packageString = packageString;
        this.getModelTag().findFirstSubTag(GenoaXmlTags.PACKAGE_STRING).getValue().setText(packageString);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.getModelTag().findFirstSubTag(GenoaXmlTags.DESCRIPTION).getValue().setText(description);
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
        this.getModelTag().findFirstSubTag(GenoaXmlTags.URI).getValue().setText(uri);
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
