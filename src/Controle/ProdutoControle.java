/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ProdutoModelo;
import dao.ConexaoPostgress;
import static dao.ConexaoPostgress.resultset;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author junio
 */
public class ProdutoControle extends ConexaoPostgress{
    
    private StringBuilder sql = new StringBuilder();

    
    public ResultSet consultageral() {
        super.executeSQL("SELECT * FROM cat_produto");
        return super.resultset;
    }
    
    public ResultSet consultaid(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM cat_produto WHERE "
                + " id_cat_produto = " + produto.getIdproduto());
        return super.resultset;
    }

    public ResultSet consultanome(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM cat_produto WHERE "
                + " nome LIKE '%" + produto.getNome()
                + "%'");
        return super.resultset;
    }

    public ResultSet consultadescricao(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM cat_produto WHERE "
                + " descricao LIKE '%" + produto.getDescricao()
                + "%'");
        return super.resultset;
    }

    
    
    

    public void incluir(ProdutoModelo cliente) {
        cliente.setIdproduto(super.ultimasequencia("cat_produto", "id_cat_produto"));
        sql.delete(0, sql.length());
        sql.append("INSERT INTO cat_produto (");
        sql.append("id_cat_produto,");
        sql.append("nome,");
        sql.append("descricao");
        sql.append(") VALUES (");
        sql.append(cliente.getIdproduto()).append(",'");
        sql.append(cliente.getNome()).append("','");
        sql.append(cliente.getDescricao()).append("')");
        super.atualizarSQL(sql.toString());
    }

    public void alterar(ProdutoModelo produto) {
        sql.delete(0, sql.length());
        sql.append("UPDATE cat_produto SET ");
        sql.append("nome = '").append(produto.getNome()).append("', ");
        sql.append("descricao = '").append(produto.getDescricao()).append("' ");
        sql.append(" WHERE ");
        sql.append("id_cat_produto = ").append(produto.getIdproduto());
        super.atualizarSQL(sql.toString());
    }

    public void excluir(ProdutoModelo produto) {
        sql.delete(0, sql.length());
        sql.append("DELETE FROM cat_produto ");
        sql.append(" WHERE ");
        sql.append("id_cat_produto = ").append(produto.getIdproduto());
        super.atualizarSQL(sql.toString());
    }

    public void retornadados(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM cat_produto WHERE "
                + " id_cat_produto = " + produto.getIdproduto());
        try {
            super.resultset.first();
            produto.setIdproduto(resultset.getInt("id_cat_produto"));
            produto.setNome(resultset.getString("nome"));
            produto.setDescricao(resultset.getString("descricao"));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}

