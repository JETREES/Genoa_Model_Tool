
package com.janusresearch.genoaModelTool.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyBinding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="entityVariable" type="{}EntityVariable"/>
 *           &lt;element name="variable" type="{}SimpleVariable"/>
 *         &lt;/choice>
 *         &lt;element name="propertyPath" type="{}PropertyPath"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyBinding", propOrder = {
    "entityVariable",
    "variable",
    "propertyPath"
})
public class PropertyBinding {

    protected EntityVariable entityVariable;
    protected SimpleVariable variable;
    @XmlElement(required = true)
    protected PropertyPath propertyPath;

    /**
     * Gets the value of the entityVariable property.
     * 
     * @return
     *     possible object is
     *     {@link EntityVariable }
     *     
     */
    public EntityVariable getEntityVariable() {
        return entityVariable;
    }

    /**
     * Sets the value of the entityVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityVariable }
     *     
     */
    public void setEntityVariable(EntityVariable value) {
        this.entityVariable = value;
    }

    /**
     * Gets the value of the variable property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleVariable }
     *     
     */
    public SimpleVariable getVariable() {
        return variable;
    }

    /**
     * Sets the value of the variable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleVariable }
     *     
     */
    public void setVariable(SimpleVariable value) {
        this.variable = value;
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
