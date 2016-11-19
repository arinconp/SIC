
package integracion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the integracion package. 
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

    private final static QName _Count_QNAME = new QName("http://ws/", "count");
    private final static QName _CountResponse_QNAME = new QName("http://ws/", "countResponse");
    private final static QName _Create_QNAME = new QName("http://ws/", "create");
    private final static QName _Find_QNAME = new QName("http://ws/", "find");
    private final static QName _FindAll_QNAME = new QName("http://ws/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://ws/", "findAllResponse");
    private final static QName _FindRange_QNAME = new QName("http://ws/", "findRange");
    private final static QName _FindRangeResponse_QNAME = new QName("http://ws/", "findRangeResponse");
    private final static QName _FindResponse_QNAME = new QName("http://ws/", "findResponse");
    private final static QName _GetTransacciones_QNAME = new QName("http://ws/", "getTransacciones");
    private final static QName _GetTransaccionesResponse_QNAME = new QName("http://ws/", "getTransaccionesResponse");
    private final static QName _Transaccion_QNAME = new QName("http://ws/", "transaccion");
    private final static QName _Usuario_QNAME = new QName("http://ws/", "usuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: integracion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindRange }
     * 
     */
    public FindRange createFindRange() {
        return new FindRange();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link GetTransacciones }
     * 
     */
    public GetTransacciones createGetTransacciones() {
        return new GetTransacciones();
    }

    /**
     * Create an instance of {@link GetTransaccionesResponse }
     * 
     */
    public GetTransaccionesResponse createGetTransaccionesResponse() {
        return new GetTransaccionesResponse();
    }

    /**
     * Create an instance of {@link Transaccion }
     * 
     */
    public Transaccion createTransaccion() {
        return new Transaccion();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransacciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTransacciones")
    public JAXBElement<GetTransacciones> createGetTransacciones(GetTransacciones value) {
        return new JAXBElement<GetTransacciones>(_GetTransacciones_QNAME, GetTransacciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransaccionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTransaccionesResponse")
    public JAXBElement<GetTransaccionesResponse> createGetTransaccionesResponse(GetTransaccionesResponse value) {
        return new JAXBElement<GetTransaccionesResponse>(_GetTransaccionesResponse_QNAME, GetTransaccionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "transaccion")
    public JAXBElement<Transaccion> createTransaccion(Transaccion value) {
        return new JAXBElement<Transaccion>(_Transaccion_QNAME, Transaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

}
