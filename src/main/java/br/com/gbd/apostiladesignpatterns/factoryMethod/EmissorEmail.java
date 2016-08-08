package br.com.gbd.designpatterns.factoryMethod;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 09:01:15
    Arquivo: EmissorEmail
*/

public class EmissorEmail implements Emissor{
    
    public void enviar(String mensagem){
        System.out.println("Enviando msg por e-mail");
        System.out.println(mensagem);
    }
}
