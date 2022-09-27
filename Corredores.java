package aula07;

public class Corredores implements Runnable {

    private static double distanciaTotalDaCorrida = 500; 
    private double distanciaTotalPercorrida = 0;
    private Thread main;
    private double distanciaQuePodePercorrer;
    private double tempoMaximoQuePodeEsperar;

    public Corredores(Thread main, double distanciaQuePodePercorrer, double tempoMaximoQuePodeEsperar) {
        this.main = main;
        this.distanciaQuePodePercorrer = distanciaQuePodePercorrer;
        this.tempoMaximoQuePodeEsperar = tempoMaximoQuePodeEsperar;
    }
    
    
    @Override
    public void run() {
        
        try {
            main.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        while (distanciaTotalPercorrida <= distanciaTotalDaCorrida){
            distanciaTotalPercorrida += Math.random() * distanciaQuePodePercorrer; 
            System.out.println("" + Thread.currentThread().getName() + ": " + String.format("%.2f", distanciaTotalPercorrida) + "m");
            
            if (distanciaTotalPercorrida > distanciaTotalDaCorrida){
                System.out.println(Thread.currentThread().getName() + " acabou");
            }
            
            try {
                Thread.sleep(
                        (int)(Math.random() * tempoMaximoQuePodeEsperar)
                        );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                
        }
        
    }
    
}
