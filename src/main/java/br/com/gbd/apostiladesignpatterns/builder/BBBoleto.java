package br.com.gbd.apostiladesignpatterns.builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 11:09:14
    Arquivo: BBBoleto
*/

public class BBBoleto implements Boleto{

    private String sacado;
    private String cedente;
    private double valor;
    private Calendar vencimento;
    private int nossoNumero;

    public BBBoleto(String sacado, String cedente, double valor, Calendar vencimento, int nossoNumero) {
        this.sacado = sacado;
        this.cedente = cedente;
        this.valor = valor;
        this.vencimento = vencimento;
        this.nossoNumero = nossoNumero;
    }

    @Override
    public String getSacado() {
        return sacado;
    }

    @Override
    public String getCedente() {
        return cedente;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public Calendar getVencimento() {
        return vencimento;
    }

    @Override
    public int getNossoNumero() {
        return nossoNumero;
    }
    
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Boleto BB\n");
        
        stringBuilder.append("Sacado: " + this.sacado + "\n");
        
        stringBuilder.append("Cedente: " + this.cedente + "\n");
        
        stringBuilder.append("Valor: " + this.valor + "\n");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        String format = sdf.format(this.vencimento.getTime());
        stringBuilder.append("Vencimento: " + format + "\n");
        
        stringBuilder.append("Nosso número: " + this.nossoNumero);
        
        return stringBuilder.toString();
    }
}
