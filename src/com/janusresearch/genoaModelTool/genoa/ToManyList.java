package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;

public interface ToManyList {

    /**
     * Returns the XmlTag of the '<em><b>To Many List</b></em>' element.
     * @return the XmlTag of the '<em>To Many List</em>' element.
     */
    XmlTag getToManyListTag();

    /**
     * Returns the value of the '<em><b>Name</b></em>' element.
     * @return the value of the '<em>Name</em>' element.
     */
    String getName();

    /**
     * Returns true/false for '<em><b>Name</b></em>' element not null.
     * @return true/false for '<em>Name</em>' element not null.
     */
    boolean hasNameTag();

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
     * Returns true/false for '<em><b>Description</b></em>' element not null.
     * @return true/false for '<em>Description</em>' element not null.
     */
    boolean hasDescriptionTag();

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
     * Returns true/false for '<em><b>Comment</b></em>' element not null.
     * @return true/false for '<em>Comment</em>' element not null.
     */
    boolean hasCommentTag();

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
     * Returns true/false for '<em><b>Transient</b></em>' element not null.
     * @return true/false for '<em>Transient</em>' element not null.
     */
    boolean hasTransientTag();

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
     * Returns true/false for '<em><b>Destination</b></em>' element not null.
     * @return true/false for '<em>Destination</em>' element not null.
     */
    boolean hasDestinationTag();

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
     * Returns true/false for '<em><b>Inverse Path</b></em>' element not null.
     * @return true/false for '<em>Inverse Path</em>' element not null.
     */
    boolean hasInversePathTag();

    /**
     * Sets the value of the '<em><b>Inverse Path</b></em>' element.
     * @param inversePath the new value of the '<em>Inverse Path</em>' element.
     */
    void setInversePath(String inversePath);

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
