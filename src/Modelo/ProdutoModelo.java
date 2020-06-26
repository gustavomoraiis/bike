/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author junio
 */
public class ProdutoModelo {
    private int id_cat_produto;
    private String nome;
    private String descricao;

    
    
    public int getIdproduto() {
        return id_cat_produto;
    }

    public void setIdproduto(int id_cat_produto) {
        this.id_cat_produto = id_cat_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

