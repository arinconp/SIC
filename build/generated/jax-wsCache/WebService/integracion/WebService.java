
package integracion;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@javax.jws.WebService(name = "WebService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebService {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "count", targetNamespace = "http://ws/", className = "integracion.Count")
    @ResponseWrapper(localName = "countResponse", targetNamespace = "http://ws/", className = "integracion.CountResponse")
    @Action(input = "http://ws/WebService/countRequest", output = "http://ws/WebService/countResponse")
    public int count();

    /**
     * 
     * @param id
     * @return
     *     returns integracion.Transaccion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find", targetNamespace = "http://ws/", className = "integracion.Find")
    @ResponseWrapper(localName = "findResponse", targetNamespace = "http://ws/", className = "integracion.FindResponse")
    @Action(input = "http://ws/WebService/findRequest", output = "http://ws/WebService/findResponse")
    public Transaccion find(
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @param transaccion
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "create", targetNamespace = "http://ws/", className = "integracion.Create")
    @Action(input = "http://ws/WebService/create")
    public void create(
        @WebParam(name = "transaccion", targetNamespace = "")
        Transaccion transaccion);

    /**
     * 
     * @return
     *     returns java.util.List<integracion.Transaccion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://ws/", className = "integracion.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://ws/", className = "integracion.FindAllResponse")
    @Action(input = "http://ws/WebService/findAllRequest", output = "http://ws/WebService/findAllResponse")
    public List<Transaccion> findAll();

    /**
     * 
     * @param range
     * @return
     *     returns java.util.List<integracion.Transaccion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findRange", targetNamespace = "http://ws/", className = "integracion.FindRange")
    @ResponseWrapper(localName = "findRangeResponse", targetNamespace = "http://ws/", className = "integracion.FindRangeResponse")
    @Action(input = "http://ws/WebService/findRangeRequest", output = "http://ws/WebService/findRangeResponse")
    public List<Transaccion> findRange(
        @WebParam(name = "range", targetNamespace = "")
        List<Integer> range);

    /**
     * 
     * @param date
     * @return
     *     returns java.util.List<integracion.Transaccion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTransacciones", targetNamespace = "http://ws/", className = "integracion.GetTransacciones")
    @ResponseWrapper(localName = "getTransaccionesResponse", targetNamespace = "http://ws/", className = "integracion.GetTransaccionesResponse")
    @Action(input = "http://ws/WebService/getTransaccionesRequest", output = "http://ws/WebService/getTransaccionesResponse")
    public List<Transaccion> getTransacciones(
        @WebParam(name = "date", targetNamespace = "")
        String date);

}
