package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.estrutural.facade.Estoque;
import br.com.gbd.apostiladesignpatterns.estrutural.facade.Financeiro;
import br.com.gbd.apostiladesignpatterns.estrutural.facade.Pedido;
import br.com.gbd.apostiladesignpatterns.estrutural.facade.PedidoFacade;
import br.com.gbd.apostiladesignpatterns.estrutural.facade.PosVenda;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 08:52:22
    Arquivo: Facade
*/

public class Facade {

    public static void testaFacade(){
        PedidoFacade pf = new PedidoFacade(new Estoque(), new Financeiro(), new PosVenda());
        Pedido p = new Pedido("Notebook", "José Carlos", "Rua A, 123");
        pf.registraPedido(p);
    }
}
