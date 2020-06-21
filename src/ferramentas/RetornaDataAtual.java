package ferramentas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author André Cardeal Santana
 */
public class RetornaDataAtual {

    public String dt;
    public String anox;

    
    public String RetornaDataAtual() {

        //rorina par inserir data atual ao novo registro
        Date data = new Date();
        String dia = "" + data.getDate();
        String mes = "" + String.valueOf(data.getMonth() + 1);
        String ano = "" + (1900 + data.getYear());

        if (Integer.parseInt(mes) <= 9) {
            mes = "0" + mes;
        }
        if (Integer.parseInt(dia) <= 9) {
            dia = "0" + dia;
        }
       return (dia + "/" + mes + "/" + ano);
    }
    
    public void RetornaDataAtual(JTextField campo_data) {

        //rorina par inserir data atual ao novo registro
        Date data = new Date();
        String dia = "" + data.getDate();
        String mes = "" + String.valueOf(data.getMonth() + 1);
        String ano = "" + (1900 + data.getYear());

        if (Integer.parseInt(mes) <= 9) {
            mes = "0" + mes;
        }
        if (Integer.parseInt(dia) <= 9) {
            dia = "0" + dia;
        }
        campo_data.setText(dia + "/" + mes + "/" + ano);
    }

    
    public String RetornaDataAtual(String campo_data) { //----retorna data string ferty...

        //rorina par inserir data atual a uma string
        Date data = new Date();
        String dia = "" + data.getDate();
        String mes = "" + String.valueOf(data.getMonth() + 1);
        String ano = "" + (1900 + data.getYear());
        if (Integer.parseInt(mes) <= 9) {
            mes = "0" + mes;
        }
        if (Integer.parseInt(dia) <= 9) {
            dia = "0" + dia;
        }
        String data_atual = dia + "/" + mes + "/" + ano;

        SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
        dt = formatarDate.format(data);
        //System.out.println(campo_data);
        return dt;
    }
}
