package br.com.gbd.apostiladesignpatterns.criacao.abstractFactory;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 11:48:50
    Arquivo: ReceptorCreator
*/

public class ReceptorCreator {

    public static final int VISA = 0;
    public static final int MASTERCARD = 1;
    
    public Receptor create(int tipoDoReceptor){
        if(tipoDoReceptor == EmissorCreator.VISA){
            return new ReceptorVisa();
        } else if (tipoDoReceptor == EmissorCreator.MASTERCARD){
            return new ReceptorMatercard();
        } else {
            throw new IllegalArgumentException("Tipo de emissor não suportado"); 
        }
    }
}
