package br.com.gbd.designpatterns.factoryMethod;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 09:01:59
    Arquivo: EmissorJMS
*/

public class EmissorJMS implements Emissor{
    
    public void enviar(String mensagem){
        System.out.println("Enviando msg por JMS");
        System.out.println(mensagem);
    }
}
