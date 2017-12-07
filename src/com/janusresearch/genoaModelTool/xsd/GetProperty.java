
package com.janusresearch.genoaModelTool.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableRef" type="{}VariableRef"/>
 *         &lt;choice>
 *           &lt;element name="paramPropertyPath" type="{}ParamPropertyPath"/>
 *           &lt;element name="propertyPath" type="{}PropertyPath"/>
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
@XmlType(name = "GetProperty", propOrder = {
    "comment",
    "variableRef",
    "paramPropertyPath",
    "propertyPath"
})
public class GetProperty {

    protected String comment;
    @XmlElement(required = true)
    protected VariableRef variableRef;
    protected ParamPropertyPath paramPropertyPath;
    protected PropertyPath propertyPath;

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

}
