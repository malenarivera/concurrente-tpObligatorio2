/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrenteTeoria;

import java.util.concurrent.Semaphore;
import java.lang.Thread;
/**
 *
 * @author Diana
 */
public class S3 implements Runnable {
    private int c;
private Semaphore s3_s4;
private Semaphore s3;
private S1 sem1;
private S2 sem2;

public S3 (S1 sem1,S2 sem2){
    this.sem1=sem1;
    this.sem2=sem2;
    s3_s4= new Semaphore (0);
    this.s3=new Semaphore(1);
}

public int getC(){
return c;
}


public void operarS3(){
      c=sem1.getA()-sem2.getB();
       System.out.println("C: "+c);
}
  

public boolean adquirirs3_s4(){
    return (s3_s4.tryAcquire());
}
    

    public void run() {
        if(sem1.adquirirs1_s3()&&sem2.adquirirs2_s3()){
            try {
                s3.acquire();
                this.operarS3();
                s3_s4.release();
            } catch (InterruptedException e) {
            }
        }
        
        
    }
}

    




