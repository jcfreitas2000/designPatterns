package br.com.gbd.apostiladesignpatterns.comportamental.mediator;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 13:55:17
    Arquivo: Taxi
 */
public class Taxi {
    
    private int id;
    private static int contador = 0;
    private CentralDeTaxi central;
    
    public Taxi(int id, CentralDeTaxi central) {
        this.id = id;
        this.central = central;
    }
    
    public int getId() {
        return id;
    }
    
    public void atende() {
        try {
            Thread.sleep((long) (Math.random() * 3000.0));
        } catch (InterruptedException ex) {
            Logger.getLogger(Taxi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.central.adicionaTaxiDisponivel(this);
    }
}
