package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.criacao.factoryMethod.Emissor;
import br.com.gbd.apostiladesignpatterns.criacao.factoryMethod.EmissorCreator;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 10:45:16
    Arquivo: FactoryMethod
*/

public class FactoryMethod {

    public static void testa(){
        String mensagem = "Olá";
        EmissorCreator creator = new EmissorCreator();

        Emissor emissor = creator.create(EmissorCreator.SMS);
        emissor.enviar(mensagem);

        emissor = creator.create(EmissorCreator.EMAIL);
        emissor.enviar(mensagem);

        emissor = creator.create(EmissorCreator.JMS);
        emissor.enviar(mensagem);
    }
}
