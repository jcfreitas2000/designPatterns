package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.estrutural.proxy.Conta;
import br.com.gbd.apostiladesignpatterns.estrutural.proxy.ContaPadrao;
import br.com.gbd.apostiladesignpatterns.estrutural.proxy.ContaProxy;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 10:41:55
    Arquivo: Proxy
*/

public class Proxy {

    public static void testaProxy(){
        Conta contaPadrao = new ContaPadrao();
        Conta contaProxy = new ContaProxy(contaPadrao);
        
        contaProxy.deposita(1000);
        contaProxy.saca(500);
        
        System.out.println("Saldo: " + contaProxy.getSaldo());
    }
}
