package br.com.gbd.apostiladesignpatterns.comportamental.visitor;

import java.util.ArrayList;
import java.util.List;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:47:21
    Arquivo: Departamento
*/

public class Departamento {

    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    
    public List<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    
    public void aceita(AtualizadorDeFuncionario atual){
        for(Funcionario f : this.funcionarios){
            f.aceita(atual);
        }
    }
}
