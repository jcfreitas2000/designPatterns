package br.com.gbd.apostiladesignpatterns.estrutural.facade;

/*
    Autor: José Carlos de Freitas
    Data: 09/08/2016, 08:47:59
    Arquivo: PedidoFacade
*/

public class PedidoFacade {

    private Estoque estoque;
    private Financeiro financeiro;
    private PosVenda posVenda;

    public PedidoFacade(Estoque estoque, Financeiro financeiro, PosVenda posVenda) {
        this.estoque = estoque;
        this.financeiro = financeiro;
        this.posVenda = posVenda;
    }

    public void registraPedido(Pedido p){
        this.estoque.enviaProduto(p.getProduto(), p.getEnderecoDeEntrega());
        this.financeiro.fatura(p.getCliente(), p.getProduto());
        this.posVenda.agendaContato(p.getCliente(), p.getProduto());
    }
}
