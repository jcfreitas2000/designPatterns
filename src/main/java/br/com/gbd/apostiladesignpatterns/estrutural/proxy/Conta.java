package br.com.gbd.apostiladesignpatterns.estrutural.proxy;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 10:37:19
    Arquivo: Conta
 */
public interface Conta {

    void deposita(double valor);

    void saca(double valor);

    double getSaldo();
}
