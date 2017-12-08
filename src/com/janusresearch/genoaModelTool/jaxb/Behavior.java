
package com.janusresearch.genoaModelTool.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Behavior complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Behavior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="factPattern" type="{}FactPattern" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="setProperty" type="{}SetProperty"/>
 *           &lt;element name="instantiation" type="{}Instantiation"/>
 *           &lt;element name="assignment" type="{}Assignment"/>
 *           &lt;element name="message" type="{}Message"/>
 *           &lt;element name="addToCollection" type="{}AddToCollection"/>
 *           &lt;element name="removeFromCollection" type="{}RemoveFromCollection"/>
 *           &lt;element name="retractBean" type="{}RetractBean"/>
 *           &lt;element name="clearCollection" type="{}ClearCollection"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="salience" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Behavior", propOrder = {
    "description",
    "comment",
    "factPattern",
    "setPropertyOrInstantiationOrAssignment"
})
public class Behavior {

    @XmlElement(required = true)
    protected String description;
    protected String comment;
    protected List<FactPattern> factPattern;
    @XmlElements({
        @XmlElement(name = "setProperty", type = SetProperty.class),
        @XmlElement(name = "instantiation", type = Instantiation.class),
        @XmlElement(name = "assignment", type = Assignment.class),
        @XmlElement(name = "message", type = Message.class),
        @XmlElement(name = "addToCollection", type = AddToCollection.class),
        @XmlElement(name = "removeFromCollection", type = RemoveFromCollection.class),
        @XmlElement(name = "retractBean", type = RetractBean.class),
        @XmlElement(name = "clearCollection", type = ClearCollection.class)
    })
    protected List<Object> setPropertyOrInstantiationOrAssignment;
    @XmlAttribute(name = "salience")
    protected BigInteger salience;

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
     * Gets the value of the factPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FactPattern }
     * 
     * 
     */
    public List<FactPattern> getFactPattern() {
        if (factPattern == null) {
            factPattern = new ArrayList<FactPattern>();
        }
        return this.factPattern;
    }

    /**
     * Gets the value of the setPropertyOrInstantiationOrAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setPropertyOrInstantiationOrAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetPropertyOrInstantiationOrAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetProperty }
     * {@link Instantiation }
     * {@link Assignment }
     * {@link Message }
     * {@link AddToCollection }
     * {@link RemoveFromCollection }
     * {@link RetractBean }
     * {@link ClearCollection }
     * 
     * 
     */
    public List<Object> getSetPropertyOrInstantiationOrAssignment() {
        if (setPropertyOrInstantiationOrAssignment == null) {
            setPropertyOrInstantiationOrAssignment = new ArrayList<Object>();
        }
        return this.setPropertyOrInstantiationOrAssignment;
    }

    /**
     * Gets the value of the salience property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSalience() {
        return salience;
    }

    /**
     * Sets the value of the salience property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSalience(BigInteger value) {
        this.salience = value;
    }

}
