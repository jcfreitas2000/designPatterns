package br.com.gbd.designpatterns.factoryMethod;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 09:21:59
    Arquivo: EmissorSincronoCreator
*/

public class EmissorSincronoCreator extends EmissorCreator {
    
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
