package br.com.gbd.apostiladesignpatterns.estrutural.decorator;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 17:00:32
    Arquivo: EmissorDecorator
*/

public abstract class EmissorDecorator implements Emissor{

    private Emissor emissor;
    
    public EmissorDecorator(Emissor emissor){
        this.emissor = emissor;
    }

    @Override
    public abstract void envia(String msg);
    
    public Emissor getEmissor(){
        return this.emissor;
    }
}
