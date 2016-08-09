package br.com.gbd.apostiladesignpatterns.estrutural.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 08:46:20
    Arquivo: PosVenda
*/

public class PosVenda {

    public void agendaContato(String cliente, String produto){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 30);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String format = sdf.format(calendar.getTime());
        
        System.out.println("Entrar em contato com " + cliente + " sobre o produto " + produto + " no dia " + format);
    }
}
