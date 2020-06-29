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
    private int id_produto;
    private String nome;
    private String modelo;
    private String aro;
    private String marchas;
    private String valor;
    private String descricao;
    private String categoria;

    
    
    public int getIdproduto() {
        return id_produto;
    }
    public void setIdproduto(int id_produto) {
        this.id_produto = id_produto;
    }
/*------------------------------------------------------------*/
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
/*------------------------------------------------------------*/    
    public String getModelo() {
        return modelo;
    }
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
/*------------------------------------------------------------*/    
     public String getAro() {
        return aro;
    }
    public void setAro (String aro) {
        this.aro = aro;
    }
/*------------------------------------------------------------*/    
     public String getMarchas() {
        return marchas;
    }
    public void setMarchas(String marchas) {
        this.marchas = marchas;
    }
/*------------------------------------------------------------*/
     public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
/*------------------------------------------------------------*/   
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
/*------------------------------------------------------------*/    
     public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

