package br.com.gbd.apostiladesignpatterns.criacao.factoryMethod;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 09:04:09
    Arquivo: EmissorCreator
*/

public class EmissorCreator {
    public static final int SMS = 0;
    public static final int EMAIL = 1;
    public static final int JMS = 2;
    
    public Emissor create(int tipoDeEmissor){
        if(tipoDeEmissor == EmissorCreator.SMS){
            return new EmissorSMS();
        } else if(tipoDeEmissor == EmissorCreator.EMAIL){
            return new EmissorEmail();
        } else if(tipoDeEmissor == EmissorCreator.JMS){
            return new EmissorJMS();
        } else {
            throw new IllegalArgumentException("Emissor inválido");
        }
    }
}
