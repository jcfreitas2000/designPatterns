package br.com.gbd.apostiladesignpatterns.comportamental.observer;

import java.util.HashSet;
import java.util.Set;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 14:39:57
    Arquivo: Acao
*/

public class Acao {

    private String codigo;
    private double valor;

    Set<AcaoObserver> interessados = new HashSet<>();
    
    public Acao(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }
    
    public void registraInteressado(AcaoObserver interessado){
        this.interessados.add(interessado);
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        for(AcaoObserver interessado : this.interessados){
            interessado.notificaAlteracao(this);
        }
    }
}
