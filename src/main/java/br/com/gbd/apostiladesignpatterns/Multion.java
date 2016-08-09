package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.criacao.multion.Tema;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 15:05:00
    Arquivo: Multion
*/

public class Multion {

    public static void testaMultion(){
        Tema temaFire = Tema.getInstance(Tema.FIRE);
        
        System.out.println("Tema: " + temaFire.getNome());
        System.out.println("Cor da Fonte: " +temaFire.getCorDaFonte());
        System.out.println("Cor do Fundo: " + temaFire.getCorDoFundo());
        
        Tema temaFire2 = Tema.getInstance(Tema.FIRE);
        
        System.out.println("----------------------------");
        System.out.println("Comparando as referências...");
        System.out.println(temaFire == temaFire2);
    }
}
