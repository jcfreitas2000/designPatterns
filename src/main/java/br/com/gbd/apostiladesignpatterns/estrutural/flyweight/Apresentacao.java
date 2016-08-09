package br.com.gbd.apostiladesignpatterns.estrutural.flyweight;

import java.util.ArrayList;
import java.util.List;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 09:15:38
    Arquivo: Apresentacao
*/

public class Apresentacao {

    private List<Slide> slides = new ArrayList<>();
    
    public void adicionaSlide(Slide slide){
        slides.add(slide);
    }
    
    public void imprime(){
        for(Slide slide : this.slides){
            slide.imprime();
            System.out.println();
        }
    }
}
