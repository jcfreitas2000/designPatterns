package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.estrutural.adapter.ControleDePonto;
import br.com.gbd.apostiladesignpatterns.estrutural.adapter.ControleDePontoAdapter;
import br.com.gbd.apostiladesignpatterns.estrutural.adapter.Funcionario;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 15:43:19
    Arquivo: Adapter
*/

public class Adapter {

    public static void testaAdapter(){
        ControleDePonto controleDePonto = new ControleDePontoAdapter();
        Funcionario funcionario = new Funcionario("José Carlos");
        controleDePonto.registraEntrada(funcionario);
        controleDePonto.registraSaida(funcionario);
   }
}
