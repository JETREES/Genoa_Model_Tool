
package com.janusresearch.genoaModelTool.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Assignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Assignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="entityVariable" type="{}EntityVariable"/>
 *           &lt;element name="variable" type="{}SimpleVariable"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="getProperty" type="{}GetProperty"/>
 *           &lt;element name="clause" type="{}Clause"/>
 *           &lt;element name="literal" type="{}Literal"/>
 *           &lt;element name="variableRef" type="{}VariableRef"/>
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
@XmlType(name = "Assignment", propOrder = {
    "comment",
    "entityVariable",
    "variable",
    "getProperty",
    "clause",
    "literal",
    "variableRef",
    "_null"
})
public class Assignment {

    protected String comment;
    protected EntityVariable entityVariable;
    protected SimpleVariable variable;
    protected GetProperty getProperty;
    protected Clause clause;
    protected Literal literal;
    protected VariableRef variableRef;
    @XmlElement(name = "null")
    protected Null _null;

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
     * Gets the value of the literal property.
     * 
     * @return
     *     possible object is
     *     {@link Literal }
     *     
     */
    public Literal getLiteral() {
        return literal;
    }

    /**
     * Sets the value of the literal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Literal }
     *     
     */
    public void setLiteral(Literal value) {
        this.literal = value;
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
     * Gets the value of the null property.
     * 
     * @return
     *     possible object is
     *     {@link Null }
     *     
     */
    public Null getNull() {
        return _null;
    }

    /**
     * Sets the value of the null property.
     * 
     * @param value
     *     allowed object is
     *     {@link Null }
     *     
     */
    public void setNull(Null value) {
        this._null = value;
    }

}
