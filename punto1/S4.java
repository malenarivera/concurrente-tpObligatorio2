/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrenteTeoria.punto1;

import concurrenteTeoria.Proceso;

/**
 *
 * @author Diana
 */
public class S4 implements Runnable{
    Proceso p;
    
    public S4 (Proceso p){
        this.p=p;
    }
    
    public void operarS4(){
     p.calcularW();
    }    
       
    public void run(){
            this.operarS4();
           
}
}

