package br.com.gbd.apostiladesignpatterns.abstractFactory;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 09:39:24
    Arquivo: MatercardComunicadorFactory
*/

public class MatercardComunicadorFactory implements ComunicadorFactory{

    @Override
    public Emissor createEmissor() {
        return  new EmissorCreator().create(EmissorCreator.MASTERCARD);
    }

    @Override
    public Receptor createReceptor() {
        return new ReceptorCreator().create(ReceptorCreator.MASTERCARD);
    }
}
