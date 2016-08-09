package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.comportamental.state.Bandeira;
import br.com.gbd.apostiladesignpatterns.comportamental.state.Bandeira1;
import br.com.gbd.apostiladesignpatterns.comportamental.state.Bandeira2;
import br.com.gbd.apostiladesignpatterns.comportamental.state.Taximetro;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:02:20
    Arquivo: TestaTaximetro
*/

public class State {

    public static void testaState(){
        Bandeira b1 = new Bandeira1();
        Bandeira b2 = new Bandeira2();
        
        Taximetro taximetro = new Taximetro(b1);
        
        double val = taximetro.calculaValorDaCorrida(20, 100);
        System.out.println("Valor da corrida em bandeira 1: " + val);
        
        taximetro.setBandeira(b2);
        
        val = taximetro.calculaValorDaCorrida(20, 100);
        System.out.println("Valor da corrida em bandeira 2: " + val);
    }
}
