package br.com.gbd.apostiladesignpatterns.comportamental.command;

import java.util.ArrayList;
import java.util.List;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 13:19:06
    Arquivo: ListaDeComandos
*/

public class ListaDeComandos {

    private List<Comando> comandos = new ArrayList<>();
    
    public void adiciona(Comando comando){
        this.comandos.add(comando);
    }
    
    public void executa(){
        for(Comando comando : this.comandos){
            comando.executa();
        }
    }
}
