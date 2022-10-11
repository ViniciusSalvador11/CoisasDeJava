package designpatterns;

public class WheaterData {
    private double temperatura;
    private double pressao;
    private double umidade;
    private DisplayCondicoesAtuais condicoesAtuais;
    private DisplayEstatisticas displayEstisticas;
    private DisplayPrevisao displayPrevisao;

    public WheaterData() {
    }

    public WheaterData(double temperatura, double pressao, double umidade) {
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.umidade = umidade;
    }

    public DisplayCondicoesAtuais getCondicoesAtuais() {
        return condicoesAtuais;
    }

    public void setCondicoesAtuais(DisplayCondicoesAtuais condicoesAtuais) {
        this.condicoesAtuais = condicoesAtuais;
    }

    public DisplayEstatisticas getDisplayEstisticas() {
        return displayEstisticas;
    }

    public void setDisplayEstisticas(DisplayEstatisticas displayEstisticas) {
        this.displayEstisticas = displayEstisticas;
    }

    public DisplayPrevisao getDisplayPrevisao() {
        return displayPrevisao;
    }

    public void setDisplayPrevisao(DisplayPrevisao displayPrevisao) {
        this.displayPrevisao = displayPrevisao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }
    
    public void imprimirDados(){
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Pressão: " + pressao);
        System.out.println("Umidade: " + umidade);
    }
    
    public void verificarAtualizacoes(double temperatura, double pressao, double umidade){
        
        if(this.temperatura != temperatura){
            condicoesAtuais.setTemperatura(temperatura);
            displayEstisticas.setTemperatura(temperatura);
            displayPrevisao.setTemperatura(temperatura);
        }
        
        if(this.pressao != pressao){
            condicoesAtuais.setPressao(pressao);
            displayEstisticas.setPressao(pressao);
            displayPrevisao.setPressao(pressao);
        }
        
        if(this.umidade != umidade){
            condicoesAtuais.setUmidade(umidade);
            displayEstisticas.setUmidade(umidade);
            displayPrevisao.setUmidade(umidade);
        }
        
        condicoesAtuais.imprimirDados();
        displayEstisticas.imprimirDados();
        displayPrevisao.imprimirDados();
    }
    
    
    
    
    
}
