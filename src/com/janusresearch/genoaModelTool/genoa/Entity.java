package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.genoa.impl.AttributeImpl;
import com.janusresearch.genoaModelTool.genoa.impl.ToOneImpl;

import java.util.List;

public interface Entity {
    /**
     * Returns the XmlTag of the '<em><b>EntityImpl</b></em>' element.
     * @return the XmlTag of the '<em>EntityImpl</em>' element.
     */
    XmlTag getEntityTag();

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
     * Returns the value of the '<em><b>Super EntityImpl Name</b></em>' element.
     * @return the value of the '<em>Super EntityImpl Name</em>' element.
     */
    String getSuperEntityName();

    /**
     * Sets the value of the '<em><b>Super EntityImpl Name</b></em>' element.
     * @param superEntityName the new value of the '<em>Super EntityImpl Name</em>' element.
     */
    void setSuperEntityName(String superEntityName);

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
     * Returns the value of the '<em><b>Node Text</b></em>' String.
     * @return the value of the '<em>Node Text</em>' element.
     */
    String getNodeText();

    /**
     * Updates the Node Text for the JTree node label
     */
    void updateNodeText();

    /**
     * Returns the value of the '<em><b>Abstract</b></em>' element.
     * @return the value of the '<em>Abstract</em>' element.
     */
    String getAbstract_();

    /**
     * Sets the value of the '<em><b>Abstract</b></em>' element.
     * @param abstract_ the new value of the '<em>Abstract</em>' element.
     */
    void setAbstract_(String abstract_);

    /**
     * Returns the list of the '<em><b>AttributeImpl</b></em>' objects for an EntityImpl.
     * @return the list of the '<em>AttributeImpl</em>' objects for an EntityImpl.
     */
    List<AttributeImpl> getAttributeImplList();

    /**
     * Adds the '<em><b>AttributeImpl</b></em>' object to the AttributeImpl List and then returns the object
     * @param attrTag the XmlTag for the current AttributeImpl
     * @return the '<em>AttributeImpl</em>' object for the created AttributeImpl
     */
    AttributeImpl addAttribute(XmlTag attrTag);

    /**
     * Returns the list of the '<em><b>ToOne</b></em>' objects for an EntityImpl.
     * @return the list of the '<em>ToOne</em>' objects for an EntityImpl.
     */
    List<ToOneImpl> getToOneImplList();

    /**
     * Adds the '<em><b>ToOne</b></em>' object to the ToOne List and then returns the object
     * @param toOneTag the XmlTag for the current ToOne
     * @return the '<em>ToOne</em>' object for the created ToOne
     */
    ToOneImpl addToOne(XmlTag toOneTag);
}
