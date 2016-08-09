package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.comportamental.mediator.CentralDeTaxi;
import br.com.gbd.apostiladesignpatterns.comportamental.mediator.Passageiro;
import br.com.gbd.apostiladesignpatterns.comportamental.mediator.Taxi;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 14:23:19
    Arquivo: Mediator
 */
public class Mediator {

    public static void testaMediator() {
        CentralDeTaxi central = new CentralDeTaxi();

        Passageiro p1 = new Passageiro("José", central);
        Passageiro p2 = new Passageiro("Carlos", central);
        Passageiro p3 = new Passageiro("Freitas", central);

        Taxi t1 = new Taxi(1, central);
        central.adicionaTaxiDisponivel(t1);

        Taxi t2 = new Taxi(2, central);
        central.adicionaTaxiDisponivel(t2);
        
        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
    }
}
