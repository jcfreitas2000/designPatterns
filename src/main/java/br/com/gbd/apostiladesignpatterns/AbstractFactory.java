package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.abstractFactory.ComunicadorFactory;
import br.com.gbd.apostiladesignpatterns.abstractFactory.Emissor;
import br.com.gbd.apostiladesignpatterns.abstractFactory.Receptor;
import br.com.gbd.apostiladesignpatterns.abstractFactory.VisaComunicadorFactory;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 10:57:38
    Arquivo: AbstractFactory
 */
public class AbstractFactory {

    public static void testa() {
        ComunicadorFactory cf = new VisaComunicadorFactory();

        String transacao = "Valor=10; Senha=123";
        Emissor emissor = cf.createEmissor();
        emissor.envia(transacao);

        Receptor receptor = cf.createReceptor();
        String msg = receptor.recebe();
        System.out.println(msg);
    }
}
