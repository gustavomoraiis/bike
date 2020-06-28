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
        super.executeSQL("SELECT * FROM produto");
        return super.resultset;
    }
    
    public ResultSet consultaid(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM produto WHERE "
                + " id_produto = " + produto.getIdproduto());
        return super.resultset;
    }

    public ResultSet consultanome(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM produto WHERE "
                + " nome LIKE '%" + produto.getNome()
                + "%'");
        return super.resultset;
    }
     public ResultSet consultamodelo(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM produto WHERE "
                + " modelo LIKE '%" + produto.getModelo()
                + "%'");
        return super.resultset;
    }
       public ResultSet consultaaro(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM produto WHERE "
                + " aro LIKE '%" + produto.getAro()
                + "%'");
        return super.resultset;
    }
       public ResultSet consultamarchas(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM produto WHERE "
                + " marchas LIKE '%" + produto.getMarchas()
                + "%'");
        return super.resultset;
    }
        public ResultSet consultavalor(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM produto WHERE "
                + " valor LIKE '%" + produto.getValor()
                + "%'");
        return super.resultset;
    }
    public ResultSet consultadescricao(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM produto WHERE "
                + " descricao LIKE '%" + produto.getDescricao()
                + "%'");
        return super.resultset;
    }
    public ResultSet consultacategoria(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM produto WHERE "
                + " categoria LIKE '%" + produto.getCategoria()
                + "%'");
        return super.resultset;
    }
    
    
    

    public void incluir(ProdutoModelo produto) {
        produto.setIdproduto(super.ultimasequencia("produto", "id_produto"));
        sql.delete(0, sql.length());
        sql.append("INSERT INTO produto (");
        sql.append("id_produto,");
        sql.append("nome,");
        sql.append("modelo,");
        sql.append("aro,");
        sql.append("marchas,");
        sql.append("valor,");
        sql.append("descricao,");
        sql.append("categoria");
        sql.append(") VALUES (");
        sql.append(produto.getIdproduto()).append(",'");
        sql.append(produto.getNome()).append("','");
        sql.append(produto.getModelo()).append("','");
        sql.append(produto.getAro()).append("','");
        sql.append(produto.getMarchas()).append("','");
        sql.append(produto.getValor()).append("','");
        sql.append(produto.getDescricao()).append("','");
        sql.append(produto.getCategoria()).append("')");
        super.atualizarSQL(sql.toString());
    }

    public void alterar(ProdutoModelo produto) {
        sql.delete(0, sql.length());
        sql.append("UPDATE produto SET ");
        sql.append("nome = '").append(produto.getNome()).append("', ");
        sql.append("modelo = '").append(produto.getModelo()).append("', ");
        sql.append("aro = '").append(produto.getAro()).append("', ");
        sql.append("marchas = '").append(produto.getMarchas()).append("', ");
        sql.append("valor = '").append(produto.getValor()).append("', ");
        sql.append("descricao = '").append(produto.getDescricao()).append("', ");
        sql.append("categoria = '").append(produto.getCategoria()).append("' ");
        sql.append(" WHERE ");
        sql.append("id_produto = ").append(produto.getIdproduto());
        super.atualizarSQL(sql.toString());
    }

    public void excluir(ProdutoModelo produto) {
        sql.delete(0, sql.length());
        sql.append("DELETE FROM produto ");
        sql.append(" WHERE ");
        sql.append("id_produto = ").append(produto.getIdproduto());
        super.atualizarSQL(sql.toString());
    }

    public void retornadados(ProdutoModelo produto) {
        super.executeSQL("SELECT * FROM produto WHERE "
                + " id_produto = " + produto.getIdproduto());
        try {
            super.resultset.first();
            produto.setIdproduto(resultset.getInt("id_produto"));
            produto.setNome(resultset.getString("nome"));
            produto.setModelo(resultset.getString("modelo"));
            produto.setAro(resultset.getInt("aro"));
            produto.setMarchas(resultset.getInt("marchas"));
            produto.setValor(resultset.getInt("valor"));
            produto.setDescricao(resultset.getString("descricao"));
            produto.setCategoria(resultset.getString("categoria"));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}

