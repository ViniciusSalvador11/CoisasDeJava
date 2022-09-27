/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java06;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TesteJoin {
    
    public static void main(String[] args){
    MinhaThreadRun thread1 = new MinhaThreadRun("#1", 300);
    MinhaThreadRun thread2 = new MinhaThreadRun("#2", 100);
    MinhaThreadRun thread3 = new MinhaThreadRun("#3", 200);
    
    Thread t1  = new Thread(thread1);
    Thread t2  = new Thread(thread2);
    Thread t3  = new Thread(thread3);
    
    t1.start();
    t2.start();
    t3.start();
    
    t3.setPriority(10);
    t1.setPriority(1);
    t2.setPriority(1);
    
        try {
            t1.join(900);
            t2.join(900);
            t3.join(900);
            Thread.sleep(1100);
        } catch (InterruptedException ex) {
            Logger.getLogger(TesteJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Programa principal finalizou");
    
    }
}
