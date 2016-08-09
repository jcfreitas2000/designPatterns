package br.com.gbd.apostiladesignpatterns.comportamental.visitor;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:50:13
    Arquivo: AtualizadorSalarial
 */
public class AtualizadorSalarial implements AtualizadorDeFuncionario {
    
    @Override
    public void atualiza(Gerente g) {
        g.setSalario(g.getSalario() * 1.43);
    }
    
    @Override
    public void atualiza(Telefonista t) {
        t.setSalario(t.getSalario() * 1.27);
    }
}
