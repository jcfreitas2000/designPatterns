package br.com.gbd.apostiladesignpatterns.abstractFactory;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 09:35:22
    Arquivo: comunicadorFactory
*/

public interface ComunicadorFactory {
    Emissor createEmissor();
    Receptor createReceptor();
}
