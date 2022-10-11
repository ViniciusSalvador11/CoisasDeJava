package interfaceDesignPatterns;

import java.util.ArrayList;

public class GeradorNumero implements subject{
    private int qtdNuMCopo;
    private ArrayList<Animal> animais;

    public GeradorNumero() {
        animais =  new ArrayList<>();
        qtdNuMCopo = 0;
    }

    public GeradorNumero(int qtdNuMCopo, ArrayList<Animal> animais) {
        this.qtdNuMCopo = qtdNuMCopo;
        this.animais = animais;
    }
    
    
    

    @Override
    public void registerObserver(Animal animal) {
        animais.add(animal);
    }
    
    @Override
    public void removeObserver(Animal animal){
        animais.remove(animal);
    }
    
    @Override
    public void notifyObserver(int qtdNuMCopo){
        
        for (int i = 0; i < animais.size(); i++) {
            animais.get(i).update(qtdNuMCopo);
        }
    }
    
    public void setState(){
        qtdNuMCopo = (int)Math.random() * 60;        
        notifyObserver(qtdNuMCopo);
    }
    
}
