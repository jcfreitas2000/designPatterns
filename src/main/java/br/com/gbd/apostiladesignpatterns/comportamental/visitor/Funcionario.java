package br.com.gbd.apostiladesignpatterns.comportamental.visitor;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:44:10
    Arquivo: Funcionario
*/

public abstract class Funcionario implements Atualizavel{
    
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
