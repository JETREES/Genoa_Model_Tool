
package com.janusresearch.genoaModelTool.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RelationshipSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyPath" type="{}PropertyPath"/>
 *         &lt;element name="prototypeRef" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipSetting", propOrder = {
    "propertyPath",
    "prototypeRef"
})
public class RelationshipSetting {

    @XmlElement(required = true)
    protected PropertyPath propertyPath;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String prototypeRef;

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
     * Gets the value of the prototypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrototypeRef() {
        return prototypeRef;
    }

    /**
     * Sets the value of the prototypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrototypeRef(String value) {
        this.prototypeRef = value;
    }

}
