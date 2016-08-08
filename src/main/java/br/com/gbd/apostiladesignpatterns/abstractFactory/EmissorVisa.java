package br.com.gbd.designpatterns.abstractFactory;

import br.com.gbd.apostiladesignpatterns.abstractFactory.Emissor;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 09:48:16
    Arquivo: EmissorVisa
*/

public class EmissorVisa implements Emissor{

    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando a seguinte msg para a Visa: ");
        System.out.println(mensagem);
    }
}
