package visao;

import Controle.ClienteControle;
import Controle.ItensNFControle;
import Controle.NFControle;
import Controle.ProdutoControle;
import ferramentas.PreencherJtableGenerico;
import ferramentas.RetornaDescricao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.ClienteModelo;
import Modelo.ItensNFModelo;
import Modelo.NFModelo;
import Modelo.ProdutoModelo;
import visao.Cliente;

/**
 *
 * @author acsantana
 */
public class NF extends javax.swing.JFrame {

    private NFControle controlenf = new NFControle();
    private NFModelo modnf = new NFModelo();

    private ItensNFControle controleitensnf = new ItensNFControle();
    private ItensNFModelo modeloitensnf = new ItensNFModelo();

    private ClienteModelo modelocliente = new ClienteModelo();
    private ClienteControle controlecliente = new ClienteControle();

    private ProdutoModelo modeloproduto = new ProdutoModelo();
    private ProdutoControle controleproduto = new ProdutoControle();

    private RetornaDescricao retornadescricao = new RetornaDescricao();

    private PreencherJtableGenerico preencher = new PreencherJtableGenerico();

    private int estoque;
    
    
    public NF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPNF = new javax.swing.JTabbedPane();
        jPNF = new javax.swing.JPanel();
        jTFIdNF = new javax.swing.JTextField();
        jTFIdClietne = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFVlTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbIncluir = new javax.swing.JTable();
        jTFIdProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTFQtde = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFTotItem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTFDescCliente = new javax.swing.JTextField();
        jTFDescProduto = new javax.swing.JTextField();
        jPConsulta = new javax.swing.JPanel();
        jTFPesquisa = new javax.swing.JTextField();
        jCBTipo = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jCBFiltro = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbConsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lançamento de Nota Fiscal");

        jTFIdNF.setEditable(false);
        jTFIdNF.setBackground(new java.awt.Color(204, 204, 204));

        jTFIdClietne.setBackground(new java.awt.Color(153, 255, 255));
        jTFIdClietne.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFIdClietneFocusLost(evt);
            }
        });
        jTFIdClietne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFIdClietneMouseClicked(evt);
            }
        });
        jTFIdClietne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdClietneActionPerformed(evt);
            }
        });

        jLabel1.setText("Código NF");

        jLabel2.setText("Código Cliente");

        jTFVlTotal.setEditable(false);
        jTFVlTotal.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Valor Total");

        jTbIncluir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sel", "Cod. Item", "Desc Item", "Qtde", "Vl. Unit", "Vl Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbIncluir);

        jTFIdProduto.setBackground(new java.awt.Color(153, 255, 255));
        jTFIdProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFIdProdutoFocusLost(evt);
            }
        });
        jTFIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdProdutoActionPerformed(evt);
            }
        });

        jLabel4.setText("Código Produto");

        jLabel5.setText("Produto");

        jTFQtde.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFQtdeFocusLost(evt);
            }
        });

        jLabel6.setText("Qtde");

        jTFValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFValorFocusLost(evt);
            }
        });

        jLabel7.setText("Cliente");

        jLabel8.setText("Valor");

        jLabel9.setText("Total Item");

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Novo");

        jButton4.setText("Alterar");

        jButton5.setText("Excluir");

        jButton6.setText("Gravar");

        jButton7.setText("Cancelar");

        jTFDescCliente.setEditable(false);
        jTFDescCliente.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPNFLayout = new javax.swing.GroupLayout(jPNF);
        jPNF.setLayout(jPNFLayout);
        jPNFLayout.setHorizontalGroup(
            jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPNFLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPNFLayout.createSequentialGroup()
                        .addComponent(jTFIdClietne, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPNFLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFDescCliente)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPNFLayout.createSequentialGroup()
                            .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jTFIdNF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFVlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGroup(jPNFLayout.createSequentialGroup()
                            .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jTFIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jTFDescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFValor)
                                .addComponent(jLabel8)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(jTFTotItem, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPNFLayout.setVerticalGroup(
            jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIdNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFVlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIdClietne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDescCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTotItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDescProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPNF.addTab("Lançamento NF", jPNF);

        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NF", "Cliente", "Valor" }));

        jButton8.setText("jButton8");

        jLabel10.setText("Tipo Pesquisa");

        jCBFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", ">", "<", "Contendo" }));

        jLabel11.setText("Filtro");

        jButton9.setText("Pesquisar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTbConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NF", "Cód. Cliente", "Cliente", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbConsultaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTbConsulta);

        javax.swing.GroupLayout jPConsultaLayout = new javax.swing.GroupLayout(jPConsulta);
        jPConsulta.setLayout(jPConsultaLayout);
        jPConsultaLayout.setHorizontalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPConsultaLayout.createSequentialGroup()
                                .addComponent(jCBFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addGap(45, 45, 45)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPConsultaLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPConsultaLayout.setVerticalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(jCBFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        jTPNF.addTab("Consulta", jPConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTPNF, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPNF, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(725, 317));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFIdClietneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdClietneActionPerformed

    }//GEN-LAST:event_jTFIdClietneActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        preencher.FormatarJtable(jTbConsulta, new int[]{60, 60, 150, 80});

        switch (jCBTipo.getSelectedIndex()) {
            case 0: {
                preencher.PreencherJtableGenerico(jTbConsulta,
                        new String[]{"IDNF", "IDCLIENTE", "DSPESSOA", "VLTOTAL"},
                        controlenf.consultageral());
                break;
            }
            case 1: {
                //modcidade.setIdcidade(Integer.parseInt(jTFConsulta.getText()));
                preencher.PreencherJtableGenerico(jTbConsulta,
                        new String[]{"IDNF", "IDCLIENTE", "DSPESSOA", "VLTOTAL"},
                        controlenf.consultacliente(jTFPesquisa.getText()));
                break;
            }
            case 2: {
                modnf.setIdnf(Integer.parseInt(jTFPesquisa.getText()));
                preencher.PreencherJtableGenerico(jTbConsulta,
                        new String[]{"IDNF", "IDCLIENTE", "DSPESSOA", "VLTOTAL"},
                        controlenf.consultacodigo(modnf));
                break;
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTbConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbConsultaMouseClicked
        preencher.FormatarJtable(jTBConsultaItens, new int[]{60, 60, 150, 60, 80, 80});

        int linha = jTbConsulta.getSelectedRow();

        String codigo = (String) jTbConsulta.getValueAt(linha, 0);

        modeloitensnf.setIdnf(Integer.parseInt(codigo));
        preencher.PreencherJtableGenerico(jTBConsultaItens,
                new String[]{"IDNF", "IDPRODUTO", "DSPRODUTO", "QTDPRODUTO", "VLPRODUTO", "TOTALPRODUTO"},
                controleitensnf.consultacodigo(modeloitensnf));


    }//GEN-LAST:event_jTbConsultaMouseClicked

    private void jTFIdClietneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFIdClietneMouseClicked

        if (evt.getClickCount() == 2) {

            final ConsultaCliente cc = new ConsultaCliente(this, true);
            cc.setVisible(true);
            cc.addWindowListener(new java.awt.event.WindowAdapter() {

                public void windowClosed(java.awt.event.WindowEvent evt) {
                    jTFIdClietne.setText(cc.codRetorno);
                    jTFDescCliente.setText(cc.descRetorno);
                }
            });
        }
    }//GEN-LAST:event_jTFIdClietneMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object[] linha = new Object[]{false, jTFIdProduto.getText(), jTFDescProduto.getText().toString(),
            jTFQtde.getText(), jTFValor.getText(), jTFTotItem.getText()};

        DefaultTableModel modelo = (DefaultTableModel) jTbIncluir.getModel();
        modelo.addRow(linha);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) jTbIncluir.getModel();
        int totlinha = jTbIncluir.getRowCount();
        int i = 0;
        Boolean sel = false;

        int opcao = JOptionPane.showConfirmDialog(null,
                "Deseja remover as linhas selecionadas ? ", "Remover",
                JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            for (i = totlinha - 1; i >= 0; i--) {
                Boolean selecionado = (Boolean) jTbIncluir.getValueAt(i, 0);
                if (selecionado == true) {
                    sel = true;
                    tabela.removeRow(i);
                }
            }
            if (!sel == true) {
                JOptionPane.showMessageDialog(null, "Nao ha nenhum registro selecionado !");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTFIdClietneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFIdClietneFocusLost

        modelocliente.setIdpessoa(Integer.parseInt(jTFIdClietne.getText()));
        retornadescricao.retornadescricao(controlecliente.consultacodigo(modelocliente), 
                jTFDescCliente, "DSPESSOA");


    }//GEN-LAST:event_jTFIdClietneFocusLost

    private void jTFIdProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFIdProdutoFocusLost
        modeloproduto.setIdproduto(Integer.parseInt(jTFIdProduto.getText()));
        controleproduto.retornadados(modeloproduto);
        
        jTFDescProduto.setText(modeloproduto.getDsproduto());
        jTFValor.setText(Double.toString(modeloproduto.getVlvenda()));
        estoque = modeloproduto.getQtestoque();
        
    }//GEN-LAST:event_jTFIdProdutoFocusLost

    private void jTFValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFValorFocusLost
        int quantidade = Integer.parseInt(jTFQtde.getText());
        double valor = Double.parseDouble(jTFValor.getText());
        
        jTFTotItem.setText(Double.toString(quantidade * valor));
        
        
    }//GEN-LAST:event_jTFValorFocusLost

    private void jTFQtdeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFQtdeFocusLost
        int qtdvenda = Integer.parseInt(jTFQtde.getText());
        
        if (qtdvenda > estoque){
            JOptionPane.showMessageDialog(null, "Quantidade de estoque insuficiente \n" + "Qtde Estoque :" + estoque);
            jTFQtde.setText("");
            jTFTotItem.setText("");
        }
    }//GEN-LAST:event_jTFQtdeFocusLost

    private void jTFIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIdProdutoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jCBFiltro;
    private javax.swing.JComboBox<String> jCBTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPConsulta;
    private javax.swing.JPanel jPNF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFDescCliente;
    private javax.swing.JTextField jTFDescProduto;
    private javax.swing.JTextField jTFIdClietne;
    private javax.swing.JTextField jTFIdNF;
    private javax.swing.JTextField jTFIdProduto;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTextField jTFQtde;
    private javax.swing.JTextField jTFTotItem;
    private javax.swing.JTextField jTFValor;
    private javax.swing.JTextField jTFVlTotal;
    private javax.swing.JTabbedPane jTPNF;
    private javax.swing.JTable jTbConsulta;
    private javax.swing.JTable jTbIncluir;
    // End of variables declaration//GEN-END:variables
}
