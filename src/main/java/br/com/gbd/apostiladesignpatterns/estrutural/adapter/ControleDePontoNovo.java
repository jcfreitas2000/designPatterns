package br.com.gbd.apostiladesignpatterns.estrutural.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 15:39:37
    Arquivo: ControleDePontoNovo
 */
public class ControleDePontoNovo {

    public void registra(Funcionario f, boolean entrada) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s");
        String format = sdf.format(calendar.getTime());

        if (entrada) {
            System.out.println("Entrada: " + f.getNome() + " às " + format);
        } else {
            System.out.println("Saída: " + f.getNome() + " às " + format);
        }
    }
}
