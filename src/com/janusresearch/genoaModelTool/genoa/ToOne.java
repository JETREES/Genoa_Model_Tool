package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;

public interface ToOne {
    /**
     * Returns the XmlTag of the '<em><b>ToOne</b></em>' element.
     * @return the XmlTag of the '<em>ToOne</em>' element.
     */
    XmlTag getToOneTag();

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
     * Returns the value of the '<em><b>Comment</b></em>' element.
     * @return the value of the '<em>Comment</em>' element.
     */
    String getComment();

    /**
     * Sets the value of the '<em><b>Comment</b></em>' element.
     * @param comment the new value of the '<em>Comment</em>' element.
     */
    void setComment(String comment);

    /**
     * Returns the value of the '<em><b>Transient</b></em>' element.
     * @return the value of the '<em>Transient</em>' element.
     */
    String getTransient_();

    /**
     * Sets the value of the '<em><b>Transient</b></em>' element.
     * @param transient_ the new value of the '<em>Transient</em>' element.
     */
    void setTransient_(String transient_);

    /**
     * Returns the value of the '<em><b>Destination</b></em>' element.
     * @return the value of the '<em>Destination</em>' element.
     */
    String getDestination();

    /**
     * Sets the value of the '<em><b>Destination</b></em>' element.
     * @param destination the new value of the '<em>Destination</em>' element.
     */
    void setDestination(String destination);

    /**
     * Returns the value of the '<em><b>Inverse Path</b></em>' element.
     * @return the value of the '<em>Inverse Path</em>' element.
     */
    String getInversePath();

    /**
     * Sets the value of the '<em><b>Inverse Path</b></em>' element.
     * @param inversePath the new value of the '<em>Inverse Path</em>' element.
     */
    void setInversePath(String inversePath);

    /**
     * Returns the value of the '<em><b>Auto</b></em>' element.
     * @return the value of the '<em>Auto</em>' element.
     */
    String getAuto();

    /**
     * Sets the value of the '<em><b>Auto</b></em>' element.
     * @param auto the new value of the '<em>Auto</em>' element.
     */
    void setAuto(String auto);

    /**
     * Returns the value of the '<em><b>Bindable</b></em>' element.
     * @return the value of the '<em>Bindable</em>' element.
     */
    String getBindable();

    /**
     * Sets the value of the '<em><b>Bindable</b></em>' element.
     * @param bindable the new value of the '<em>Bindable</em>' element.
     */
    void setBindable(String bindable);

    /**
     * Returns the value of the '<em><b>Node Text</b></em>' String.
     * @return the value of the '<em>Node Text</em>' element.
     */
    String getNodeText();

    /**
     * Updates the Node Text for the JTree node label
     */
    void updateNodeText();
}
