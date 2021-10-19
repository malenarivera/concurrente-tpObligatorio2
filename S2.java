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
public class S2 implements Runnable {
    private int b,z;
    private Semaphore s2;
    private Semaphore s2_s3;
    
    public S2( int z){
        this.z=z;
        this.s2=new Semaphore (1);
        s2_s3= new Semaphore(0);
    }
    
    public void operarS2(){
        b=z-1;
        System.out.println("B: "+b);
    }
    
     public boolean adquirirs2_s3(){
        return (s2_s3.tryAcquire());
    }
    
    public int getB(){
        return b;
    }
    
    public void run(){
        try{
            s2.acquire();
            this.operarS2();
            s2_s3.release();
    }catch(InterruptedException e){}
   }
}
