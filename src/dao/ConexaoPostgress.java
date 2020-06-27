package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author acsantana
 */
public class ConexaoPostgress {

    public static Connection ConexaoPostgress;
    public static Statement statement;
    public static ResultSet resultset;
    public int retorno = 0;

    public ConexaoPostgress() { // metodo construtor
        conecta();
        
    }

    public static Connection conecta() {
        if (ConexaoPostgress != null) {
            return ConexaoPostgress;
        } else {
            try {
                Class.forName("org.postgresql.Driver");
                ConexaoPostgress = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bike",
                        "postgres", "26062001");

                System.out.println("Conectado");
                return ConexaoPostgress;

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Driver não localizado: " + ex);

                ex.printStackTrace();
                return null;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conexão com a fonte  de dados: " + ex);
                ex.printStackTrace();
                return null;
            }
        }
    }

    public void desconecta() {
        boolean result = true;
        try {
            ConexaoPostgress.close();
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Não foi possivel fechar o banco de dados: " + "\n" + fecha);
            result = false;
        }
    }

    public void executeSQL(String sql) {
        try {
            statement = ConexaoPostgress.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível localizar o registro \n" + sqlex);
        }
    }

    public void atualizarSQL(String sql) {
        try {
            statement = ConexaoPostgress.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            retorno = 0;
            retorno = statement.executeUpdate(sql);
            if (retorno == 1) {
                JOptionPane.showMessageDialog(null, "Operação realizada com sucesso");
            }
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir ou alterar " + sqlex);
            retorno = 0;
        }
    }

    public int ultimasequencia(String tabela, String atributo) {
        executeSQL("SELECT COALESCE(MAX(" + atributo + "),0) + 1 AS ULTIMO FROM "
                + tabela);
        int retorno = 0;
        try {
            resultset.first();
            retorno = resultset.getInt("ULTIMO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro nao encontrado");
        }
        return retorno;
    }

    public static void main(String[] args) {
    }
}
