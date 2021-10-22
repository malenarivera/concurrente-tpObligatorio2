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
public class S2 implements Runnable {
    Proceso p;
    
    public S2( Proceso p){
        this.p=p;
    }
    
    public void operarS2(){
        p.calcularB();
    }
    
    
    public void run(){
            this.operarS2();
}
}