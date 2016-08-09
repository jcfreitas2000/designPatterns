package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.estrutural.bridge.GeradorDeArquivo;
import br.com.gbd.apostiladesignpatterns.estrutural.bridge.GeradorDeArquivoTXT;
import br.com.gbd.apostiladesignpatterns.estrutural.bridge.Recibo;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 16:09:50
    Arquivo: Bridge
*/

public class Bridge {
    
    public static void testaBridge(){
        GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoTXT();
        Recibo recibo = new Recibo("Treinamento Design Patterns", "José Carlos", 1000, geradorDeArquivoTXT);

        recibo.geraArquivo();
    }
}
