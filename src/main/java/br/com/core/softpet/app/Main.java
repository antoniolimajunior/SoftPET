package br.com.core.softpet.app;

import br.com.core.softpet.ui.animal.FormListaAnimal;
import br.com.core.softpet.ui.atendimento.FormListaAtendimento;
import br.com.core.softpet.ui.categoria.FormListaCategoria;
import br.com.core.softpet.ui.cliente.FormListaCliente;
import br.com.core.softpet.ui.compra.FormListaCompra;
import br.com.core.softpet.ui.especie.FormListaEspecie;
import br.com.core.softpet.ui.fornecedor.FormListaFornecedor;
import br.com.core.softpet.ui.info.FormSobre;
import br.com.core.softpet.ui.login.Login;
import br.com.core.softpet.ui.marca.FormListaMarca;
import br.com.core.softpet.ui.produto.FormListaProduto;
import br.com.core.softpet.ui.raca.FormListaRaca;
import br.com.core.softpet.ui.usuario.FormListaUsuario;
import br.com.core.softpet.ui.venda.FormListaVenda;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.awt.Insets;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import org.jdesktop.swingx.JXStatusBar;
import org.jdesktop.swingx.plaf.basic.BasicStatusBarUI;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonUsuario = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonCliente = new javax.swing.JButton();
        jButtonFornecedor = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButtonAnimais = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jXStatusBar1 = new org.jdesktop.swingx.JXStatusBar();
        jXStatusBar2 = new org.jdesktop.swingx.JXStatusBar();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftPET - Sistema de Pet Shop");
        setResizable(false);

        jToolBar1.setRollover(true);

        jButtonUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\images\\rsz_usuario.png")); // NOI18N
        jButtonUsuario.setText("Usuários");
        jButtonUsuario.setFocusable(false);
        jButtonUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUsuario.setMaximumSize(new java.awt.Dimension(60, 65));
        jButtonUsuario.setMinimumSize(new java.awt.Dimension(46, 46));
        jButtonUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonUsuario);
        jToolBar1.add(jSeparator2);

        jButtonCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\images\\rsz_clientes.png")); // NOI18N
        jButtonCliente.setText("Clientes");
        jButtonCliente.setFocusable(false);
        jButtonCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonCliente);

        jButtonFornecedor.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\images\\rsz_fornecedor.png")); // NOI18N
        jButtonFornecedor.setText("Fornecedores");
        jButtonFornecedor.setFocusable(false);
        jButtonFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFornecedorActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonFornecedor);
        jToolBar1.add(jSeparator3);

        jButtonAnimais.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\images\\rsz_pets.png")); // NOI18N
        jButtonAnimais.setText("Pets");
        jButtonAnimais.setFocusable(false);
        jButtonAnimais.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAnimais.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnimaisActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAnimais);
        jToolBar1.add(jSeparator4);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\images\\rsz_produtos.png")); // NOI18N
        jButton1.setText("Produtos");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator5);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\images\\rsz_compras.png")); // NOI18N
        jButton2.setText("Compras");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator6);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\images\\rsz_atendimento.png")); // NOI18N
        jButton3.setText("Atendimento");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\images\\rsz_vendas.png")); // NOI18N
        jButton4.setText("Vendas");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator7);

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\images\\rsz_sair.png")); // NOI18N
        jButton5.setText("Sair");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1280, 768));

        jXStatusBar2.setAlignmentY(0.0F);

        jXStatusBar2.putClientProperty(BasicStatusBarUI.AUTO_ADD_SEPARATOR, Boolean.FALSE);
        jXStatusBar2.add(new JLabel("[Administrador] Antonio P de Lima Jr"));
        //use dummy label to fill empty space
        jXStatusBar2.add(new JLabel(""), JXStatusBar.Constraint.ResizeBehavior.FILL);
        //create constraint to add space of 5 at components left and right side
        JXStatusBar.Constraint ct = new JXStatusBar.Constraint(new Insets(0, 5, 0, 5));
        jXStatusBar2.add(new JSeparator(JSeparator.VERTICAL), ct);
        jXStatusBar2.add(new JLabel("LP2"), ct);

        //add the statusbar to the rootPane - some themes require this for proper appearance
        getRootPane().putClientProperty("Synthetica.statusBar", jXStatusBar2);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntonioJR\\Desktop\\WORKSPACE_SISTEMASDISTRIBUIDOS\\SoftPET\\src\\main\\resources\\images\\principal.png")); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jXStatusBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jXStatusBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jXStatusBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXStatusBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jDesktopPane1.setLayer(jXStatusBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jXStatusBar2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Cadastros");

        jMenuItem2.setText("Cadastro de Usuário");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Cadastro de Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem3.setText("Cadastro de Fornecedor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pets");

        jMenuItem5.setText("Cadastro de Pets");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem13.setText("Cadastro de Raças");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem6.setText("Cadastro de Espécies");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Produtos e Serviços");

        jMenuItem7.setText("Cadastro de Produtos e Serviços");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Cadastro de Marcas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Cadastro de Categorias");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Compras");

        jMenuItem10.setText("Pedidos de Compra");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Vendas");

        jMenuItem11.setText("Atendimentos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Vendas");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Sobre");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenuItem14.setText("Informações");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            FormListaProduto formListaProduto = new FormListaProduto();
            formListaProduto.setVisible(true);
            jDesktopPane1.add(formListaProduto);
            formListaProduto.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            FormListaCompra formListaCompra = new FormListaCompra();
            formListaCompra.setVisible(true);
            jDesktopPane1.add(formListaCompra);
            formListaCompra.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        try {
            FormListaAtendimento formListaAtendimento = new FormListaAtendimento();
            formListaAtendimento.setVisible(true);
            jDesktopPane1.add(formListaAtendimento);
            formListaAtendimento.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioActionPerformed
        try {
            FormListaUsuario formListaUsuario = new FormListaUsuario();
            formListaUsuario.setVisible(true);
            jDesktopPane1.add(formListaUsuario);
            formListaUsuario.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonUsuarioActionPerformed

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        try {
            FormListaCliente formListaCliente = new FormListaCliente();
            formListaCliente.setVisible(true);
            jDesktopPane1.add(formListaCliente);
            formListaCliente.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFornecedorActionPerformed
        try {
            FormListaFornecedor formListaFornecedor = new FormListaFornecedor();
            formListaFornecedor.setVisible(true);
            jDesktopPane1.add(formListaFornecedor);
            formListaFornecedor.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonFornecedorActionPerformed

    private void jButtonAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnimaisActionPerformed
        try {
            FormListaAnimal formListaAnimal = new FormListaAnimal();
            formListaAnimal.setVisible(true);
            jDesktopPane1.add(formListaAnimal);
            formListaAnimal.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonAnimaisActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            FormListaUsuario formListaUsuario = new FormListaUsuario();
            formListaUsuario.setVisible(true);
            jDesktopPane1.add(formListaUsuario);
            formListaUsuario.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            FormListaCliente formListaCliente = new FormListaCliente();
            formListaCliente.setVisible(true);
            jDesktopPane1.add(formListaCliente);
            formListaCliente.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            FormListaFornecedor formListaFornecedor = new FormListaFornecedor();
            formListaFornecedor.setVisible(true);
            jDesktopPane1.add(formListaFornecedor);
            formListaFornecedor.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            FormListaAnimal formListaAnimal = new FormListaAnimal();
            formListaAnimal.setVisible(true);
            jDesktopPane1.add(formListaAnimal);
            formListaAnimal.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        try {
            FormListaRaca formListaRaca = new FormListaRaca();
            formListaRaca.setVisible(true);
            jDesktopPane1.add(formListaRaca);
            formListaRaca.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            FormListaEspecie formListaEspecie = new FormListaEspecie();
            formListaEspecie.setVisible(true);
            jDesktopPane1.add(formListaEspecie);
            formListaEspecie.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            FormListaProduto formListaProduto = new FormListaProduto();
            formListaProduto.setVisible(true);
            jDesktopPane1.add(formListaProduto);
            formListaProduto.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            FormListaMarca formListaMarca = new FormListaMarca();
            formListaMarca.setVisible(true);
            jDesktopPane1.add(formListaMarca);
            formListaMarca.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        try {
            FormListaCategoria formListaCategoria = new FormListaCategoria();
            formListaCategoria.setVisible(true);
            jDesktopPane1.add(formListaCategoria);
            formListaCategoria.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        try {
            FormListaCompra formListaCompra = new FormListaCompra();
            formListaCompra.setVisible(true);
            jDesktopPane1.add(formListaCompra);
            formListaCompra.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            FormListaAtendimento formListaAtendimento = new FormListaAtendimento();
            formListaAtendimento.setVisible(true);
            jDesktopPane1.add(formListaAtendimento);
            formListaAtendimento.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        try {
            FormListaVenda formListaVenda = new FormListaVenda();
            formListaVenda.setVisible(true);
            jDesktopPane1.add(formListaVenda);
            formListaVenda.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            FormListaVenda formListaVenda = new FormListaVenda();
            formListaVenda.setVisible(true);
            jDesktopPane1.add(formListaVenda);
            formListaVenda.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Você deseja mesmo sair?",
                "Questão", JOptionPane.YES_NO_OPTION);
        if (op == 0) {
            dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed

    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        try {
            FormSobre formSobre = new FormSobre();
            formSobre.setVisible(true);
            jDesktopPane1.add(formSobre);
            formSobre.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    public static void main(String args[]) {

        Locale.setDefault(new Locale("pt", "BR"));
        try {
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login(null, true);
                login.setVisible(true);

                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonAnimais;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonFornecedor;
    private javax.swing.JButton jButtonUsuario;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXStatusBar jXStatusBar1;
    private org.jdesktop.swingx.JXStatusBar jXStatusBar2;
    // End of variables declaration//GEN-END:variables
}
