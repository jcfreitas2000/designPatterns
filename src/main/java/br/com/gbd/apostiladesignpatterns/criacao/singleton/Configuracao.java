package br.com.gbd.apostiladesignpatterns.criacao.singleton;

import java.util.HashMap;
import java.util.Map;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 12:50:56
    Arquivo: Configuracao
 */
public class Configuracao {

    private Map<String, String> propriedades;
    private static Configuracao instance;

    private Configuracao() {
        this.propriedades = new HashMap<>();
        this.propriedades.put("time-zone", "America/São Paulo");
        this.propriedades.put("currency-code", "BRL");
    }

    public static Configuracao getInstance() {
        if (Configuracao.instance == null) {
            Configuracao.instance = new Configuracao();
        }

        return Configuracao.instance;
    }

    public String getPropriedade(String nomeDaPropriedade){
        return this.propriedades.get(nomeDaPropriedade);
    }
}