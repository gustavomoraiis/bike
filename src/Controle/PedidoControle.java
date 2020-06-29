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
import Modelo.ClienteModelo;

/**
 *
 * @author gelat
 */
public class PedidoControle extends ConexaoPostgress {

    private StringBuilder sql = new StringBuilder();

    
    public ResultSet consultageral() {
        super.executeSQL("SELECT * FROM cad_pessoa");
        return super.resultset;
    }
    
    public ResultSet consultaid(ClienteModelo cliente) {
        super.executeSQL("SELECT * FROM cad_pessoa WHERE "
                + " id_pessoa = " + cliente.getIdpessoa());
        return super.resultset;
    }

    public ResultSet consultanome(ClienteModelo cliente) {
        super.executeSQL("SELECT * FROM cad_pessoa WHERE "
                + " nome LIKE '%" + cliente.getNome()
                + "%'");
        return super.resultset;
    }

    public ResultSet consultacpf(ClienteModelo cliente) {
        super.executeSQL("SELECT * FROM cad_pessoa WHERE "
                + " cpf LIKE '%" + cliente.getCpf()
                + "%'");
        return super.resultset;
    }
    
    public ResultSet consultalogradouro(ClienteModelo cliente) {
        super.executeSQL("SELECT * FROM cad_pessoa WHERE "
                + " logradouro LIKE '%" + cliente.getLogradouro()
                + "%'");
        return super.resultset;
    }
    
    public ResultSet consultafone(ClienteModelo cliente) {
        super.executeSQL("SELECT * FROM cad_pessoa WHERE "
                + " fone LIKE '%" + cliente.getFone()
                + "%'");
        return super.resultset;
    }

    
    
    

    public void incluir(ClienteModelo cliente) {
        cliente.setIdpessoa(super.ultimasequencia("cad_pessoa", "id_pessoa"));
        sql.delete(0, sql.length());
        sql.append("INSERT INTO cad_pessoa (");
        sql.append("id_pessoa,");
        sql.append("nome,");
        sql.append("cpf,");
        sql.append("logradouro,");
        sql.append("fone");
        sql.append(") VALUES (");
        sql.append(cliente.getIdpessoa()).append(",'");
        sql.append(cliente.getNome()).append("','");
        sql.append(cliente.getCpf()).append("','");
        sql.append(cliente.getLogradouro()).append("','");
        sql.append(cliente.getFone()).append("')");
        super.atualizarSQL(sql.toString());
    }

    public void alterar(ClienteModelo cliente) {
        sql.delete(0, sql.length());
        sql.append("UPDATE cad_pessoa SET ");
        sql.append("nome = '").append(cliente.getNome()).append("', ");
        sql.append("cpf = '").append(cliente.getCpf()).append("', ");
        sql.append("logradouro = '").append(cliente.getLogradouro()).append("', ");
        sql.append("fone = '").append(cliente.getFone()).append("' ");
        sql.append(" WHERE ");
        sql.append("id_pessoa = ").append(cliente.getIdpessoa());
        super.atualizarSQL(sql.toString());
    }

    public void excluir(ClienteModelo cliente) {
        sql.delete(0, sql.length());
        sql.append("DELETE FROM cad_pessoa ");
        sql.append(" WHERE ");
        sql.append("id_pessoa = ").append(cliente.getIdpessoa());
        super.atualizarSQL(sql.toString());
    }

    public void retornadados(ClienteModelo cliente) {
        super.executeSQL("SELECT * FROM cad_pessoa WHERE "
                + " id_pessoa = " + cliente.getIdpessoa());
        try {
            super.resultset.first();
            cliente.setIdpessoa(resultset.getInt("id_pessoa"));
            cliente.setNome(resultset.getString("nome"));
            cliente.setCpf(resultset.getString("cpf"));
            cliente.setLogradouro(resultset.getString("logradouro"));
            cliente.setFone(resultset.getString("fone"));
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
