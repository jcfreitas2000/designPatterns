package br.com.gbd.apostiladesignpatterns.estrutural.flyweight;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 09:02:49
    Arquivo: TemaGBD
 */
public class TemaGBD implements TemaFlyweight {

    @Override
    public void imprime(String titulo, String texto) {
        System.out.println("TEMA GBD");
        System.out.println(titulo);
        System.out.println(texto);
    }
}
