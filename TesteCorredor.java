package aula07;


public class TesteCorredor  {
    
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        
        Thread corredor1 = new Thread(new Corredores(mainThread, 200, 2000), "Senna");
        Thread corredor2 = new Thread(new Corredores(mainThread, 120, 4000), "Barichello");
        Thread corredor3 = new Thread(new Corredores(mainThread, 175, 3000), "Mansell");
        Thread corredor4 = new Thread(new Corredores(mainThread, 180, 2500), "Piquet");
        Thread corredor5 = new Thread(new Corredores(mainThread, 150, 2000), "Hill");
        
        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();
        corredor5.start();
        System.out.println("Começa a corrida!!!");
    }
    
}
