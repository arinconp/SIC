
package integracion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebService", targetNamespace = "http://ws/", wsdlLocation = "http://10.192.230.36:8080/WebService/WebService?WSDL")
public class WebService_Service
    extends Service
{

    private final static URL WEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICE_EXCEPTION;
    private final static QName WEBSERVICE_QNAME = new QName("http://ws/", "WebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.192.230.36:8080/WebService/WebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICE_WSDL_LOCATION = url;
        WEBSERVICE_EXCEPTION = e;
    }

    public WebService_Service() {
        super(__getWsdlLocation(), WEBSERVICE_QNAME);
    }

    public WebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICE_QNAME, features);
    }

    public WebService_Service(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICE_QNAME);
    }

    public WebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICE_QNAME, features);
    }

    public WebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebService
     */
    @WebEndpoint(name = "WebServicePort")
    public WebService getWebServicePort() {
        return super.getPort(new QName("http://ws/", "WebServicePort"), WebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebService
     */
    @WebEndpoint(name = "WebServicePort")
    public WebService getWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "WebServicePort"), WebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICE_EXCEPTION!= null) {
            throw WEBSERVICE_EXCEPTION;
        }
        return WEBSERVICE_WSDL_LOCATION;
    }

}
