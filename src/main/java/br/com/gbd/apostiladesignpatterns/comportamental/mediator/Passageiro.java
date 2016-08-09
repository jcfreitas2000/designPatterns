package br.com.gbd.apostiladesignpatterns.comportamental.mediator;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 13:53:14
    Arquivo: Passageiro
 */
public class Passageiro implements Runnable{

    private String nome;
    private CentralDeTaxi central;

    public Passageiro(String nome, CentralDeTaxi central) {
        this.nome = nome;
        this.central = central;
    }

    public String getNome() {
        return nome;
    }
    
    public void run(){
        for(int i = 0; i < 5; i++){
            this.central.pedeTaxi(this);
        }
    }
}
