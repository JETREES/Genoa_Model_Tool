
package com.janusresearch.genoaModelTool.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ToManyListSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToManyListSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propertyPath" type="{}PropertyPath"/>
 *         &lt;element name="prototypeRef" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToManyListSetting", propOrder = {
    "propertyPath",
    "prototypeRef"
})
public class ToManyListSetting {

    @XmlElement(required = true)
    protected PropertyPath propertyPath;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> prototypeRef;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prototypeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrototypeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrototypeRef() {
        if (prototypeRef == null) {
            prototypeRef = new ArrayList<String>();
        }
        return this.prototypeRef;
    }

}
