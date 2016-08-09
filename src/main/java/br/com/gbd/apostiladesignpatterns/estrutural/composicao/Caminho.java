package br.com.gbd.apostiladesignpatterns.estrutural.composicao;

import java.util.ArrayList;
import java.util.List;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 16:43:33
    Arquivo: Caminho
*/

public class Caminho implements Trecho{

    private List<Trecho> trechos;
    
    public Caminho(){
        this.trechos = new ArrayList<>();
    }
    
    public void adiciona(Trecho trecho){
        this.trechos.add(trecho);
    }
    
    public void remove(Trecho trecho){
        this.trechos.remove(trecho);
    }
    
    @Override
    public void imprime() {
        for(Trecho trecho : this.trechos){
            trecho.imprime();
        }
    }
}
