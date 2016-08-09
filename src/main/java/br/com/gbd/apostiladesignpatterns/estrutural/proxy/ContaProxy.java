package br.com.gbd.apostiladesignpatterns.estrutural.proxy;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 10:39:24
    Arquivo: ContaProxy
*/

public class ContaProxy implements Conta{

    private Conta conta;

    public ContaProxy(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void deposita(double valor) {
        System.out.println("Efetuando o depósito de R$: " + valor);
        this.conta.deposita(valor);
        System.out.println("Depósito efetuado");
    }

    @Override
    public void saca(double valor) {
        System.out.println("Efetuando o saque de R$: " + valor);
        this.conta.saca(valor);
        System.out.println("Saque efetuado");
    }

    @Override
    public double getSaldo() {
        System.out.println("Verificando o saldo");
        return this.conta.getSaldo();
    }
}
