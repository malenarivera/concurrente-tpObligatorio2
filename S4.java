/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrenteTeoria;

import java.util.concurrent.Semaphore;
/**
 *
 * @author Diana
 */
public class S4 implements Runnable{
    private int w;
    private S3 sem3;
    private Semaphore s3_s4;
    private Semaphore s4;
    
    public S4 (S3 sem3){
        this.s4=new Semaphore(1);
        
        this.sem3=sem3;
    }
    
    public void operarS4(){
        w=sem3.getC()+1;
        System.out.println("W: "+w);
    }    
       
    public void run(){
        if(sem3.adquirirs3_s4()){
      try{
          s4.acquire();
            this.operarS4();
        s4.release();
      }catch(InterruptedException e){}
    }
           
}
}

