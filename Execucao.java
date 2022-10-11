package designpatterns;

public class Execucao {
    
    public static void main(String[] args) {
        WheaterData weatherData = new WheaterData(26, 15, 36);
        
        weatherData.setDisplayEstisticas(new DisplayEstatisticas());
        weatherData.setCondicoesAtuais(new DisplayCondicoesAtuais());
        weatherData.setDisplayPrevisao(new DisplayPrevisao());
        
        weatherData.verificarAtualizacoes(-12, 59, 14);
        
    }
    
}
