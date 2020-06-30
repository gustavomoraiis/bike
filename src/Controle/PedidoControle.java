/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import dao.ConexaoPostgress;
import static dao.ConexaoPostgress.resultset;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.PedidoModelo;

/**
 *
 * @author gelat
 */
public class PedidoControle extends ConexaoPostgress {

    private StringBuilder sql = new StringBuilder();

    
    public ResultSet consultageral() {
        super.executeSQL("SELECT * FROM pedido INNER JOIN cad_pessoa ON pedido.id_cad_pessoa = cad_pessoa.id_pessoa");
        return super.resultset;
    }
    
    public ResultSet consultaid(PedidoModelo pedido) {
        super.executeSQL("SELECT * FROM pedido INNER JOIN cad_pessoa ON pedido.id_cad_pessoa = cad_pessoa.id_pessoa "
                + " id_pedido = " + pedido.getIdpedido());
        return super.resultset;
    }
    
    public ResultSet consultaproduto(PedidoModelo pedido) {
        super.executeSQL("SELECT * FROM pedido INNER JOIN cad_pessoa ON pedido.id_cad_pessoa = cad_pessoa.id_pessoa "
                + " id_produto = " + pedido.getIdproduto());
        return super.resultset;
    }
    
    public ResultSet consultacliente(PedidoModelo pedido) {
        super.executeSQL("SELECT * FROM pedido INNER JOIN cad_pessoa ON pedido.id_cad_pessoa = cad_pessoa.id_pessoa "
                + " id_cad_pessoa = " + pedido.getIdcliente());
        return super.resultset;
    }
    
    public ResultSet consultavalor(PedidoModelo pedido) {
        super.executeSQL("SELECT * FROM pedido INNER JOIN cad_pessoa ON pedido.id_cad_pessoa = cad_pessoa.id_pessoa "
                + " valor_item = " + pedido.getValorItem());
        return super.resultset;
    }
    
    public ResultSet consultaqtd(PedidoModelo pedido) {
        super.executeSQL("SELECT * FROM pedido INNER JOIN cad_pessoa ON pedido.id_cad_pessoa = cad_pessoa.id_pessoa "
                + " qtd_item = " + pedido.getQtdItem());
        return super.resultset;
    }
    

    
    
    

    public void incluir(PedidoModelo pedido) {
        pedido.setIdpedido(super.ultimasequencia("pedido", "id_pedido"));
        sql.delete(0, sql.length());
        sql.append("INSERT INTO pedido (");
        sql.append("id_pedido,");
        sql.append("id_produto,");
        sql.append("id_cat_pessoa,");
        sql.append("valor_item,");
        sql.append("qtd_item");
        sql.append(") VALUES (");
        sql.append(pedido.getIdpedido()).append(",'");
        sql.append(pedido.getIdproduto()).append("','");
        sql.append(pedido.getIdcliente()).append("','");
        sql.append(pedido.getValorItem()).append("','");
        sql.append(pedido.getQtdItem()).append("')");
        super.atualizarSQL(sql.toString());
    }

    public void alterar(PedidoModelo pedido) {
        sql.delete(0, sql.length());
        sql.append("UPDATE pedido SET ");
        sql.append("id_produto = '").append(pedido.getIdproduto()).append("', ");
        sql.append("id_cad_pessoa = '").append(pedido.getIdcliente()).append("', ");
        sql.append("valor_item = '").append(pedido.getValorItem()).append("', ");
        sql.append("qtd_item = '").append(pedido.getQtdItem()).append("' ");
        sql.append(" WHERE ");
        sql.append("id_pedido = ").append(pedido.getIdpedido());
        super.atualizarSQL(sql.toString());
    }

    public void excluir(PedidoModelo pedido) {
        sql.delete(0, sql.length());
        sql.append("DELETE FROM pedido ");
        sql.append(" WHERE ");
        sql.append("id_pedido = ").append(pedido.getIdpedido());
        super.atualizarSQL(sql.toString());
    }

    public void retornadados(PedidoModelo pedido) {
        super.executeSQL("SELECT * FROM pedido WHERE "
                + " id_pedido = " + pedido.getIdpedido());
        try {
            super.resultset.first();
            pedido.setIdpedido(resultset.getInt("id_pedido"));
            pedido.setIdproduto(resultset.getInt("id_produto"));
            pedido.setIdcliente(resultset.getInt("id_cad_pessoa"));
            pedido.setValorItem(resultset.getFloat("valor_item"));
            pedido.setQtdItem(resultset.getInt("qtd_item"));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
