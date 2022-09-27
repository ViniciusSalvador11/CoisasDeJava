/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java06;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 821150867
 */
public class TesteRunnable {

    public static void main(String[] args) {
        MinhaThreadRun thread1 = new MinhaThreadRun("#1", 500);
        MinhaThreadRun thread2 = new MinhaThreadRun("#2", 500);
        MinhaThreadRun thread3 = new MinhaThreadRun("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
        t1.start();
        t2.start();
        t3.start();

        while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {
            try {
                Thread.sleep(900);
            } catch (InterruptedException ex) {
                Logger.getLogger(TesteRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Programa principal Finalizou");
    }
}
