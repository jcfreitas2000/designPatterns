package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.comportamental.visitor.AtualizadorDeFuncionario;
import br.com.gbd.apostiladesignpatterns.comportamental.visitor.AtualizadorSalarial;
import br.com.gbd.apostiladesignpatterns.comportamental.visitor.Departamento;
import br.com.gbd.apostiladesignpatterns.comportamental.visitor.Funcionario;
import br.com.gbd.apostiladesignpatterns.comportamental.visitor.Gerente;
import br.com.gbd.apostiladesignpatterns.comportamental.visitor.Telefonista;
import java.util.ArrayList;
import java.util.List;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 16:03:17
    Arquivo: Visitor
*/

public class Visitor {

    public static void testaVisitor(){
        List<Departamento> lista = new ArrayList<>();
        Departamento departamento = new Departamento("Departamento1");
        Gerente gerente = new Gerente("1234", "Gerente1", 2000);
        Telefonista telefonista = new Telefonista(2, "Telefonista1", 1000);
        departamento.getFuncionarios().add(gerente);
        departamento.getFuncionarios().add(telefonista);
        
        lista.add(departamento);
        
        departamento = new Departamento("Departamento2");
        gerente = new Gerente("1234", "Gerente2", 2000);
        telefonista = new Telefonista(3, "Telefonista2", 1000);
        departamento.getFuncionarios().add(gerente);
        departamento.getFuncionarios().add(telefonista);
        gerente = new Gerente("1234", "Gerente3", 2000);
        departamento.getFuncionarios().add(gerente);
        
        lista.add(departamento);
        
        AtualizadorDeFuncionario atual = new AtualizadorSalarial();
        
        for(Departamento d : lista){
            d.aceita(atual);
        }
        
        for(Departamento d : lista){
            for(Funcionario f : d.getFuncionarios()){
                System.out.println("Nome: " + f.getNome() + " - Salário: " + f.getSalario());
            }
        }
    }
}
