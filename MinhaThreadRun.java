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
public class MinhaThreadRun implements Runnable{
    
    private String nome;
    private int tempo;
    
    public MinhaThreadRun(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println(nome + " Contador " + i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThreadRun.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println(nome + " Finalizou");
    }
    
}
