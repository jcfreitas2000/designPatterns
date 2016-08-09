package br.com.gbd.apostiladesignpatterns.estrutural.proxy;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 10:38:00
    Arquivo: ContaPadrao
*/

public class ContaPadrao implements Conta{

    private double saldo;
    
    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

}
