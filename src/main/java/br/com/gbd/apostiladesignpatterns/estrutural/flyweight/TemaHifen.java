package br.com.gbd.apostiladesignpatterns.estrutural.flyweight;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 09:01:45
    Arquivo: TemaHifen
*/

public class TemaHifen implements TemaFlyweight{

    @Override
    public void imprime(String titulo, String texto) {
        System.out.println("TEMA HIFEN");
        System.out.println(titulo);
        System.out.println(texto);
    }
}
