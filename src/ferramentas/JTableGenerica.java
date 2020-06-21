package ferramentas;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 * @author acsantana
 */
public class JTableGenerica {


    public void incluirLinhaJTable(JTable jTable, String[] linha) {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.addRow(linha);
    }

    public void alterarLinhaJTable(JTable jTable, int numLinha, String[] linha) {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();

        for (int cont = 0; cont < modelo.getColumnCount(); cont++) {
            modelo.setValueAt(linha[cont], numLinha, cont);
        }
    }

    public int existeRegistro(JTable jTable, int coluna, String valor) {
        for (int contL = 0; contL < jTable.getRowCount(); contL++) {

            if (jTable.getValueAt(contL, coluna).toString().equals(valor)) {
                //JOptionPane.showMessageDialog(null, valor);
                return contL;
            }
        }

        return -1;
    }

    public int existeRegistro(JTable jTable, int[] coluna, String[] valor) {
        for (int contL = 0; contL < jTable.getRowCount(); contL++) {
            boolean existeNestaLinha = true;

            for (int contColunas = 0; contColunas < coluna.length; contColunas++) {
                if (jTable.getValueAt(contL, coluna[contColunas]) != null) {
                    if (!jTable.getValueAt(contL, coluna[contColunas]).toString().equals(valor[contColunas])) {
                        existeNestaLinha = false;
                        break;
                    }
                }
            }

            if (existeNestaLinha) {
                return contL;
            }
        }

        return -1;
    }

    public boolean removerSelecionadas(JTable jTable, boolean apresentarMensagens) {
        int[] selecionadas = jTable.getSelectedRows();

        if (selecionadas.length == 0) {
            if (apresentarMensagens) {
                JOptionPane.showMessageDialog(null, "Selecione o(s) registro(s) a ser(em) removido(s) !");
            }

            return false;
        }

        int r = 0;

        if (apresentarMensagens) {
            r = JOptionPane.showConfirmDialog(null, "Confirma a remoção da(s) linha(s) selecionadas ?", "Remoção", JOptionPane.YES_NO_OPTION);
        }

        if ((!apresentarMensagens) || r == (JOptionPane.YES_OPTION)) {
            DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();

            Arrays.sort(selecionadas);

            int[] aux = new int[selecionadas.length];
            int cont = selecionadas.length - 1;

            for (int linha : selecionadas) {
                aux[cont--] = linha;
            }

            for (int x : aux) {
                modelo.removeRow(x);
            }
        }

        return true;
    }

   

    public void removeRow(JTable table ,int linha) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.removeRow(linha);
    
    }
}
