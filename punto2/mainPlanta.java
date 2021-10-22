/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import concurrenteTeoria.punto2.Planta;
import concurrenteTeoria.punto2.Empaquetador;
import concurrenteTeoria.punto2.Embotellador;
import java.lang.Thread;
/**
 *
 * @author Diana
 */
public class mainPlanta {
    public static void main(String[] args) {
        Planta p= new Planta();
        Empaquetador emp= new Empaquetador (p);
        Embotellador emb= new Embotellador (p);
     
        Thread empa= new Thread (emp);
        Thread embo= new Thread (emb);
        
        empa.start();
        embo.start();
    }
    
}
