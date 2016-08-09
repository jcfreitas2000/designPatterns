package br.com.gbd.apostiladesignpatterns.comportamental.visitor;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:45:15
    Arquivo: Gerente
*/

public class Gerente extends Funcionario{

    private String senha;

    public Gerente(String senha, String nome, double salario) {
        super(nome, salario);
        this.senha = senha;
    }

    public String getSenha(){
        return this.senha;
    }

    @Override
    public void aceita(AtualizadorDeFuncionario atual) {
        atual.atualiza(this);
    }
}
