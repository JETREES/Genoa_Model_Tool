
package com.janusresearch.genoaModelTool.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Prototype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prototype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;pattern value="[A-Z][_a-zA-Z0-9]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="entityName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;pattern value="[A-Z][_a-zA-Z0-9]*([.][_a-zA-Z0-9]+)*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="singleton" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="attributeSetting" type="{}AttributeSetting"/>
 *           &lt;element name="relationshipSetting" type="{}RelationshipSetting"/>
 *           &lt;element name="toManySetting" type="{}ToManySetting"/>
 *           &lt;element name="toManyListSetting" type="{}ToManyListSetting"/>
 *           &lt;element name="propertyPathSetting" type="{}PropertyPathSetting"/>
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
@XmlType(name = "Prototype", propOrder = {
    "name",
    "entityName",
    "singleton",
    "attributeSettingOrRelationshipSettingOrToManySetting"
})
public class Prototype {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String entityName;
    protected Boolean singleton;
    @XmlElements({
        @XmlElement(name = "attributeSetting", type = AttributeSetting.class),
        @XmlElement(name = "relationshipSetting", type = RelationshipSetting.class),
        @XmlElement(name = "toManySetting", type = ToManySetting.class),
        @XmlElement(name = "toManyListSetting", type = ToManyListSetting.class),
        @XmlElement(name = "propertyPathSetting", type = PropertyPathSetting.class)
    })
    protected List<Object> attributeSettingOrRelationshipSettingOrToManySetting;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the singleton property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSingleton() {
        return singleton;
    }

    /**
     * Sets the value of the singleton property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleton(Boolean value) {
        this.singleton = value;
    }

    /**
     * Gets the value of the attributeSettingOrRelationshipSettingOrToManySetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeSettingOrRelationshipSettingOrToManySetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeSettingOrRelationshipSettingOrToManySetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeSetting }
     * {@link RelationshipSetting }
     * {@link ToManySetting }
     * {@link ToManyListSetting }
     * {@link PropertyPathSetting }
     * 
     * 
     */
    public List<Object> getAttributeSettingOrRelationshipSettingOrToManySetting() {
        if (attributeSettingOrRelationshipSettingOrToManySetting == null) {
            attributeSettingOrRelationshipSettingOrToManySetting = new ArrayList<Object>();
        }
        return this.attributeSettingOrRelationshipSettingOrToManySetting;
    }

}
