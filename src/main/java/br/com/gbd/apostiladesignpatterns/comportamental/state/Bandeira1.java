package br.com.gbd.apostiladesignpatterns.comportamental.state;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:00:57
    Arquivo: Bandeira1
*/

public class Bandeira1 implements Bandeira{

    @Override
    public double calcularValorDaCorrida(double tempo, double distancia) {
        return 5.0 + tempo * 1.5 + distancia * 1.7;
    }

}
