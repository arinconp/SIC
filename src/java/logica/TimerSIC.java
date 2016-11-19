/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Stateless;

/**
 *
 * @author sala-a
 */
@Singleton
public class TimerSIC implements TimerSICLocal {
    
    @EJB
    private TransaccionsicFacadeRemote transaccionsicFacade;

    @Schedule(minute = "*/1", hour = "*")
    @Override
    public void myTimer() {
        System.out.println("Timer event: " + new Date());
        transaccionsicFacade.getTransaccionesALI("01/10/16");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
