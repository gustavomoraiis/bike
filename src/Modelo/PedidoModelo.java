/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author gelat
 */
public class PedidoModelo {

    private int id_pedido;
    private int id_produto;
    private int id_cad_pessoa;
    private double valor_item;
    private int qtd_item;
    
    
    public int getIdpedido() {
        return id_pedido;
    }
    public void setIdpedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getIdproduto() {
        return id_produto;
    }
    public void setIdproduto(int id_produto) {
        this.id_produto = id_produto;
    }
    
    public int getIdcliente() {
        return id_cad_pessoa;
    }
    public void setIdcliente(int id_cad_pessoa) {
        this.id_cad_pessoa = id_cad_pessoa;
    }
    
    public double getValorItem () {
        return valor_item;
    }

    public void setValorItem (double valor_item) {
        this.valor_item = valor_item;
    }

    public int getQtdItem () {
        return qtd_item;
    }

    public void setQtdItem (int qtd_item) {
        this.qtd_item = qtd_item;
    }
    
}
