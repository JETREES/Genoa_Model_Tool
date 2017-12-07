
package com.janusresearch.genoaModelTool.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="paramPropertyPath" type="{}ParamPropertyPath"/>
 *           &lt;element name="getProperty" type="{}GetProperty"/>
 *           &lt;element name="clause" type="{}Clause"/>
 *           &lt;element name="literal" type="{}Literal"/>
 *           &lt;element name="variableRef" type="{}VariableRef"/>
 *           &lt;element name="propertyPath" type="{}PropertyPath"/>
 *           &lt;element name="null" type="{}Null"/>
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
@XmlType(name = "Message", propOrder = {
    "comment",
    "paramPropertyPathOrGetPropertyOrClause"
})
public class Message {

    protected String comment;
    @XmlElements({
        @XmlElement(name = "paramPropertyPath", type = ParamPropertyPath.class),
        @XmlElement(name = "getProperty", type = GetProperty.class),
        @XmlElement(name = "clause", type = Clause.class),
        @XmlElement(name = "literal", type = Literal.class),
        @XmlElement(name = "variableRef", type = VariableRef.class),
        @XmlElement(name = "propertyPath", type = PropertyPath.class),
        @XmlElement(name = "null", type = Null.class)
    })
    protected List<Object> paramPropertyPathOrGetPropertyOrClause;

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
     * Gets the value of the paramPropertyPathOrGetPropertyOrClause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramPropertyPathOrGetPropertyOrClause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamPropertyPathOrGetPropertyOrClause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamPropertyPath }
     * {@link GetProperty }
     * {@link Clause }
     * {@link Literal }
     * {@link VariableRef }
     * {@link PropertyPath }
     * {@link Null }
     * 
     * 
     */
    public List<Object> getParamPropertyPathOrGetPropertyOrClause() {
        if (paramPropertyPathOrGetPropertyOrClause == null) {
            paramPropertyPathOrGetPropertyOrClause = new ArrayList<Object>();
        }
        return this.paramPropertyPathOrGetPropertyOrClause;
    }

}
