package br.com.gbd.apostiladesignpatterns.estrutural.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 15:53:30
    Arquivo: Recibo
 */
public class Recibo implements Documento {

    private String emissor;
    private String favorecido;
    private double valor;
    private GeradorDeArquivo geradorDeArquivo;

    public Recibo(String emissor, String favorecido, double valor, GeradorDeArquivo geradorDeArquivo) {
        this.emissor = emissor;
        this.favorecido = favorecido;
        this.valor = valor;
        this.geradorDeArquivo = geradorDeArquivo;
    }

    @Override
    public void geraArquivo() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Recibo: \n");
        buffer.append("Empresa: ").append(this.emissor).append("\n");
        buffer.append("Cliente: ").append(this.favorecido).append("\n");
        buffer.append("Valor: ").append(this.valor).append("\n");
        
        this.geradorDeArquivo.gera(buffer.toString());
    }
}
