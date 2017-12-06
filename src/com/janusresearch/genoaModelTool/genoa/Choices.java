package com.janusresearch.genoaModelTool.genoa;

import com.intellij.psi.xml.XmlTag;

 public interface Choices {
     /**
      * Returns the XmlTag of the '<em><b>Choices -> Value</b></em>' element.
      * @return the XmlTag of the '<em>Choices -> Value</em>' element.
      */
     XmlTag getValueTag();

     /**
      * Returns the value of the '<em><b>Value</b></em>' element.
      * @return the value of the '<em>Value</em>' element.
      */
     String getName();

     /**
      * Sets the value of the '<em><b>Value</b></em>' element.
      * @param value the new value of the '<em>Value</em>' element.
      */
     void setName(String value);

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
