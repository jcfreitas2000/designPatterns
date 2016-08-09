package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.estrutural.flyweight.Apresentacao;
import br.com.gbd.apostiladesignpatterns.estrutural.flyweight.Slide;
import br.com.gbd.apostiladesignpatterns.estrutural.flyweight.TemaFlyweightFactory;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 09:17:39
    Arquivo: Flyweight
*/

public class Flyweight {

    public static void testaFlyweight(){
        Apresentacao a = new Apresentacao();
        a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.GBD), "TESTE", "Teste 1"));
        a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.ASTERISCCO), "TESTE", "Teste 2"));
        a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.HIFEN), "TESTE", "Teste 3"));
        a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.ASTERISCCO), "TESTE", "Teste 4"));
        
        a.imprime();
    }
}
