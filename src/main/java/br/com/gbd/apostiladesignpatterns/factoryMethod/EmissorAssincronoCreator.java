package br.com.gbd.designpatterns.factoryMethod;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 09:07:37
    Arquivo: EmissorAssincronoCreator
*/

public class EmissorAssincronoCreator extends EmissorCreator {
    
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
