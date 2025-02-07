package javaprojects.cadastroprodutos;


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TelaCadastro extends javax.swing.JFrame {

    DefaultTableModel tabela;
    int selecionado;
    boolean linhaSelecionada = false;
            
    public TelaCadastro() {
        initComponents(); 
        tableListagem.setAutoCreateRowSorter(true);
    }

    @SuppressWarnings("unchecked")

    public void limparCampos() {
        txtNomeProduto.setText(null);
        txtValorProduto.setText(null);
        txtQuantidade.setText(null);
        txtDescricaoProduto.setText(null);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableListagem = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JFormattedTextField();
        btnDeletar = new javax.swing.JButton();
        txtValorProduto = new javax.swing.JFormattedTextField();
        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        checkBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel2.setText("Nome do produto:");

        jLabel3.setText("Descrição do produto:");

        txtDescricaoProduto.setToolTipText("");

        jLabel4.setText("Valor do produto:");

        jLabel5.setText("Item disponível:");

        jLabel6.setText("Quantidade:");

        btnCadastrar.setBackground(new java.awt.Color(0, 153, 0));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Lista de produtos");

        tableListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome produto", "Valor", "Quantidade"
            }
        ));
        tableListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListagemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableListagem);

        btnEditar.setBackground(new java.awt.Color(153, 153, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar produto");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        btnDeletar.setBackground(new java.awt.Color(255, 51, 51));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        txtValorProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        btnUp.setBackground(new java.awt.Color(0, 102, 102));
        btnUp.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnUp.setForeground(new java.awt.Color(255, 255, 255));
        btnUp.setText("Up");
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        btnDown.setBackground(new java.awt.Color(0, 102, 102));
        btnDown.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnDown.setForeground(new java.awt.Color(255, 255, 255));
        btnDown.setText("Down");
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("\"Clique em \"Valor\" para ordenar os valores\"");

        jPanel1.setBackground(new java.awt.Color(0, 36, 36));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/oakTecnologia.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        checkBox.setSelected(true);
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addComponent(jLabel8))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkBox)
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtValorProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDown)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed

        if(linhaSelecionada == false){
            tabela = (DefaultTableModel) tableListagem.getModel();
            linhaSelecionada = true;
        }

        selecionado = tableListagem.getSelectedRow();
        if(selecionado > 0){
            tabela.moveRow(selecionado, selecionado, selecionado -1);
            tableListagem.setRowSelectionInterval(selecionado -1, selecionado -1);
            tableListagem.setSelectionBackground(Color.black);
        }

    }//GEN-LAST:event_btnUpActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        try {
            if (txtNomeProduto.getText().trim().isEmpty()) {
                throw new Exception("Voce precisa inserir um nome válido");
            } else if (txtValorProduto.getText().trim().isEmpty()) {
                throw new Exception("Voce precisa inserir um valor válido");
            } else if (txtQuantidade.getText().trim().isEmpty()) {
                throw new Exception("Voce precisa inserir uma quantidade válido");
            }

            tabela = (DefaultTableModel) tableListagem.getModel();
            tabela.addRow(new Object[]{txtNomeProduto.getText(), txtValorProduto.getText(), txtQuantidade.getText()});
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso", "", JOptionPane.DEFAULT_OPTION);
            // Reset fields on form
            limparCampos();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "ID já cadastrado","", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed

        tabela = (DefaultTableModel) tableListagem.getModel();

        try {
            selecionado = tableListagem.getSelectedRow();
            tabela.removeRow(selecionado);
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso", "", JOptionPane.DEFAULT_OPTION);
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para deletar", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int i = tableListagem.getSelectedRow();
        tabela = (DefaultTableModel) tableListagem.getModel();

        if (i >= 0) {
            tabela.setValueAt(txtNomeProduto.getText(), i, 0);
            tabela.setValueAt(txtValorProduto.getText(), i, 1);
            tabela.setValueAt(txtQuantidade.getValue(), i, 2);
            JOptionPane.showMessageDialog(null, "Produto editado com sucesso", "", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tableListagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListagemMouseClicked

        selecionado = tableListagem.getSelectedRow();
        tabela = (DefaultTableModel) tableListagem.getModel();
        txtNomeProduto.setText(tabela.getValueAt(selecionado, 0).toString());
        txtValorProduto.setText(tabela.getValueAt(selecionado, 1).toString());
        txtQuantidade.setText(tabela.getValueAt(selecionado, 2).toString());

    }//GEN-LAST:event_tableListagemMouseClicked

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed

        if(linhaSelecionada == false){
            tabela = (DefaultTableModel) tableListagem.getModel();
            linhaSelecionada = true;
        }

        selecionado = tableListagem.getSelectedRow();
        if(selecionado < tabela.getRowCount() - 1){
            tabela.moveRow(selecionado, selecionado, selecionado +1);
            tableListagem.setRowSelectionInterval(selecionado +1, selecionado +1);
            tableListagem.setSelectionBackground(Color.black);
        }
    }//GEN-LAST:event_btnDownActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        
      
            if(!checkBox.isSelected()){
                txtQuantidade.setText("0");
            }
            else {
                txtQuantidade.setText(null);
            }
      

        
    }//GEN-LAST:event_checkBoxActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnUp;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableListagem;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
}
