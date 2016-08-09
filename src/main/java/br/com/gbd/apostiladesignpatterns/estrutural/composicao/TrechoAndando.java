package br.com.gbd.apostiladesignpatterns.estrutural.composicao;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 16:38:19
    Arquivo: TrechoAndando
*/

public class TrechoAndando implements Trecho{

    private String direcao;
    private double distancia;

    public TrechoAndando(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }
    
    @Override
    public void imprime() {
        System.out.println("Vá andando: ");
        System.out.println(this.direcao);
        System.out.println("A distância percorrida será de: " + this.distancia + " metros.");
    }
}
