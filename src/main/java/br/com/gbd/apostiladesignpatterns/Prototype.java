package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.criacao.prototype.Campanha;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 12:29:50
    Arquivo: Prototype
*/

public class Prototype {

    public static void testaPrototype(){
        String nome = "Campanha de doação";
        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE, 30);
        
        Set<String> hashSet = new HashSet<>();
        
        hashSet.add("agasalho");
        hashSet.add("roupa");
        hashSet.add("frio");
        
        Campanha campanha = new Campanha(nome, vencimento, hashSet);
        
        Campanha clone = campanha.clone();
        
        System.out.println(clone);
    }
}
