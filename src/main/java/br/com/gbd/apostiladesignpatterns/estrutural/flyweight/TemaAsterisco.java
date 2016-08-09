package br.com.gbd.apostiladesignpatterns.estrutural.flyweight;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 09:02:24
    Arquivo: TemaAsterisco
*/

public class TemaAsterisco implements TemaFlyweight{

    @Override
    public void imprime(String titulo, String texto) {
        System.out.println("TEMA ASTERISCO");
        System.out.println(titulo);
        System.out.println(texto);
    }
}
