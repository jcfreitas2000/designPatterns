package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.comportamental.observer.Acao;
import br.com.gbd.apostiladesignpatterns.comportamental.observer.Corretora;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 14:45:46
    Arquivo: Observer
*/

public class Observer {

    public static void testaObserver(){
        Acao acao = new Acao("VALE3", 45.27);
        
        Corretora corretora1 = new Corretora("C1");
        Corretora corretora2 = new Corretora("C2");
        
        acao.registraInteressado(corretora1);
        acao.registraInteressado(corretora2);
        
        acao.setValor(50);
    }
}
