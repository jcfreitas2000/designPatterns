package br.com.gbd.apostiladesignpatterns.comportamental.state;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:01:42
    Arquivo: Bandeira2
*/

public class Bandeira2 implements Bandeira{

    @Override
    public double calcularValorDaCorrida(double tempo, double distancia) {
        return 10.0 + tempo * 3.0 + distancia * 4.0;
    }

}
