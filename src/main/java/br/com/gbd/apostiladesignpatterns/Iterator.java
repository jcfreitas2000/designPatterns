package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.comportamental.iterator.ListaDeNomes;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 13:42:48
    Arquivo: Iterator
*/

public class Iterator {

    public static void testaIterator(){
        String[] nomes = new String[4];
        nomes[0] = "José";
        nomes[1] = "Carlos";
        nomes[2] = "Freitas";
        nomes[3] = "Henrique";
        
        ListaDeNomes listaDeNomes = new ListaDeNomes(nomes);
        
        //BUGADO
    }
}
