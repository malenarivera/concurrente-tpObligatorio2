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
public class S1 implements Runnable{
    private int a,x,y;
    private Semaphore s1_s3;
    private Semaphore s1;
    
    public S1 (int x, int y){
        this.x=x;
        this.y=y;
        this.s1=new Semaphore (1);
        s1_s3= new Semaphore (0);
    }
    
    private void operarS1(){
        a=x+y;
        System.out.println("A: "+a);
    }
    
    public boolean adquirirs1_s3(){
        return (s1_s3.tryAcquire());
    }
    
    public int getA(){
        return a;
    }
    
    public void run(){
      try{
        s1.acquire();
        this.operarS1();
        s1_s3.release();
      }catch (InterruptedException e){}
}
}
