package br.com.gbd.apostiladesignpatterns.estrutural.decorator;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 17:08:16
    Arquivo: EmissorDecoratorComCriptografia
 */
public class EmissorDecoratorComCriptografia extends EmissorDecorator {

    public EmissorDecoratorComCriptografia(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String msg) {
        System.out.println("Enviando mensagem criptografada: ");
        this.getEmissor().envia(criptografa(msg));
    }

    private String criptografa(String mensagem) {
        String mensagemCriptografada = new StringBuilder(mensagem).reverse().toString();
        return mensagemCriptografada;
    }
}
