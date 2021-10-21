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
public class Proceso {
    private Semaphore sem1,sem2,sem3,sem4;
    int x,y,z,a,b,c,w;
    
    public Proceso(int x,int y,int z){
        sem1= new Semaphore (1);
        sem2= new Semaphore (1);
        sem3= new Semaphore (0);
        sem4= new Semaphore (0);
        this.x=x;
        this.y=y;
        this.z=z;
        
    }
    
    public void calcularA(){
      try{
        sem1.acquire();
        a=x+y;
        System.out.println("A: "+a);
    }catch(InterruptedException e){}
     sem3.release();
    }
    
    public void calcularB(){
        try{
        sem2.acquire();
        b=z-1;
        System.out.println("B: "+b);
    }catch(InterruptedException e){}
        sem3.release();
    }
    
    public void calcularC(){
        try{
            sem3.acquire(2);
        c=a+b;
        System.out.println("C: "+c);
    }catch(InterruptedException e){}
        sem4.release();
    }
    
    public void calcularW(){
        try{
        sem4.acquire(1);
        w=c+1;
        System.out.println("W: "+w);
        }catch(InterruptedException e){}
        sem4.release();
    }
    
    
    
}
