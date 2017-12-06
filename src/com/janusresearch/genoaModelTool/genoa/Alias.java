package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;

public interface Alias {
    /**
     * Returns the XmlTag of the '<em><b>Alias</b></em>' element.
     * @return the XmlTag of the '<em>Alias</em>' element.
     */
    XmlTag getAliasTag();

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
     * Returns the value of the '<em><b>Type Name</b></em>' element.
     * @return the value of the '<em>Type Name</em>' element.
     */
    String getTypeName();

    /**
     * Returns true/false for '<em><b>Type Name</b></em>' attribute not null.
     * @return true/false for '<em>Type Name</em>' attribute not null.
     */
    boolean hasTypeNameAttr();

    /**
     * Sets the value of the '<em><b>Type Name</b></em>' element.
     * @param typeName the new value of the '<em>Type Name</em>' element.
     */
    void setTypeName(String typeName);

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
     * Returns the value of the '<em><b>Source</b></em>' element.
     * @return the value of the '<em>Source</em>' element.
     */
    String getSource();

    /**
     * Returns true/false for '<em><b>Source</b></em>' element not null.
     * @return true/false for '<em>Source</em>' element not null.
     */
    boolean hasSourceTag();

    /**
     * Sets the value of the '<em><b>Source</b></em>' element.
     * @param source the new value of the '<em>Source</em>' element.
     */
    void setSource(String source);

    /**
     * Returns the value of the '<em><b>Target</b></em>' element.
     * @return the value of the '<em>Target</em>' element.
     */
    String getTarget();

    /**
     * Returns true/false for '<em><b>Target</b></em>' element not null.
     * @return true/false for '<em>Target</em>' element not null.
     */
    boolean hasTargetTag();

    /**
     * Sets the value of the '<em><b>Target</b></em>' element.
     * @param target the new value of the '<em>Target</em>' element.
     */
    void setTarget(String target);

    /**
     * Returns the value of the '<em><b>Alias Property Path</b></em>' element.
     * @return the value of the '<em>Alias Property Path</em>' element.
     */
    String getAliasPropertyPath();

    /**
     * Returns true/false for '<em><b>Alias Property Path</b></em>' element not null.
     * @return true/false for '<em>Alias Property Path</em>' element not null.
     */
    boolean hasAliasPropertyPathTag();

    /**
     * Sets the value of the '<em><b>Alias Property Path</b></em>' element.
     * @param aliasPropertyPath the new value of the '<em>Alias Property Path</em>' element.
     */
    void setAliasPropertyPath(String aliasPropertyPath);

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
