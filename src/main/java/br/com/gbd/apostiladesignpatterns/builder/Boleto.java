package br.com.gbd.apostiladesignpatterns.builder;

import java.util.Calendar;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 11:07:18
    Arquivo: Boleto
 */
public interface Boleto {

    String getSacado();

    String getCedente();

    double getValor();

    Calendar getVencimento();

    int getNossoNumero();

    String toString();
}
