
package com.janusresearch.genoaModelTool.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *               &lt;pattern value="[A-Z][_a-zA-Z0-9]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="superEntityName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;pattern value="\s*|[A-Z][_a-zA-Z0-9]*([.][_a-zA-Z0-9]+)*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="attr" type="{}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="toOne" type="{}ToOne" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="toMany" type="{}ToMany" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="toManyMap" type="{}ToManyMap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="toManyList" type="{}ToManyList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alias" type="{}Alias" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", propOrder = {
    "name",
    "description",
    "comment",
    "_abstract",
    "superEntityName",
    "attr",
    "toOne",
    "toMany",
    "toManyMap",
    "toManyList",
    "alias"
})
public class Entity {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String name;
    protected String description;
    protected String comment;
    @XmlElement(name = "abstract")
    protected Boolean _abstract;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String superEntityName;
    protected List<Attribute> attr;
    protected List<ToOne> toOne;
    protected List<ToMany> toMany;
    protected List<ToManyMap> toManyMap;
    protected List<ToManyList> toManyList;
    protected List<Alias> alias;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

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
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbstract(Boolean value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the superEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperEntityName() {
        return superEntityName;
    }

    /**
     * Sets the value of the superEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperEntityName(String value) {
        this.superEntityName = value;
    }

    /**
     * Gets the value of the attr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * 
     * 
     */
    public List<Attribute> getAttr() {
        if (attr == null) {
            attr = new ArrayList<Attribute>();
        }
        return this.attr;
    }

    /**
     * Gets the value of the toOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToOne }
     * 
     * 
     */
    public List<ToOne> getToOne() {
        if (toOne == null) {
            toOne = new ArrayList<ToOne>();
        }
        return this.toOne;
    }

    /**
     * Gets the value of the toMany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toMany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToMany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToMany }
     * 
     * 
     */
    public List<ToMany> getToMany() {
        if (toMany == null) {
            toMany = new ArrayList<ToMany>();
        }
        return this.toMany;
    }

    /**
     * Gets the value of the toManyMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toManyMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToManyMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToManyMap }
     * 
     * 
     */
    public List<ToManyMap> getToManyMap() {
        if (toManyMap == null) {
            toManyMap = new ArrayList<ToManyMap>();
        }
        return this.toManyMap;
    }

    /**
     * Gets the value of the toManyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toManyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToManyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToManyList }
     * 
     * 
     */
    public List<ToManyList> getToManyList() {
        if (toManyList == null) {
            toManyList = new ArrayList<ToManyList>();
        }
        return this.toManyList;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alias }
     * 
     * 
     */
    public List<Alias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<Alias>();
        }
        return this.alias;
    }

}
