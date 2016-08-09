package br.com.gbd.apostiladesignpatterns.estrutural.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 08:42:37
    Arquivo: Estoque
*/

public class Estoque {

    public void enviaProduto(String produto, String enderecoDeEntrega){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 2);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String format = sdf.format(calendar.getTime());
        
        System.out.println("O produto " + produto + " será entregue no endereco " 
        + enderecoDeEntrega + " até as 18h do dia " + format);
    }
}
