package br.com.gbd.apostiladesignpatterns.comportamental.strategy;

import java.util.List;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:11:25
    Arquivo: Sorter
*/

public interface Sorter {
    <T extends Comparable<? super T>> List<T> sort(List<T> list);
}
