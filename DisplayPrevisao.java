package designpatterns;

public class DisplayPrevisao {

    
    private double temperatura;
    private double pressao;
    private double umidade;

    void setPressao(double pressao) {
        this.pressao = pressao;
    }

    void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    void imprimirDados() {
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Pressão: " + pressao);
        System.out.println("Umidade: " + umidade);
        
    }
    
    void setTemperatura(double temperatura) {
         this.temperatura = temperatura;
    }
}
