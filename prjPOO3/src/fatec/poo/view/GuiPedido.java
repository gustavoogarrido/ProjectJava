/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.DaoCliente;
import fatec.poo.control.DaoPedido;
import fatec.poo.control.DaoVendedor;
import fatec.poo.control.PreparaConexao;
import fatec.poo.model.Cliente;
import fatec.poo.model.Pedido;
import fatec.poo.model.Vendedor;
import java.awt.Color;
import java.sql.Date;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleOCIConnectionPool;

/**
 *
 * @author 0030482311012
 */
public class GuiPedido extends javax.swing.JFrame
{

    /**
     * Creates new form GuiPedido
     */
    public GuiPedido()
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
        labelNumeroPedido = new javax.swing.JLabel();
        textNumeroPedido = new javax.swing.JTextField();
        labelDataPedido = new javax.swing.JLabel();
        textDataPedido = new javax.swing.JTextField();
        labelValorPedido = new javax.swing.JLabel();
        textValorPedido = new javax.swing.JTextField();
        labelCPFCliente = new javax.swing.JLabel();
        btnConsultarCPFCliente = new javax.swing.JButton();
        textCPFCliente = new javax.swing.JTextField();
        labelCPFVendedor = new javax.swing.JLabel();
        btnConsultarCPFVendedor = new javax.swing.JButton();
        textCPFVendedor = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        labelValorCPFCliente = new javax.swing.JLabel();
        labelValorCPFVendedor = new javax.swing.JLabel();
        labelException = new javax.swing.JLabel();

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
        setTitle("Emitir Pedido");
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
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

        labelNumeroPedido.setText("Número do Pedido:");

        labelDataPedido.setText("Data do Pedido:");

        textDataPedido.setEnabled(false);

        labelValorPedido.setText("Valor do Pedido:");

        textValorPedido.setEnabled(false);

        labelCPFCliente.setText("CPF Cliente:");

        btnConsultarCPFCliente.setText("Consultar");
        btnConsultarCPFCliente.setEnabled(false);
        btnConsultarCPFCliente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnConsultarCPFClienteActionPerformed(evt);
            }
        });

        textCPFCliente.setEnabled(false);

        labelCPFVendedor.setText("CPF Vendedor:");

        btnConsultarCPFVendedor.setText("Consultar");
        btnConsultarCPFVendedor.setEnabled(false);
        btnConsultarCPFVendedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnConsultarCPFVendedorActionPerformed(evt);
            }
        });

        textCPFVendedor.setEnabled(false);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSairActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlterarActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIncluirActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnConsultarActionPerformed(evt);
            }
        });

        labelValorCPFCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labelValorCPFCliente.setEnabled(false);

        labelValorCPFVendedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labelValorCPFVendedor.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelValorPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(textValorPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelDataPedido)
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(labelNumeroPedido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textNumeroPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(textDataPedido))))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCPFCliente)
                            .addComponent(labelCPFVendedor))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textCPFVendedor)
                            .addComponent(textCPFCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelException, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnConsultarCPFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelValorCPFVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultarCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelValorCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroPedido)
                    .addComponent(textNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelException, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataPedido)
                    .addComponent(textDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorPedido)
                    .addComponent(textValorPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCPFCliente)
                            .addComponent(textCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCPFVendedor)
                            .addComponent(textCPFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsultarCPFCliente)
                            .addComponent(labelValorCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsultarCPFVendedor)
                            .addComponent(labelValorCPFVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnIncluir)
                    .addComponent(btnConsultar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnConsultarActionPerformed
    {//GEN-HEADEREND:event_btnConsultarActionPerformed
        try
        {
            pedido = daoPedido.consultar(Integer.parseInt(textNumeroPedido.getText()));
            if ("".equals(textNumeroPedido.getText()))
            {
                System.out.println("Numero nulo");
            } else if (pedido != null)
            {
                textDataPedido.setText(pedido.getDataEmissao());
                textValorPedido.setText(Double.toString(pedido.getValor()));

                textCPFCliente.setText(pedido.getCliente().getCpf());
                textCPFVendedor.setText(pedido.getVendedor().getCpf());

                labelValorCPFCliente.setText(pedido.getCliente().getNome());
                labelValorCPFVendedor.setText(pedido.getVendedor().getNome());

                btnConsultarCPFCliente.setEnabled(false);
                btnConsultarCPFVendedor.setEnabled(false);

                textNumeroPedido.setEnabled(false);
                textCPFCliente.setEnabled(false);
                textCPFVendedor.setEnabled(false);
                textDataPedido.setEnabled(true);
                textValorPedido.setEnabled(true);
                btnConsultar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnIncluir.setEnabled(false);
                btnExcluir.setEnabled(true);
            } else
            {
                textNumeroPedido.setEnabled(true);
                textDataPedido.setEnabled(false);
                textValorPedido.setEnabled(false);
                textCPFCliente.setEnabled(false);
                textCPFVendedor.setEnabled(false);

                btnIncluir.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);

                btnConsultarCPFCliente.setEnabled(false);
                btnConsultarCPFVendedor.setEnabled(false);
                labelException.setText("");
            }
        } catch (Exception e)
        {
            labelException.setText("Ocorreu um erro ao consultar! Tente novamente.");
            labelException.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        prepCon = new PreparaConexao("kevindb", "kevindb");
        prepCon.setDriver("oracle.jdbc.driver.OracleDriver");
        prepCon.setConnectionString("jdbc:oracle:thin:@127.0.0.1:1521/XEPDB1");
        daoPedido = new DaoPedido(prepCon.abrirConexao());
        daoCliente = new DaoCliente(prepCon.abrirConexao());
        daoVendedor = new DaoVendedor(prepCon.abrirConexao());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSairActionPerformed
    {//GEN-HEADEREND:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIncluirActionPerformed
    {//GEN-HEADEREND:event_btnIncluirActionPerformed
        try
        {
            pedido = new Pedido(textNumeroPedido.getText());
            pedido.setDataEmissao(textDataPedido.getText());
            pedido.setValor(Double.parseDouble(textValorPedido.getText()));
            Cliente cliente = new DaoCliente(prepCon.abrirConexao()).consultar(textCPFCliente.getText());
            System.out.println(cliente.getNome());

            if (!cliente.addPedido(pedido))
            {
                labelException.setText("Cliente não possui saldo para o pedido");
                labelException.setForeground(Color.red);
                return;
            }

            Vendedor vendedor = new DaoVendedor(prepCon.abrirConexao()).consultar(textCPFVendedor.getText());
            vendedor.addPedido(pedido);
            System.out.println("added");

            labelException.setText("Pedido inserido com sucesso!");
            labelException.setForeground(Color.green);
            daoPedido.incluir(pedido);
            daoCliente.alterar(cliente);

        } catch (Exception e)
        {
            labelException.setText("Erro na inclusão! Tente novamente.");
            labelException.setForeground(Color.red);
        }

    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        try
        {
            pedido = daoPedido.consultar(Integer.parseInt(textNumeroPedido.getText()));
            pedido.setDataEmissao(textDataPedido.getText());
            pedido.setValor(Double.parseDouble(textValorPedido.getText()));
            daoPedido.alterar(pedido);
            labelException.setText("Pedido alterado com sucesso!");
            labelException.setForeground(Color.green);

            textNumeroPedido.setText("");
            textDataPedido.setText("");
            textValorPedido.setText("");
            textCPFCliente.setText("");
            textCPFVendedor.setText("");
            labelValorCPFCliente.setText("");
            labelValorCPFVendedor.setText("");

            textNumeroPedido.setEnabled(true);
            textDataPedido.setEnabled(false);
            textValorPedido.setEnabled(false);
            textCPFCliente.setEnabled(false);
            textCPFVendedor.setEnabled(false);

            btnConsultarCPFCliente.setEnabled(false);
            btnConsultarCPFVendedor.setEnabled(false);

            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnExcluir.setEnabled(false);
        } catch (Exception e)
        {
            labelException.setText("Erro na alteração! Tente novamente.");
            labelException.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirActionPerformed
    {//GEN-HEADEREND:event_btnExcluirActionPerformed
        popupExcluir.setVisible(true);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnConsultarCPFClienteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnConsultarCPFClienteActionPerformed
    {//GEN-HEADEREND:event_btnConsultarCPFClienteActionPerformed
        try
        {
            Cliente cliente = new DaoCliente(prepCon.abrirConexao()).consultar(textCPFCliente.getText());
            labelValorCPFCliente.setText(cliente.getNome());
        } catch (Exception e)
        {
            labelValorCPFCliente.setText("Não há um cliente com esse CPF!");
        }
    }//GEN-LAST:event_btnConsultarCPFClienteActionPerformed

    private void btnConsultarCPFVendedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnConsultarCPFVendedorActionPerformed
    {//GEN-HEADEREND:event_btnConsultarCPFVendedorActionPerformed
        try
        {
            Vendedor vendedor = new DaoVendedor(prepCon.abrirConexao()).consultar(textCPFVendedor.getText());

            labelValorCPFVendedor.setText(vendedor.getNome());
        } catch (Exception e)
        {
            labelValorCPFVendedor.setText("Não há um vendedor com esse CPF!");
        }
    }//GEN-LAST:event_btnConsultarCPFVendedorActionPerformed

    private void btnPopupConfirmarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPopupConfirmarActionPerformed
    {//GEN-HEADEREND:event_btnPopupConfirmarActionPerformed
        try
        {
            pedido = daoPedido.consultar(Integer.parseInt(textNumeroPedido.getText()));
            daoPedido.excluir(Integer.parseInt(pedido.getNumero()));
            labelException.setText("Pedido excluido com sucesso!");
            labelException.setForeground(Color.green);
            
            textNumeroPedido.setText("");
            textDataPedido.setText("");
            textValorPedido.setText("");
            textCPFCliente.setText("");
            textCPFVendedor.setText("");
            labelValorCPFCliente.setText("");
            labelValorCPFVendedor.setText("");

            textNumeroPedido.setEnabled(true);
            textDataPedido.setEnabled(false);
            textValorPedido.setEnabled(false);
            textCPFCliente.setEnabled(false);
            textCPFVendedor.setEnabled(false);

            btnConsultarCPFCliente.setEnabled(false);
            btnConsultarCPFVendedor.setEnabled(false);

            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnExcluir.setEnabled(false);
        } catch (Exception e)
        {
            labelException.setText("Erro na exclusão! Tente novamente.");
            labelException.setForeground(Color.red);
        }

        popupExcluir.setVisible(false);
    }//GEN-LAST:event_btnPopupConfirmarActionPerformed

    private void btnPopupCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPopupCancelarActionPerformed
    {//GEN-HEADEREND:event_btnPopupCancelarActionPerformed
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
            java.util.logging.Logger.getLogger(GuiPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GuiPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GuiPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GuiPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GuiPedido().setVisible(true);
            }
        });
    }

    private Pedido pedido;
    private PreparaConexao prepCon;
    private DaoPedido daoPedido;
    private DaoVendedor daoVendedor;
    private DaoCliente daoCliente;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultarCPFCliente;
    private javax.swing.JButton btnConsultarCPFVendedor;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPopupCancelar;
    private javax.swing.JButton btnPopupConfirmar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCPFCliente;
    private javax.swing.JLabel labelCPFVendedor;
    private javax.swing.JLabel labelDataPedido;
    private javax.swing.JLabel labelException;
    private javax.swing.JLabel labelNumeroPedido;
    private javax.swing.JLabel labelValorCPFCliente;
    private javax.swing.JLabel labelValorCPFVendedor;
    private javax.swing.JLabel labelValorPedido;
    private javax.swing.JDialog popupExcluir;
    private javax.swing.JTextField textCPFCliente;
    private javax.swing.JTextField textCPFVendedor;
    private javax.swing.JTextField textDataPedido;
    private javax.swing.JTextField textNumeroPedido;
    private javax.swing.JTextField textValorPedido;
    // End of variables declaration//GEN-END:variables
}
