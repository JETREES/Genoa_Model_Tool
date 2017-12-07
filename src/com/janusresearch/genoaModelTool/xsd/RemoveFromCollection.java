
package com.janusresearch.genoaModelTool.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveFromCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveFromCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableRef1" type="{}VariableRef1"/>
 *         &lt;choice>
 *           &lt;element name="paramPropertyPath" type="{}ParamPropertyPath"/>
 *           &lt;element name="propertyPath" type="{}PropertyPath"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="getProperty" type="{}GetProperty"/>
 *           &lt;element name="clause" type="{}Clause"/>
 *           &lt;element name="variableRef" type="{}VariableRef"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveFromCollection", propOrder = {
    "comment",
    "variableRef1",
    "paramPropertyPath",
    "propertyPath",
    "getProperty",
    "clause",
    "variableRef"
})
public class RemoveFromCollection {

    protected String comment;
    @XmlElement(required = true)
    protected VariableRef1 variableRef1;
    protected ParamPropertyPath paramPropertyPath;
    protected PropertyPath propertyPath;
    protected GetProperty getProperty;
    protected Clause clause;
    protected VariableRef variableRef;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the variableRef1 property.
     * 
     * @return
     *     possible object is
     *     {@link VariableRef1 }
     *     
     */
    public VariableRef1 getVariableRef1() {
        return variableRef1;
    }

    /**
     * Sets the value of the variableRef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableRef1 }
     *     
     */
    public void setVariableRef1(VariableRef1 value) {
        this.variableRef1 = value;
    }

    /**
     * Gets the value of the paramPropertyPath property.
     * 
     * @return
     *     possible object is
     *     {@link ParamPropertyPath }
     *     
     */
    public ParamPropertyPath getParamPropertyPath() {
        return paramPropertyPath;
    }

    /**
     * Sets the value of the paramPropertyPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamPropertyPath }
     *     
     */
    public void setParamPropertyPath(ParamPropertyPath value) {
        this.paramPropertyPath = value;
    }

    /**
     * Gets the value of the propertyPath property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyPath }
     *     
     */
    public PropertyPath getPropertyPath() {
        return propertyPath;
    }

    /**
     * Sets the value of the propertyPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyPath }
     *     
     */
    public void setPropertyPath(PropertyPath value) {
        this.propertyPath = value;
    }

    /**
     * Gets the value of the getProperty property.
     * 
     * @return
     *     possible object is
     *     {@link GetProperty }
     *     
     */
    public GetProperty getGetProperty() {
        return getProperty;
    }

    /**
     * Sets the value of the getProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProperty }
     *     
     */
    public void setGetProperty(GetProperty value) {
        this.getProperty = value;
    }

    /**
     * Gets the value of the clause property.
     * 
     * @return
     *     possible object is
     *     {@link Clause }
     *     
     */
    public Clause getClause() {
        return clause;
    }

    /**
     * Sets the value of the clause property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clause }
     *     
     */
    public void setClause(Clause value) {
        this.clause = value;
    }

    /**
     * Gets the value of the variableRef property.
     * 
     * @return
     *     possible object is
     *     {@link VariableRef }
     *     
     */
    public VariableRef getVariableRef() {
        return variableRef;
    }

    /**
     * Sets the value of the variableRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableRef }
     *     
     */
    public void setVariableRef(VariableRef value) {
        this.variableRef = value;
    }

}
