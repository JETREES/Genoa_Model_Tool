
package com.janusresearch.genoaModelTool.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Clause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Clause">
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
 *       &lt;attribute name="operator" default="eq">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="eq"/>
 *             &lt;enumeration value="neq"/>
 *             &lt;enumeration value="gt"/>
 *             &lt;enumeration value="gteq"/>
 *             &lt;enumeration value="lt"/>
 *             &lt;enumeration value="lteq"/>
 *             &lt;enumeration value="matches"/>
 *             &lt;enumeration value="notMatches"/>
 *             &lt;enumeration value="and"/>
 *             &lt;enumeration value="not"/>
 *             &lt;enumeration value="or"/>
 *             &lt;enumeration value="subtract"/>
 *             &lt;enumeration value="add"/>
 *             &lt;enumeration value="divide"/>
 *             &lt;enumeration value="modulo"/>
 *             &lt;enumeration value="multiply"/>
 *             &lt;enumeration value="concat"/>
 *             &lt;enumeration value="substring"/>
 *             &lt;enumeration value="format"/>
 *             &lt;enumeration value="parseInt"/>
 *             &lt;enumeration value="parseFloat"/>
 *             &lt;enumeration value="indexOf"/>
 *             &lt;enumeration value="lastIndexOf"/>
 *             &lt;enumeration value="contains"/>
 *             &lt;enumeration value="notContains"/>
 *             &lt;enumeration value="memberOf"/>
 *             &lt;enumeration value="notMemberOf"/>
 *             &lt;enumeration value="in"/>
 *             &lt;enumeration value="notIn"/>
 *             &lt;enumeration value="indexOfCollection"/>
 *             &lt;enumeration value="getElementAtIndex"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clause", propOrder = {
    "comment",
    "paramPropertyPathOrGetPropertyOrClause"
})
public class Clause {

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
    @XmlAttribute(name = "operator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operator;

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

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        if (operator == null) {
            return "eq";
        } else {
            return operator;
        }
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

}
