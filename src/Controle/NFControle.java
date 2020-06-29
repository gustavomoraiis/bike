package Controle;

import dao.ConexaoPostgress;
import java.sql.ResultSet;
import modelo.CidadeModelo;
import Modelo.NFModelo;

/**
 *
 * @author acsantana
 */
public class NFControle extends ConexaoPostgress {

    private StringBuilder sql = new StringBuilder();

    public ResultSet consultageral() {
        super.executeSQL("SELECT * FROM NF INNER JOIN CADPESSOA ON NF.IDCLIENTE = CADPESSOA.IDPESSOA");
        return super.resultset;
    }

    public ResultSet consultacliente(String pessoa) {
        super.executeSQL("SELECT * FROM NF INNER JOIN CADPESSOA ON NF.IDCLIENTE = CADPESSOA.IDPESSOA  WHERE"
                + " DSPESSOA LIKE '%" + pessoa
                + "%'");
        return super.resultset;
    }

    public ResultSet consultacodigo(NFModelo nf) {
        super.executeSQL("SELECT * FROM NF INNER JOIN CADPESSOA ON NF.IDCLIENTE = CADPESSOA.IDPESSOA WHERE "
                + " IDNF = " + nf.getIdnf());
        return super.resultset;
    }

}
