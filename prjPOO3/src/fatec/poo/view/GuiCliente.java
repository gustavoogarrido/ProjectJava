/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.PreparaConexao;
import fatec.poo.control.DaoCliente;
import fatec.poo.model.Cliente;
import java.awt.Color;
import java.io.IOException;

/**
 *
 * @author 0030482311012
 */
public class GuiCliente extends javax.swing.JFrame
{

    /**
     * Creates new form GuiCliente
     */
    public GuiCliente()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        popupExcluir = new javax.swing.JDialog();
        btnPopupConfirmar = new javax.swing.JButton();
        btnPopupCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelLimiteCredito = new javax.swing.JLabel();
        textCPF = new javax.swing.JTextField();
        textNome = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        labelUF = new javax.swing.JLabel();
        textCidade = new javax.swing.JTextField();
        textDDD = new javax.swing.JTextField();
        textTelefone = new javax.swing.JTextField();
        labelCEP = new javax.swing.JLabel();
        textCEP = new javax.swing.JTextField();
        textLimiteCredito = new javax.swing.JTextField();
        labelLimiteDisponivel = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        comboUF = new javax.swing.JComboBox<>();
        labelValorLimiteDisponivel = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();

        popupExcluir.setSize(new java.awt.Dimension(400, 240));
        popupExcluir.setType(java.awt.Window.Type.POPUP);

        btnPopupConfirmar.setText("Confirmar");
        btnPopupConfirmar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPopupConfirmarActionPerformed(evt);
            }
        });

        btnPopupCancelar.setText("Cancelar");
        btnPopupCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPopupCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Deseja realmente excluir?");
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 240));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 240));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 240));

        javax.swing.GroupLayout popupExcluirLayout = new javax.swing.GroupLayout(popupExcluir.getContentPane());
        popupExcluir.getContentPane().setLayout(popupExcluirLayout);
        popupExcluirLayout.setHorizontalGroup(
            popupExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupExcluirLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(popupExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(popupExcluirLayout.createSequentialGroup()
                        .addComponent(btnPopupConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPopupCancelar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        popupExcluirLayout.setVerticalGroup(
            popupExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupExcluirLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(popupExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPopupConfirmar)
                    .addComponent(btnPopupCancelar))
                .addGap(58, 58, 58))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        labelLimiteCredito.setText("Limite de Crédito");

        textCPF.setToolTipText("");

        textNome.setToolTipText("");
        textNome.setEnabled(false);

        labelCPF.setText("CPF");

        labelNome.setText("Nome");

        labelEndereco.setText("Endereço");

        labelCidade.setText("Cidade");

        labelTelefone.setText("Telefone");

        textEndereco.setToolTipText("");
        textEndereco.setEnabled(false);

        labelUF.setText("UF");

        textCidade.setToolTipText("");
        textCidade.setEnabled(false);

        textDDD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textDDD.setToolTipText("");
        textDDD.setEnabled(false);

        textTelefone.setToolTipText("");
        textTelefone.setEnabled(false);

        labelCEP.setText("CEP");

        textCEP.setToolTipText("");
        textCEP.setEnabled(false);

        textLimiteCredito.setToolTipText("");
        textLimiteCredito.setEnabled(false);

        labelLimiteDisponivel.setText("Limite Disponível");

        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlterarActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIncluirActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSairActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnConsultarActionPerformed(evt);
            }
        });

        comboUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboUF.setEnabled(false);

        labelValorLimiteDisponivel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labelValorLimiteDisponivel.setEnabled(false);

        lblCPF.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCidade)
                    .addComponent(labelTelefone)
                    .addComponent(labelLimiteCredito)
                    .addComponent(labelCPF)
                    .addComponent(labelEndereco)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCEP)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelLimiteDisponivel)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelUF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboUF, 0, 111, Short.MAX_VALUE))
                            .addComponent(textCEP)
                            .addComponent(labelValorLimiteDisponivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCPF)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade)
                    .addComponent(labelUF)
                    .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(textDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCEP)
                    .addComponent(textCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLimiteCredito)
                    .addComponent(textLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLimiteDisponivel)
                    .addComponent(labelValorLimiteDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnIncluir)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair)
                    .addComponent(btnConsultar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        lblCPF.setText("");
        try
        {
            cliente = new Cliente(textCPF.getText(), textNome.getText(), Double.parseDouble(textLimiteCredito.getText()));
            cliente.setEndereco(textEndereco.getText());
            cliente.setCidade(textCidade.getText());
            cliente.setUf((comboUF.getSelectedItem()).toString());
            cliente.setTelefone(textTelefone.getText());
            cliente.setDdd(textDDD.getText());
            cliente.setCep(textCEP.getText());
            lblCPF.setText(daoCliente.inserir(cliente));
            if (!"".equals(lblCPF.getText()))
            {
                lblCPF.setForeground(Color.green);
                btnIncluir.setEnabled(false);
            } else
            {
                lblCPF.setForeground(Color.red);
                lblCPF.setText("Ocorreu um erro, tente inserir os dados novamente");
                return;
            }
            textCPF.setText(null);
            textNome.setText(null);
            textEndereco.setText(null);
            textCidade.setText(null);
            textDDD.setText(null);
            textTelefone.setText(null);
            comboUF.setSelectedItem(null);
            textCEP.setText(null);
            textLimiteCredito.setText(null);
            labelValorLimiteDisponivel.setText(null);
            textNome.setEnabled(false);
            textEndereco.setEnabled(false);
            textCidade.setEnabled(false);
            textDDD.setEnabled(false);
            textTelefone.setEnabled(false);
            comboUF.setEnabled(false);
            textCEP.setEnabled(false);
            textLimiteCredito.setEnabled(false);
            labelValorLimiteDisponivel.setEnabled(false);

        } catch (NumberFormatException e)
        {
            lblCPF.setForeground(Color.red);
            lblCPF.setText("Digite dados válidos");
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        cliente = daoCliente.consultar(textCPF.getText());
        if ("".equals(textCPF.getText()))
        {
            lblCPF.setText("Insira um CPF");
            lblCPF.setForeground(Color.red);
        } else if (cliente != null)
        {
            lblCPF.setText("");
            textNome.setText(cliente.getNome());
            textEndereco.setText(cliente.getEndereco());
            textCidade.setText(cliente.getCidade());
            textDDD.setText(cliente.getDdd());
            textTelefone.setText(cliente.getTelefone());
            comboUF.setSelectedItem(cliente.getUf());
            textCEP.setText(cliente.getCep());
            textLimiteCredito.setText(Double.toString(cliente.getLimiteCredito()));
            labelValorLimiteDisponivel.setText(Double.toString(cliente.getLimiteDisponivel()));
            textCPF.setEnabled(false);
            textNome.setEnabled(true);
            textEndereco.setEnabled(true);
            textCidade.setEnabled(true);
            comboUF.setEnabled(true);
            textTelefone.setEnabled(true);
            textDDD.setEnabled(true);
            textCEP.setEnabled(true);
            textLimiteCredito.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnConsultar.setEnabled(false);
            btnExcluir.setEnabled(true);
        } else
        {
            btnIncluir.setEnabled(true);
            lblCPF.setForeground(Color.red);
            lblCPF.setText("CPF Inexistente, tente outro ou inclua um novo!");
            textNome.setEnabled(true);
            textEndereco.setEnabled(true);
            textCidade.setEnabled(true);
            comboUF.setEnabled(true);
            textTelefone.setEnabled(true);
            textDDD.setEnabled(true);
            textCEP.setEnabled(true);
            textLimiteCredito.setEnabled(true);
            textNome.setText(null);
            textEndereco.setText(null);
            textCidade.setText(null);
            textDDD.setText(null);
            textTelefone.setText(null);
            comboUF.setSelectedItem(0);
            textCEP.setText(null);
            textLimiteCredito.setText(null);
            labelValorLimiteDisponivel.setText(null);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        prepCon = new PreparaConexao("kevindb", "kevindb");
        prepCon.setDriver("oracle.jdbc.driver.OracleDriver");
        prepCon.setConnectionString("jdbc:oracle:thin:@127.0.0.1:1521/XEPDB1");
        daoCliente = new DaoCliente(prepCon.abrirConexao());
        lblCPF.setText("");
    }//GEN-LAST:event_formWindowOpened

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        cliente = new Cliente(textCPF.getText(), textNome.getText(), Double.parseDouble(textLimiteCredito.getText()));
        cliente.setEndereco(textEndereco.getText());
        cliente.setCidade(textCidade.getText());
        cliente.setUf((comboUF.getSelectedItem()).toString());
        cliente.setTelefone(textTelefone.getText());
        cliente.setDdd(textDDD.getText());
        cliente.setCep(textCEP.getText());
        lblCPF.setText(daoCliente.alterar(cliente));
        if (!"".equals(lblCPF.getText()))
        {
            lblCPF.setForeground(Color.green);
            textNome.setEnabled(false);
            textEndereco.setEnabled(false);
            textCidade.setEnabled(false);
            textDDD.setEnabled(false);
            textTelefone.setEnabled(false);
            comboUF.setEnabled(false);
            textCEP.setEnabled(false);
            textLimiteCredito.setEnabled(false);
            labelValorLimiteDisponivel.setEnabled(false);
            btnConsultar.setEnabled(true);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            textCPF.setEnabled(true);
            textCPF.setText(null);
            textNome.setText(null);
            textEndereco.setText(null);
            textCidade.setText(null);
            textDDD.setText(null);
            textTelefone.setText(null);
            comboUF.setSelectedItem(null);
            textCEP.setText(null);
            textLimiteCredito.setText(null);
            labelValorLimiteDisponivel.setText(null);
        } else
        {
            lblCPF.setText("Ocorreu um erro ao alterar os dados, tente novamente");
            lblCPF.setForeground(Color.red);
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        popupExcluir.setVisible(true);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPopupConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopupConfirmarActionPerformed
        lblCPF.setText(daoCliente.excluir(cliente.getCpf()));
        if (!"".equals(lblCPF.getText()))
        {
            lblCPF.setForeground(Color.green);
        } else
        {
            lblCPF.setForeground(Color.red);
            lblCPF.setText("Ocorreu um erro ao excluir");
        }
        textCPF.setEnabled(true);
        textNome.setEnabled(false);
        textEndereco.setEnabled(false);
        textCidade.setEnabled(false);
        textDDD.setEnabled(false);
        textTelefone.setEnabled(false);
        comboUF.setEnabled(false);
        textCEP.setEnabled(false);
        textLimiteCredito.setEnabled(false);
        labelValorLimiteDisponivel.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        textCPF.setText(null);
        textNome.setText(null);
        textEndereco.setText(null);
        textCidade.setText(null);
        textDDD.setText(null);
        textTelefone.setText(null);
        comboUF.setSelectedItem(null);
        textCEP.setText(null);
        textLimiteCredito.setText(null);
        labelValorLimiteDisponivel.setText(null);
        popupExcluir.setVisible(false);
    }//GEN-LAST:event_btnPopupConfirmarActionPerformed

    private void btnPopupCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopupCancelarActionPerformed
        popupExcluir.setVisible(false);
    }//GEN-LAST:event_btnPopupCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GuiCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GuiCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPopupCancelar;
    private javax.swing.JButton btnPopupConfirmar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> comboUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelLimiteCredito;
    private javax.swing.JLabel labelLimiteDisponivel;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUF;
    private javax.swing.JLabel labelValorLimiteDisponivel;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JDialog popupExcluir;
    private javax.swing.JTextField textCEP;
    private javax.swing.JTextField textCPF;
    private javax.swing.JTextField textCidade;
    private javax.swing.JTextField textDDD;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textLimiteCredito;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables
    private Cliente cliente;
    private PreparaConexao prepCon;
    private DaoCliente daoCliente;
}
