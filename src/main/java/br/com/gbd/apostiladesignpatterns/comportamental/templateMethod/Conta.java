package br.com.gbd.apostiladesignpatterns.comportamental.templateMethod;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:31:37
    Arquivo: Conta
*/

public abstract class Conta {

    private double saldo;
    
    public void deposita(double valor){
        this.saldo += valor;
        this.saldo -= this.calculaTaxa();
    }
    
    public void saca(double valor){
        this.saldo -= valor;
        this.saldo -= this.calculaTaxa();
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public abstract double calculaTaxa();
}
