package br.com.gbd.apostiladesignpatterns.criacao.builder;

import java.util.Calendar;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 11:21:18
    Arquivo: BBBoletoBuilder
 */
public class BBBoletoBuilder implements BoletoBuilder {

    private String sacado;
    private String cedente;
    private double valor;
    private Calendar vencimento;
    private int nossoNumero;

    @Override
    public void buildSacado(String sacado) {
        this.sacado = sacado;
    }

    @Override
    public void buildCedente(String cedente) {
        this.cedente = cedente;
    }

    @Override
    public void buildValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void buildVencimento(Calendar vencimento) {
        this.vencimento = vencimento;
    }

    @Override
    public void buildNossoNumero(int nossoNumero) {
        this.nossoNumero=nossoNumero;
    }

    @Override
    public Boleto getBoleto() {
        return new BBBoleto(this.sacado, this.cedente, this.valor, this.vencimento, this.nossoNumero);
    }

}
