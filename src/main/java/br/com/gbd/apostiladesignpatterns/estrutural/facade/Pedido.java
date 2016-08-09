package br.com.gbd.apostiladesignpatterns.estrutural.facade;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 08:41:25
    Arquivo: Peiddo
*/

public class Pedido {

    private String produto;
    private String cliente;
    private String enderecoDeEntrega;

    public Pedido(String produto, String cliente, String enderecoDeEntrega) {
        this.produto = produto;
        this.cliente = cliente;
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public String getProduto() {
        return produto;
    }

    public String getCliente() {
        return cliente;
    }

    public String getEnderecoDeEntrega() {
        return enderecoDeEntrega;
    }
}
