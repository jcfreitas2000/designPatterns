package br.com.gbd.apostiladesignpatterns.criacao.builder;

import java.util.Calendar;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 11:02:45
    Arquivo: BoletoBuilder
 */
public interface BoletoBuilder {

    void buildSacado(String sacado);

    void buildCedente(String cedente);

    void buildValor(double valor);

    void buildVencimento(Calendar vencimento);

    void buildNossoNumero(int nossoNumero);
    
    Boleto getBoleto();
}
