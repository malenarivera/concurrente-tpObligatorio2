/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrenteTeoria.punto1;

import concurrenteTeoria.Proceso;
import concurrenteTeoria.punto1.S3;
import concurrenteTeoria.punto1.S4;
import concurrenteTeoria.punto1.S2;
import concurrenteTeoria.punto1.S1;
import java.lang.Thread;

/**
 *
 * @author Diana
 */
public class mainSemaforosDePaso {
    public static void main(String[] args) {
   Proceso p= new Proceso (1,2,3);
   
    S1 s1= new S1(p);
    S2 s2= new S2(p);
    S3 s3= new S3(p);
    S4 s4= new S4(p);
    
    Thread sssem1= new Thread (s1);
    Thread sssem2= new Thread(s2);
    Thread sssem3= new Thread(s3);
    Thread sssem4= new Thread (s4);
    
        sssem3.start();
    sssem1.start();
    sssem2.start();
    sssem4.start();
    
    
    }
    
    
}
