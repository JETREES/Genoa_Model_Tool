package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class ModelImpl implements Model {
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
