package br.com.gbd.apostiladesignpatterns.criacao.abstractFactory;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 09:37:58
    Arquivo: VisaComunicadorFactory
*/

public class VisaComunicadorFactory implements ComunicadorFactory {

    @Override
    public Emissor createEmissor() {
        return  new EmissorCreator().create(EmissorCreator.VISA);
    }

    @Override
    public Receptor createReceptor() {
        return new ReceptorCreator().create(ReceptorCreator.VISA);
    }
}
