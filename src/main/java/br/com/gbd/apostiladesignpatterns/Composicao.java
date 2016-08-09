package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.estrutural.composicao.Caminho;
import br.com.gbd.apostiladesignpatterns.estrutural.composicao.Trecho;
import br.com.gbd.apostiladesignpatterns.estrutural.composicao.TrechoAndando;
import br.com.gbd.apostiladesignpatterns.estrutural.composicao.TrechoDeCarro;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 16:46:28
    Arquivo: Composicao
*/

public class Composicao {

    public static void testaComposicao(){
        Trecho trecho1 = new TrechoAndando("Vá até a rua A.", 500);
        Trecho trecho2 = new TrechoDeCarro("Vá até o cruzamento B.", 1500);
        Trecho trecho3 = new TrechoDeCarro("Vá até o cruzamento C.", 2000);
        
        Caminho caminho1 = new Caminho();
        caminho1.adiciona(trecho1);
        caminho1.adiciona(trecho2);
        
        System.out.println("Caminho1: ");
        caminho1.imprime();
        
        Caminho caminho2 = new Caminho();
        caminho2.adiciona(caminho1);
        caminho2.adiciona(trecho3);
        System.out.println("---------------------------");
        System.out.println("Caminho 2: ");
        caminho2.imprime();
    }
}
