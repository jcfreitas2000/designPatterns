package br.com.gbd.apostiladesignpatterns.comportamental.iterator;

import java.util.Iterator;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 13:31:21
    Arquivo: ListaDeNomes
 */
public class ListaDeNomes implements Iterable<String> {

    private String[] nomes;
    private int length;

    public ListaDeNomes(String[] nomes) {
        this.nomes = nomes;
        this.length = this.nomes.length;
    }

    @Override
    public Iterator<String> iterator() {
        return (Iterator<String>) this.new ListaDeNomesIterator();
    }

    private class ListaDeNomesIterator implements Iterable<String> {

        private int i = 0;

        public ListaDeNomesIterator() {
        }
        
        public boolean hasNext() {
            return (this.i) < ListaDeNomes.this.length;
        }

        public String next() {
            return ListaDeNomes.this.nomes[i++];
        }

        public void remove() {
            ListaDeNomes.this.nomes[i] = null;
            
            for (int j = i; (j + 1) < ListaDeNomes.this.length; j++) {
                ListaDeNomes.this.nomes[j] = ListaDeNomes.this.nomes[j + 1];
            }

            ListaDeNomes.this.length--;
        }

        @Override
        public Iterator<String> iterator() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
