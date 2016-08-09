package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.comportamental.templateMethod.ContaCorrente;
import br.com.gbd.apostiladesignpatterns.comportamental.templateMethod.Conta;
import br.com.gbd.apostiladesignpatterns.comportamental.templateMethod.ContaPoupanca;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 15:34:40
    Arquivo: TemplateMethod
*/

public class TemplateMethod {

    public static void testaTemplateMethod(){
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        cc.deposita(100);
        cc.saca(10);
        
        cp.deposita(100);
        cp.saca(10);
        
        System.out.println("Saldo da conta corrente: " + cc.getSaldo());
        System.out.println("Saldo da conta poupança: " + cp.getSaldo());
    }
}
