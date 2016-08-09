package br.com.gbd.apostiladesignpatterns.estrutural.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 15:35:44
    Arquivo: ControleDePonto
*/

public class ControleDePonto {
    public void registraEntrada(Funcionario f){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s");
        String format = sdf.format(calendar.getTime());
        System.out.println("Entrada: " + f.getNome() + " às " + format);
    }
    
    public void registraSaida(Funcionario f){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s");
        String format = sdf.format(calendar.getTime());
        System.out.println("Sáida: " + f.getNome() + " às " + format);
    }
}
