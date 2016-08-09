package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.criacao.builder.BBBoletoBuilder;
import br.com.gbd.apostiladesignpatterns.criacao.builder.Boleto;
import br.com.gbd.apostiladesignpatterns.criacao.builder.BoletoBuilder;
import br.com.gbd.apostiladesignpatterns.criacao.builder.GeradorDeBoleto;

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
