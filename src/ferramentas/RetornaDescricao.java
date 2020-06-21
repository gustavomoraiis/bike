
package ferramentas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author acsantana
 */
public class RetornaDescricao {
    
    public void retornadescricao(ResultSet resultado, JTextField campo, String atributo){
        try {
            resultado.next();
            campo.setText(resultado.getString(atributo));
        } catch (SQLException ex) {
            Logger.getLogger(RetornaDescricao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
