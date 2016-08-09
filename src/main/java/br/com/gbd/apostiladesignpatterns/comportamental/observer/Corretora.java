package br.com.gbd.apostiladesignpatterns.comportamental.observer;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 14:43:45
    Arquivo: Corretora
*/

public class Corretora implements AcaoObserver{

    private String nome;

    public Corretora(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void notificaAlteracao(Acao acao) {
        System.out.println("Corretora " + this.nome + " sendo notificada: ");
        System.out.println("A ação " + acao.getCodigo() + " teve o seu valor alterado para " + acao.getValor());
    }
}
