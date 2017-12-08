
package com.janusresearch.genoaModelTool.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.janusresearch.genoaModelTool.jaxb package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {
    private final static QName _Model_QNAME = new QName("", "model");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.janusresearch.genoaModelTool.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Model }
     * 
     */
    public Model createModel() {
        return new Model();
    }

    /**
     * Create an instance of {@link RelationshipSetting }
     * 
     */
    public RelationshipSetting createRelationshipSetting() {
        return new RelationshipSetting();
    }

    /**
     * Create an instance of {@link EntityVariable }
     * 
     */
    public EntityVariable createEntityVariable() {
        return new EntityVariable();
    }

    /**
     * Create an instance of {@link RetractBean }
     * 
     */
    public RetractBean createRetractBean() {
        return new RetractBean();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link ToManyMap }
     * 
     */
    public ToManyMap createToManyMap() {
        return new ToManyMap();
    }

    /**
     * Create an instance of {@link ParamPropertyPath }
     * 
     */
    public ParamPropertyPath createParamPropertyPath() {
        return new ParamPropertyPath();
    }

    /**
     * Create an instance of {@link VariableRef }
     * 
     */
    public VariableRef createVariableRef() {
        return new VariableRef();
    }

    /**
     * Create an instance of {@link Null }
     * 
     */
    public Null createNull() {
        return new Null();
    }

    /**
     * Create an instance of {@link Prototype }
     * 
     */
    public Prototype createPrototype() {
        return new Prototype();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link ToManySetting }
     * 
     */
    public ToManySetting createToManySetting() {
        return new ToManySetting();
    }

    /**
     * Create an instance of {@link FactPattern }
     * 
     */
    public FactPattern createFactPattern() {
        return new FactPattern();
    }

    /**
     * Create an instance of {@link AttributeSetting }
     * 
     */
    public AttributeSetting createAttributeSetting() {
        return new AttributeSetting();
    }

    /**
     * Create an instance of {@link ToMany }
     * 
     */
    public ToMany createToMany() {
        return new ToMany();
    }

    /**
     * Create an instance of {@link PropertyPathSetting }
     * 
     */
    public PropertyPathSetting createPropertyPathSetting() {
        return new PropertyPathSetting();
    }

    /**
     * Create an instance of {@link Assignment }
     * 
     */
    public Assignment createAssignment() {
        return new Assignment();
    }

    /**
     * Create an instance of {@link PropertyBinding }
     * 
     */
    public PropertyBinding createPropertyBinding() {
        return new PropertyBinding();
    }

    /**
     * Create an instance of {@link Choices }
     * 
     */
    public Choices createChoices() {
        return new Choices();
    }

    /**
     * Create an instance of {@link Literal }
     * 
     */
    public Literal createLiteral() {
        return new Literal();
    }

    /**
     * Create an instance of {@link ToOne }
     * 
     */
    public ToOne createToOne() {
        return new ToOne();
    }

    /**
     * Create an instance of {@link AddToCollection }
     * 
     */
    public AddToCollection createAddToCollection() {
        return new AddToCollection();
    }

    /**
     * Create an instance of {@link Behavior }
     * 
     */
    public Behavior createBehavior() {
        return new Behavior();
    }

    /**
     * Create an instance of {@link SimpleVariable }
     * 
     */
    public SimpleVariable createSimpleVariable() {
        return new SimpleVariable();
    }

    /**
     * Create an instance of {@link Instantiation }
     * 
     */
    public Instantiation createInstantiation() {
        return new Instantiation();
    }

    /**
     * Create an instance of {@link RemoveFromCollection }
     * 
     */
    public RemoveFromCollection createRemoveFromCollection() {
        return new RemoveFromCollection();
    }

    /**
     * Create an instance of {@link ToManyList }
     * 
     */
    public ToManyList createToManyList() {
        return new ToManyList();
    }

    /**
     * Create an instance of {@link VariableRef1 }
     * 
     */
    public VariableRef1 createVariableRef1() {
        return new VariableRef1();
    }

    /**
     * Create an instance of {@link ToManyListSetting }
     * 
     */
    public ToManyListSetting createToManyListSetting() {
        return new ToManyListSetting();
    }

    /**
     * Create an instance of {@link ClearCollection }
     * 
     */
    public ClearCollection createClearCollection() {
        return new ClearCollection();
    }

    /**
     * Create an instance of {@link Alias }
     * 
     */
    public Alias createAlias() {
        return new Alias();
    }

    /**
     * Create an instance of {@link PropertyPath }
     * 
     */
    public PropertyPath createPropertyPath() {
        return new PropertyPath();
    }

    /**
     * Create an instance of {@link GetProperty }
     * 
     */
    public GetProperty createGetProperty() {
        return new GetProperty();
    }

    /**
     * Create an instance of {@link Clause }
     * 
     */
    public Clause createClause() {
        return new Clause();
    }

    /**
     * Create an instance of {@link SetProperty }
     * 
     */
    public SetProperty createSetProperty() {
        return new SetProperty();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Model }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "model")
    public JAXBElement<Model> createModel(Model value) {
        return new JAXBElement<Model>(_Model_QNAME, Model.class, null, value);
    }

}
