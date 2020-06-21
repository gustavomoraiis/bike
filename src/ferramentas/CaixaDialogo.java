package ferramentas;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * 11/04/2011
 *
 * @author acsantana
 */
public class CaixaDialogo {

    public String local = null;
    public File arq;
    public String ext;

    public CaixaDialogo() {
    }
    
    

    public void CaixaDialogo() {


        final JFileChooser fc = new JFileChooser(local); //--- Variavel local (disco) defini posicao inicial da pesquisa
        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();

            // local = arquivo.getParent(); //--- Recebe posicao do arquivo selecionado e passa para variavel
            local = arquivo.getAbsolutePath(); //--- Recebe caminho da imagem
            local = local.replaceAll("['\']", "/");
        }



    }

    public String caixaDialogoSalvar() {


        final JFileChooser fc = new JFileChooser(local); //--- Variavel local (disco) defini posicao inicial da pesquisa
        int res = fc.showSaveDialog(null);
      
        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();
            local = arquivo.getAbsolutePath(); //--- Recebe caminho da imagem
            local = local.replaceAll("['\']", "/");
            return local;
        }
        return null;
    }

    public String caixaDialogoAbrir() {


        final JFileChooser fc = new JFileChooser(local); //--- Variavel local (disco) defini posicao inicial da pesquisa
        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();
            local = arquivo.getParent(); //--- Recebe posicao do arquivo selecionado e passa para variavel
            local = local.replaceAll("['\']", "/");
            return local;
        }

        return null;


    }

    public String caixaDialogo(String[] extensoes) {
        final JFileChooser fc = new JFileChooser(local); //--- Variavel local (disco) defini posicao inicial da pesquisa

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos", extensoes);
        fc.setAcceptAllFileFilterUsed(false); //--- REMOVE O ALL FILES DO DROP DOWN LIST
        fc.setFileFilter(filter); //--- ADICIONA O FILTRO DE IMAGENS

        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();
            arq = arquivo;

            local = arquivo.getAbsolutePath(); //--- Recebe caminho da imagem
            local = local.replaceAll("['\']", "/");
            ext = local.substring(local.indexOf(".") + 1);

            return local;
        } 
            return null;
        
    }
}
