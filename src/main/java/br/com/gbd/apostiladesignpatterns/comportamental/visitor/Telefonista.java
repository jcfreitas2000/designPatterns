package br.com.gbd.apostiladesignpatterns.comportamental.visitor;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:46:30
    Arquivo: Telefonista
*/

public class Telefonista extends Funcionario{

    private int ramal;

    public Telefonista(int ramal, String nome, double salario) {
        super(nome, salario);
        this.ramal = ramal;
    }
    
    public int getRamal(){
        return this.ramal;
    }

    @Override
    public void aceita(AtualizadorDeFuncionario atual) {
        atual.atualiza(this);
    }
}
