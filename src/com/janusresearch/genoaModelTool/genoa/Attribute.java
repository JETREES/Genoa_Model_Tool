package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;
import com.janusresearch.genoaModelTool.genoa.impl.ChoicesImpl;

import java.util.List;

public interface Attribute {
    /**
     * Returns the XmlTag of the '<em><b>Attr</b></em>' element.
     * @return the XmlTag of the '<em>Attr</em>' element.
     */
    XmlTag getAttrTag();

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
     * Returns the value of the '<em><b>Type Name</b></em>' element.
     * @return the value of the '<em>Type Name</em>' element.
     */
    String getTypeName();

    /**
     * Sets the value of the '<em><b>Type Name</b></em>' element.
     * @param typeName the new value of the '<em>Type Name</em>' element.
     */
    void setTypeName(String typeName);

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
     * Returns the value of the '<em><b>Source</b></em>' element.
     * @return the value of the '<em>Source</em>' element.
     */
    String getSource();

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
     * Sets the value of the '<em><b>Target</b></em>' element.
     * @param target the new value of the '<em>Target</em>' element.
     */
    void setTarget(String target);

    /**
     * Returns the list of the '<em><b>ChoicesImpl</b></em>' objects for an EntityImpl.
     * @return the list of the '<em>ChoicesImpl</em>' objects for an EntityImpl.
     */
    List<ChoicesImpl> getChoicesImplList();

    /**
     * Adds the '<em><b>ChoicesImpl</b></em>' object to the ChoicesImpl List and then returns the object
     * @param value the XmlTag for the current ChoicesImpl
     * @return the '<em>ChoicesImpl</em>' object for the created ChoicesImpl
     */
    ChoicesImpl addChoice(XmlTag value);
}
