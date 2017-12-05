package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class Model {
    private XmlTag modelTag;
    private String name = "";
    private String packageString = "";
    private String description = "";
    private String uri = "";
    private List<String> importList = new ArrayList<>();
    private List<Entity> entityList = new ArrayList<>();
    private List<Prototype> prototypeList = new ArrayList<>();
    private List<Behavior> behaviorList = new ArrayList<>();

    public Model(XmlTag xmlTag) {
        this.modelTag = xmlTag;
        this.name = xmlTag.getSubTagText("name");
        this.packageString = xmlTag.getSubTagText("packageString");
        this.description = xmlTag.getSubTagText("description");
        this.uri = xmlTag.getSubTagText("uri");
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
        this.getModelTag().findFirstSubTag("name").getValue().setText(name);
    }

    public String getPackageString() {
        return packageString;
    }

    public void setPackageString(String packageString) {
        this.packageString = packageString;
        this.getModelTag().findFirstSubTag("packageString").getValue().setText(packageString);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.getModelTag().findFirstSubTag("description").getValue().setText(description);
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
        this.getModelTag().findFirstSubTag("uri").getValue().setText(uri);
    }

    public List<String> getImportList() {
        return importList;
    }

    public void setImportList() {
        for (XmlTag x : getModelTag().findSubTags("import")) {
            this.importList.add(x.getValue().getText());
        }
    }

    public void addImport(String import_) {
        this.importList.add(import_);
    }

    public List<Entity> getEntityList() {
        return entityList;
    }

    public Entity addEntity(XmlTag entityTag) {
        Entity entity = new Entity(entityTag);
        this.getEntityList().add(entity);
        return entity;
    }

    public List<Prototype> getPrototypeList() {
        return prototypeList;
    }

    public Prototype addPrototype(XmlTag prototypeTag) {
        Prototype prototype = new Prototype(prototypeTag);
        this.getPrototypeList().add(prototype);
        return prototype;
    }

    public List<Behavior> getBehaviorList() {
        return behaviorList;
    }

    public Behavior addBehavior(XmlTag behaviorTag) {
        Behavior behavior = new Behavior(behaviorTag);
        this.getBehaviorList().add(behavior);
        return behavior;
    }
}
