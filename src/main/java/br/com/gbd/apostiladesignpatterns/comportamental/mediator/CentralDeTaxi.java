package br.com.gbd.apostiladesignpatterns.comportamental.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 13:54:19
    Arquivo: CentralDeTaxi
*/

public class CentralDeTaxi {

    private List<Taxi> taxisLivres = new ArrayList<Taxi>();
    private List<Passageiro> passageirosEmEspera = new ArrayList<>();
    
    public synchronized void adicionaTaxiDisponivel(Taxi taxi){
        System.out.println("Taxi " + taxi.getId() + " voltou para a fila.");
        taxisLivres.add(taxi);
        this.notifyAll();
    }
    
    public void pedeTaxi(Passageiro passageiro){
        Taxi taxi = this.esperaTaxi(passageiro);
        System.out.println("Taxi " + taxi.getId() + " levando " + passageiro.getNome());
        taxi.atende();
    }
    
    private Taxi esperaTaxi(Passageiro passageiro){
        this.passageirosEmEspera.add(passageiro);
        synchronized (this){
            while (this.taxisLivres.isEmpty() || !this.passageirosEmEspera.get(0).equals(passageiro)){
                try {
                    this.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(CentralDeTaxi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            this.passageirosEmEspera.remove(0);
            return this.taxisLivres.remove(0);
        }
    }
}
