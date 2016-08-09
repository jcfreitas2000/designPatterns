package br.com.gbd.apostiladesignpatterns.estrutural.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 16:01:56
    Arquivo: GeradorDeArquivoTXT
*/

public class GeradorDeArquivoTXT implements GeradorDeArquivo{

    @Override
    public void gera(String conteudo) {
        try {
            PrintStream saida = new PrintStream("arquivo.txt");
            saida.println(conteudo);
            System.out.println("Criou arquivo txt");
            saida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}