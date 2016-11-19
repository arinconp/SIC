/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import entities.Transaccionsic;
import integracion.Transaccion;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sala-a
 */
@Stateless
public class TransaccionsicFacade extends AbstractFacade<Transaccionsic> implements TransaccionsicFacadeRemote {

    @EJB
    private ProxyALI proxy;
    
    @PersistenceContext(unitName = "SICPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransaccionsicFacade() {
        super(Transaccionsic.class);
    }
    
    public void getTransaccionesALI(String fecha){
        List<Transaccion> l = proxy.getTransacciones(fecha);
        Transaccionsic tx = null;
        if(l!=null){
            for (Transaccion transaccion : l) {
                tx = new Transaccionsic();
                tx.setCedulaUsuario(transaccion.getCedulaUsuario().getCedula());
                tx.setFecha(fecha);
                tx.setNumeroTransaccion(new Integer (transaccion.getNumTransaccion().intValue()));
                tx.setValorTotal(transaccion.getValor().intValue());
                em.persist(tx);
            }
            
        }

    }
}
