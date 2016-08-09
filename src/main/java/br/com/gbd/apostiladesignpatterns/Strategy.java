package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.comportamental.strategy.InsertionSorter;
import br.com.gbd.apostiladesignpatterns.comportamental.strategy.SelectionSorter;
import br.com.gbd.apostiladesignpatterns.comportamental.strategy.Sorter;
import java.util.ArrayList;
import java.util.List;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:19:38
    Arquivo: Strategy
*/

public class Strategy {

    public static void testaStrategy(){
        Sorter sorter = new InsertionSorter();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(2);
        list.add(14);
        
        List<Integer> list2 = sorter.sort(list);
        for(Integer i : list2){
            System.out.println(i);
        }
        
        Sorter sorter2 = new SelectionSorter();
        List<Integer> list3 = sorter2.sort(list);
        for(Integer i : list3){
            System.out.println(i);
        }
    }
}
