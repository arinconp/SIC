/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import integracion.WebService_Service;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author sala-a
 */
@Stateless
@LocalBean
public class ProxyALI {

    @WebServiceRef(wsdlLocation = "META-INF/wsdl/10.192.230.36_8080/WebService/WebService.wsdl")
    private WebService_Service service;

    public java.util.List<integracion.Transaccion> getTransacciones(java.lang.String date) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        integracion.WebService port = service.getWebServicePort();
        return port.getTransacciones(date);
    }

    


    
}
