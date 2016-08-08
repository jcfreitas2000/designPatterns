package br.com.gbd.designpatterns.factoryMethod;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 08:59:53
    Arquivo: EmissorSMS
*/

public class EmissorSMS implements Emissor{
    
    public void enviar(String mensagem){
        System.out.println("Enviando msg por SMS");
        System.out.println(mensagem);
    }
}
