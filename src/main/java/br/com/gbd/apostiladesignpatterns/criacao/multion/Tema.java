package br.com.gbd.apostiladesignpatterns.criacao.multion;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 14:56:51
    Arquivo: T
*/

public class Tema {

    private String nome;
    private Color corDoFundo;
    private Color corDaFonte;
    
    private static Map<String, Tema> temas = new HashMap<>();
    
    public static final String SKY = "Sky";
    public static final String FIRE = "Fire";
    
    static {
        Tema tema1 = new Tema();
        tema1.setNome(Tema.SKY);
        tema1.setCorDoFundo(Color.BLUE);
        tema1.setCorDaFonte((Color.BLACK));
        
        Tema tema2 = new Tema();
        tema1.setNome(Tema.FIRE);
        tema1.setCorDoFundo(Color.RED);
        tema1.setCorDaFonte((Color.WHITE));
        
        temas.put(tema1.getNome(), tema1);
        temas.put(tema2.getNome(), tema2);
    }

    private Tema() {
    }
    
    public static Tema getInstance(String nomeDoTema){
        return Tema.temas.get(nomeDoTema);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Color getCorDoFundo() {
        return corDoFundo;
    }

    public void setCorDoFundo(Color corDoFundo) {
        this.corDoFundo = corDoFundo;
    }

    public Color getCorDaFonte() {
        return corDaFonte;
    }

    public void setCorDaFonte(Color corDaFonte) {
        this.corDaFonte = corDaFonte;
    }

    public static Map<String, Tema> getTemas() {
        return temas;
    }

    public static void setTemas(Map<String, Tema> temas) {
        Tema.temas = temas;
    }
}
