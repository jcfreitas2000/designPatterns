package br.com.gbd.apostiladesignpatterns.criacao.objectPool;

import java.util.ArrayList;
import java.util.List;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 15:13:21
    Arquivo: FuncionarioPool
*/

public class FuncionarioPool implements Pool<Funcionario>{
    
    private List<Funcionario> funcionarios;

    public FuncionarioPool() {
        this.funcionarios = new ArrayList<>();
        this.funcionarios.add(new Funcionario("José Carlos"));
        this.funcionarios.add(new Funcionario("Tadeu"));
        this.funcionarios.add(new Funcionario("Henrique"));
    }

    @Override
    public Funcionario acquire() {
        if(this.funcionarios.size()>0){
            return this.funcionarios.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public void release(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
}
