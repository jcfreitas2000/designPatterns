package br.com.gbd.apostiladesignpatterns.criacao.abstractFactory;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 11:46:29
    Arquivo: ReceptorMatercard
 */
public class ReceptorMatercard implements Receptor {

    @Override
    public String recebe() {
        System.out.println("Recebendo msg da Mastercard.");
        String msg = "Msg da mastercard";
        return msg;
    }
}
