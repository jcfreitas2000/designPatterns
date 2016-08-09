package br.com.gbd.apostiladesignpatterns.estrutural.flyweight;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 09:11:45
    Arquivo: Slide
*/

public class Slide {
    private TemaFlyweight tema;
    private String titulo;
    private String texto;

    public Slide(TemaFlyweight tema, String titulo, String texto) {
        this.tema = tema;
        this.titulo = titulo;
        this.texto = texto;
    }
    
    public void imprime(){
        this.tema.imprime(titulo, texto);
    }
}
