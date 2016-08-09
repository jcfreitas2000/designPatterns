package br.com.gbd.apostiladesignpatterns.comportamental.command;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 12:26:38
    Arquivo: Player
*/

public class Player {

    public void play(String filename) throws InterruptedException {
        System.out.println("Tocando arquivo: " + filename);
        long duracao = (long)(Math.random()*2000);
        System.out.println("Duração (s): " + duracao/1000.0);
        Thread.sleep(duracao);
        System.out.println("FIM");
    }
    
    public void increaseVol(int levels){
        System.out.println("Aumentando o volume em: " + levels);
    }
    
    public void decreaseVol(int levels){
        System.out.println("Diminuindo o volume em: " + levels);
    }
}
