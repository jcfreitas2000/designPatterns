package br.com.gbd.apostiladesignpatterns.estrutural.facade;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 08:45:10
    Arquivo: Financeiro
*/

public class Financeiro {

    public void fatura(String cliente, String produto){
        System.out.println("Fatura: ");
        System.out.println("Clinte: " + cliente);
        System.out.println("Produto: " + produto);
    }
}
