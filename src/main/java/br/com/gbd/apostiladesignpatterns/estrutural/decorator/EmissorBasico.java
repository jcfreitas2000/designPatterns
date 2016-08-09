package br.com.gbd.apostiladesignpatterns.estrutural.decorator;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 16:59:33
    Arquivo: EmissorBasico
*/

public class EmissorBasico implements Emissor{

    @Override
    public void envia(String msg) {
        System.out.println("Enviando uma mensagem: ");
        System.out.println(msg);
    }
}
