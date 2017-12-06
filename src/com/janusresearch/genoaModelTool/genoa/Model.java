package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.genoa.impl.BehaviorImpl;
import com.janusresearch.genoaModelTool.genoa.impl.EntityImpl;
import com.janusresearch.genoaModelTool.genoa.impl.PrototypeImpl;

import java.util.List;

public interface Model {
    /**
     * Returns the XmlTag of the '<em><b>Model</b></em>' element.
     * @return the XmlTag of the '<em>Model</em>' element.
     */
    XmlTag getModelTag();

    /**
     * Returns the value of the '<em><b>Name</b></em>' element.
     * @return the value of the '<em>Name</em>' element.
     */
    String getName();

    /**
     * Sets the value of the '<em><b>Name</b></em>' element.
     * @param name the new value of the '<em>Name</em>' element.
     */
    void setName(String name);

    /**
     * Returns the value of the '<em><b>Package String</b></em>' element.
     * @return the value of the '<em>Package String</em>' element.
     */
    String getPackageString();

    /**
     * Sets the value of the '<em><b>Package String</b></em>' element.
     * @param packageString the new value of the '<em>Package String</em>' element.
     */
    void setPackageString(String packageString);

    /**
     * Returns the value of the '<em><b>Description</b></em>' element.
     * @return the value of the '<em>Description</em>' element.
     */
    String getDescription();

    /**
     * Sets the value of the '<em><b>Description</b></em>' element.
     * @param description the new value of the '<em>Description</em>' element.
     */
    void setDescription(String description);

    /**
     * Returns the value of the '<em><b>Uri</b></em>' element.
     * @return the value of the '<em>Uri</em>' element.
     */
    String getUri();

    /**
     * Sets the value of the '<em><b>Uri</b></em>' element.
     * @param uri the new value of the '<em>Uri</em>' element.
     */
    void setUri(String uri);

    /**
     * Returns the list of the '<em><b>Import</b></em>' elements.
     * @return the list of the '<em>Import</em>' elements.
     */
    List<String> getImportList();

    /**
     * Sets the '<em><b>Import list</b></em>' when a model is first created
     * @see #addImport(String)
     */
    void setImportList();

    /**
     * Adds a new '<em><b>Import</b></em>' to the Import List
     * @param import_ the value of the '<em>Import</em>' to be added
     */
    void addImport(String import_);

    /**
     * Returns the list of the '<em><b>Entity</b></em>' objects for a model.
     * @return the list of the '<em>Entity</em>' objects for a model.
     */
    List<EntityImpl> getEntityImplList();

    /**
     * Adds the '<em><b>Entity</b></em>' object to the Entity List and then returns the object
     * @param entityTag the XmlTag for the current Entity
     * @return the '<em>Entity</em>' object for the created Entity
     */
    EntityImpl addEntity(XmlTag entityTag);

    /**
     * Returns the list of the '<em><b>Prototype</b></em>' objects for a model.
     * @return the list of the '<em>Prototype</em>' objects for a model.
     */
    List<PrototypeImpl> getPrototypeImplList();

    /**
     * Adds the '<em><b>Prototype</b></em>' object to the Prototype List and then returns the object
     * @param prototypeTag the XmlTag for the current Prototype
     * @return the '<em>Prototype</em>' object for the created Prototype
     */
    PrototypeImpl addPrototype(XmlTag prototypeTag);

    /**
     * Returns the list of the '<em><b>Behavior</b></em>' objects for a model.
     * @return the list of the '<em>Behavior</em>' objects for a model.
     */
    List<BehaviorImpl> getBehaviorImplList();

    /**
     * Adds the '<em><b>Behavior</b></em>' object to the Behavior List and then returns the object
     * @param behaviorTag the XmlTag for the current Behavior
     * @return the '<em>Behavior</em>' object for the created Behavior
     */
    BehaviorImpl addBehavior(XmlTag behaviorTag);
}
