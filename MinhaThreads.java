package java06;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;


public class MinhaThreads extends Thread {
    
    private String nome;
    
    public MinhaThreads(String nome){
        this.nome = nome;
        start();
    }
    
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(nome + " Contador " + i);
        try{
            Thread.sleep(100);
        }   catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(MinhaThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
