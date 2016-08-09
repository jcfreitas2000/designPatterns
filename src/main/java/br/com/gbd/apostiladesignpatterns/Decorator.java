package br.com.gbd.apostiladesignpatterns;

import br.com.gbd.apostiladesignpatterns.estrutural.decorator.Emissor;
import br.com.gbd.apostiladesignpatterns.estrutural.decorator.EmissorBasico;
import br.com.gbd.apostiladesignpatterns.estrutural.decorator.EmissorDecoratorComCompressao;
import br.com.gbd.apostiladesignpatterns.estrutural.decorator.EmissorDecoratorComCriptografia;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 17:16:55
    Arquivo: Decorator
 */
public class Decorator {

    public static void testaDecorator() {
        String msg = "TESTE";

        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(msg);
        
        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(msg);
        
        Emissor emissorCripCompr = new EmissorDecoratorComCriptografia(new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissorCripCompr.envia(msg);
    }
}
