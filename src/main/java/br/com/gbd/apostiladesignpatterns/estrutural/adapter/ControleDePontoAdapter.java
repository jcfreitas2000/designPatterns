package br.com.gbd.apostiladesignpatterns.estrutural.adapter;

/*
    Autor: José Carlos de Freitas
    Data: 08/08/2016, 15:41:31
    Arquivo: ControleDePontoAdapter
*/

public class ControleDePontoAdapter extends ControleDePonto {

    private ControleDePontoNovo controleDePontoNovo;
    
    public ControleDePontoAdapter(){
        this.controleDePontoNovo = new ControleDePontoNovo();
    }
    
    @Override
    public void registraEntrada(Funcionario f){
        this.controleDePontoNovo.registra(f, true);
    }
    
    @Override
    public void registraSaida(Funcionario f){
        this.controleDePontoNovo.registra(f, false);
    }
}
