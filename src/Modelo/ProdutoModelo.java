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
    private String modelo;
    private int aro;
    private int marchas;
    private float valor;
    private String descricao;
    private String categoria;

    
    
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
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    
     public int getAro() {
        return aro;
    }

    public void setAro (int aro) {
        this.aro = aro;
    }
    
     public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int Marchas) {
        this.marchas = marchas;
    }
    
     public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
     public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

