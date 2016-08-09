package br.com.gbd.apostiladesignpatterns.criacao.builder;

import java.util.Calendar;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 11:25:50
    Arquivo: GeradorDeBoleto
*/

public class GeradorDeBoleto {

    private BoletoBuilder boletoBuilder;
    
    public GeradorDeBoleto(BoletoBuilder boletoBuilder){
        this.boletoBuilder = boletoBuilder;
    }
    
    public Boleto geraBoleto(){
        this.boletoBuilder.buildSacado("José");
        this.boletoBuilder.buildCedente("teste");
        this.boletoBuilder.buildValor(100.20);
        
        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE, 30);
        this.boletoBuilder.buildVencimento(vencimento);
        
        this.boletoBuilder.buildNossoNumero(1234);
        
        Boleto boleto = this.boletoBuilder.getBoleto();
        
        return boleto;
    }
}
