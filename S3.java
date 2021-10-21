/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrenteTeoria;

/**
 *
 * @author Diana
 */
public class S3 implements Runnable {
Proceso p;

public S3 (Proceso p){
    this.p=p;
}


public void operarS3(){
p.calcularC();
}
  
    public void run() {
                this.operarS3();
        }
        
        
    }

    




