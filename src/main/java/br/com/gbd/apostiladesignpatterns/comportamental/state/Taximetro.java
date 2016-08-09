package br.com.gbd.apostiladesignpatterns.comportamental.state;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 14:58:56
    Arquivo: Taximetro
*/

public class Taximetro {
    
    private Bandeira bandeira;
    
    public Taximetro(Bandeira bandeira){
        this.bandeira = bandeira;
    }
    
    public void setBandeira(Bandeira bandeira){
        this.bandeira = bandeira;
    }
    
    public double calculaValorDaCorrida(double tempo, double distancia){
        return this.bandeira.calcularValorDaCorrida(tempo, distancia);
    }
}
