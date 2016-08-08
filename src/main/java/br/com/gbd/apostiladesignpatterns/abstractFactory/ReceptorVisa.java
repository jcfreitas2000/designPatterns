package br.com.gbd.apostiladesignpatterns.abstractFactory;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 11:45:34
    Arquivo: ReceptorVisa
*/

public class ReceptorVisa implements Receptor{

    @Override
    public String recebe() {
        System.out.println("Recebendo msg da visa.");
        String msg = "Msg da visa.";
        return msg;
    }
}
