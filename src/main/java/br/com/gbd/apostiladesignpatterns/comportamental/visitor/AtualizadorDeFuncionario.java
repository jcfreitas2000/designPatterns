package br.com.gbd.apostiladesignpatterns.comportamental.visitor;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:49:31
    Arquivo: AtualizadoDeFuncionario
 */
public interface AtualizadorDeFuncionario {

    void atualiza(Gerente g);

    void atualiza(Telefonista t);
}
