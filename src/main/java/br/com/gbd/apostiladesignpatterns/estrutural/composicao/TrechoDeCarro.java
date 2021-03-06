package br.com.gbd.apostiladesignpatterns.estrutural.composicao;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 16:41:31
    Arquivo: TrechoDeCarro
*/

public class TrechoDeCarro implements Trecho{
    
    private String direcao;
    private double distancia;

    public TrechoDeCarro(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }
    
    @Override
    public void imprime() {
        System.out.println("Vá de carro: ");
        System.out.println(this.direcao);
        System.out.println("A distância percorrida será de: " + this.distancia + " metros.");
    }
}
