
package com.montrealcollege.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.montrealcollege.ws.client.generated package. 
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

    private final static QName _CreateRequest_QNAME = new QName("http://www.montrealcollege.com/employee", "CreateRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.montrealcollege.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.montrealcollege.com/employee", name = "CreateRequest")
    public JAXBElement<Employee> createCreateRequest(Employee value) {
        return new JAXBElement<Employee>(_CreateRequest_QNAME, Employee.class, null, value);
    }

}
