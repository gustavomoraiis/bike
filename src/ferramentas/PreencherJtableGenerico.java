package ferramentas;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acsantana
 */
public class PreencherJtableGenerico {
    
    public void FormatarJtable(JTable tabela, int valores[]) {
            for (int x = 0; x < valores.length; x++) {
                tabela.getColumnModel().getColumn(x).setPreferredWidth(valores[x]);
            }
    }
    
    public void PreencherJtableGenerico(JTable tabela, String campos[], ResultSet resultSet) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            while (resultSet.next()) {
                int len = campos.length;
                Object[] row = new Object[len];
                for (int i = 0; i < len; i++) {
                    row[i] = resultSet.getString(campos[i]);
                }
                modelo.addRow(row);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }

    
  public void PreencherJtableGenericoSel(JTable tabela, String campos[], ResultSet resultSet) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        
        try {
            while (resultSet.next()) {
                int len = campos.length;
                Object[] row = new Object[len];
                for (int i = 0; i < len; i++) {
                    
                    if (i == 0) {
                        row[i] = (false);
                    } else {
                       row[i] = resultSet.getString(campos[i]);
                    }
                }
                modelo.addRow(row);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }


 










    public void limparJtable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setNumRows(0);   
    }

    
     public String[] preencherComboStr(JComboBox combo, ResultSet resultado, String[] pk,
            String conteudo, String chave) {
        combo.removeAllItems();
        try {
            resultado.last();
            pk = new String[resultado.getRow()];

            resultado.first();
            int i = 0;
            do {
                combo.addItem(resultado.getString(conteudo));
                pk[i] = resultado.getString(chave);
                i++;
            } while (resultado.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return pk;
    }
     
     public int[] preencherComboInt(JComboBox combo, ResultSet resultado, int[] pk,
            String conteudo, int chave) {
        combo.removeAllItems();
        try {
            resultado.last();
            pk = new int[resultado.getRow()];

            resultado.first();
            int i = 0;
            do {
                combo.addItem(resultado.getString(conteudo));
                pk[i] = resultado.getInt(chave);
                i++;
            } while (resultado.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return pk;
    }
     
}

