package br.com.gbd.apostiladesignpatterns.criacao.abstractFactory;

import br.com.gbd.apostiladesignpatterns.criacao.abstractFactory.Emissor;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 09:49:19
    Arquivo: EmissorMastercard
*/

public class EmissorMastercard implements Emissor{

    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando a seguinte msg para a Mastercard: ");
        System.out.println(mensagem);
    }
}
