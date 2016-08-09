package br.com.gbd.apostiladesignpatterns.criacao.abstractFactory;

import br.com.gbd.apostiladesignpatterns.criacao.abstractFactory.Emissor;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 09:52:10
    Arquivo: EmissorCreator
*/

public class EmissorCreator {

    public static final int VISA = 0;
    public static final int MASTERCARD = 1;
    
    public Emissor create(int tipoDoEmissor){
        if(tipoDoEmissor == EmissorCreator.VISA){
            return new EmissorVisa();
        } else if (tipoDoEmissor == EmissorCreator.MASTERCARD){
            return new EmissorMastercard();
        } else {
            throw new IllegalArgumentException("Tipo de emissor não suportado"); 
        }
    }
}
