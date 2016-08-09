package br.com.gbd.apostiladesignpatterns.comportamental.visitor;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:52:09
    Arquivo: Atualizavel
*/

public interface Atualizavel {

    void aceita(AtualizadorDeFuncionario atual);
}
