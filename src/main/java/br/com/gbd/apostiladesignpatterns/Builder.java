package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.builder.BBBoletoBuilder;
import br.com.gbd.apostiladesignpatterns.builder.Boleto;
import br.com.gbd.apostiladesignpatterns.builder.BoletoBuilder;
import br.com.gbd.apostiladesignpatterns.builder.GeradorDeBoleto;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 11:33:03
    Arquivo: Bulder
*/

public class Builder {

    public static void testaGeradorDeBoletos(){
        BoletoBuilder boletoBuilder = new BBBoletoBuilder();
        GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
        Boleto boleto = geradorDeBoleto.geraBoleto();
        
        System.out.println(boleto);
    }
}
