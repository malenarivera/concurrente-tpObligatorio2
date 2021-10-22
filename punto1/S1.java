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
public class S1 implements Runnable{
    Proceso p;
    
    public S1 (Proceso p){
        this.p=p;
    }
    
    private void operarS1(){
        p.calcularA();
    }
    
    
    public void run(){
        this.operarS1();
}
}
