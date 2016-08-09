package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.criacao.singleton.Configuracao;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 12:56:25
    Arquivo: Singleton
*/

public class Singleton {

    public static void testaSingleton(){
        Configuracao config = Configuracao.getInstance();
        System.out.println(config.getPropriedade("time-zone"));
        System.out.println(config.getPropriedade("currency-code"));
    }
}
