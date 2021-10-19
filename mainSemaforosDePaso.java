/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrenteTeoria;

import java.lang.Thread;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Diana
 */
public class mainSemaforosDePaso {
    public static void main(String[] args) {
    int x,y,z;
    x=10;
    y=11;
    z=12;
   
    S1 s1= new S1(x,y);
    S2 s2= new S2(z);
    S3 s3= new S3(s1,s2);
    S4 s4= new S4(s3);
    
    Thread sssem1= new Thread (s1);
    Thread sssem2= new Thread(s2);
    Thread sssem3= new Thread(s3);
    Thread sssem4= new Thread(s4);
    
    sssem1.start();
    sssem2.start();
   sssem3.start();
   sssem4.start();
    }
    
    
}
