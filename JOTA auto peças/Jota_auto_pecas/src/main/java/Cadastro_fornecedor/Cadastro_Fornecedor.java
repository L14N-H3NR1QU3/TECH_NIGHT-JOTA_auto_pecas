/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cadastro_fornecedor;

import static Cadastro_funcionario.Frame_Cadastro_Funcionario.validador_entrada_num;
import static Cadastro_funcionario.Frame_Cadastro_Funcionario.validador_entrada_str;
import static Cadastro_funcionario.Frame_Cadastro_Funcionario.validador_tamanho_texto;
import Tela_Inicial.Tela_Inicial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author f.silva
 */
public class Cadastro_Fornecedor extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_Fornecedor
     */
    public Cadastro_Fornecedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_tituloF = new javax.swing.JLabel();
        Nome_fornecedor_cadastroF = new javax.swing.JTextField();
        jLabel_nomeF = new javax.swing.JLabel();
        jLabel_TelefoneF = new javax.swing.JLabel();
        jLabel_emailF = new javax.swing.JLabel();
        Telefone_fornecedor_cadastroF = new javax.swing.JTextField();
        Email_fornecedor_cadastroF = new javax.swing.JTextField();
        Cidade_fornecedor_cadastroF = new javax.swing.JTextField();
        jLabel_CidadeF = new javax.swing.JLabel();
        Cadastro_fornecedor = new javax.swing.JButton();
        Voltar_fornecedor = new javax.swing.JButton();
        jLabel_iconeF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(46, 46, 46));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));

        jLabel_tituloF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_tituloF.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tituloF.setText("Cadastro de Fornecedor");

        jLabel_nomeF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_nomeF.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nomeF.setText("Nome do Fornecedor");

        jLabel_TelefoneF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TelefoneF.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TelefoneF.setText("Telefone");

        jLabel_emailF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_emailF.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_emailF.setText("E-mail");

        jLabel_CidadeF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_CidadeF.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CidadeF.setText("Cidade");

        Cadastro_fornecedor.setText("Cadastrar");
        Cadastro_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro_fornecedorActionPerformed(evt);
            }
        });

        Voltar_fornecedor.setText("Voltar");
        Voltar_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar_fornecedorActionPerformed(evt);
            }
        });

        jLabel_iconeF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N
        jLabel_iconeF.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel_tituloF))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Voltar_fornecedor)))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(Cadastro_fornecedor))
                            .addComponent(jLabel_iconeF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_TelefoneF)
                                    .addComponent(jLabel_emailF)
                                    .addComponent(jLabel_CidadeF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_nomeF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nome_fornecedor_cadastroF, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(Cidade_fornecedor_cadastroF)
                            .addComponent(Telefone_fornecedor_cadastroF)
                            .addComponent(Email_fornecedor_cadastroF))
                        .addGap(337, 337, 337)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel_tituloF))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_iconeF, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome_fornecedor_cadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nomeF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cidade_fornecedor_cadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CidadeF))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone_fornecedor_cadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TelefoneF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_fornecedor_cadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_emailF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Voltar_fornecedor)
                    .addComponent(Cadastro_fornecedor))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static boolean validador_tamanho_texto(String num_str, int limite) {
        boolean tamanho;
        
        // Se o length da String for maior do que o limite, retorna false e o usuário devera digitar novamente.
        if (num_str.length() > limite) {
            tamanho = false;
        }
        else {
            tamanho = true;
        }
        
        return tamanho;
    }
    
    public static boolean validador_entrada_num(String num_str, int limite) {
        boolean e_num = true;
        
        
        // Se o length da String for maior do que o limite, retorna false e o usuário devera digitar novamente.
        if (num_str.length() != limite) {
            e_num = false;
        }

        // Verifica cada posição da String para saber se é letra ou número.
        // Retorna false se uma posição for letra e acaba com o código, fazendo o usuário escrever denovo.
        // Retorna true se for número e prossegue com o código.
        
        if (e_num == true) {
            for (int i = 0; i < num_str.length(); i++) {
                char c = num_str.charAt(i);
                if ('0' <= c && c <= '9') {
                    e_num = true;
                }
                else {
                    e_num = false;
                    break;
                }
            }
        }

        return e_num;
    }
    
    public static boolean validador_entrada_str(String num_str, int limite) {
        boolean e_letra;
        
        // Se e_letra for false o código não executa por completo.
        e_letra = validador_tamanho_texto(num_str, limite);
        
        // Verifica cada posição da String para saber se é letra ou número.
        // Retorna true se for letra e prossegue com o código. 
        // Retorna false se for número e para o código, fazendo o usuário digitar novamente.
        
        for (int i = 0; i < num_str.length(); i++) {
            char c = num_str.charAt(i);
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
                e_letra = true;
            }
            else {
                e_letra = false;
                break;
            }
        }
        
        return e_letra;
    }
    
    private void Cadastro_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro_fornecedorActionPerformed
        
        String nome = Nome_fornecedor_cadastroF.getText();
        String email = Email_fornecedor_cadastroF.getText();
        String telefone = Telefone_fornecedor_cadastroF.getText();
        String cidade = Cidade_fornecedor_cadastroF.getText();
        
        boolean nome_valido = validador_entrada_str(nome, 50);
        boolean email_valido = validador_tamanho_texto(email, 50);
        boolean telefone_valido_1 = validador_entrada_num(telefone, 9);
        boolean telefone_valido_2 = validador_tamanho_texto(telefone, 9);
        boolean cidade_valido = validador_tamanho_texto(cidade, 50);
        
        if (nome_valido && email_valido && telefone_valido_1 && telefone_valido_2 && cidade_valido) {
            try {
                // TODO add your handling code here:
                Connection conexao = null;
                PreparedStatement statement = null;

                String url = "jdbc:mysql://localhost:3306/JOTAautopeca";
                String usuario = "root";
                String senha = "";

                conexao = DriverManager.getConnection(url,usuario,senha);
                String sql = "Insert Into Fornecedor (Nome_fornecedor,Telefone_fornecedor,Email_fornecedor,cidade_fornecedor) VALUES (?,?,?,?)";
                statement = conexao.prepareStatement(sql);
                statement.setString(1, Nome_fornecedor_cadastroF.getText());
                statement.setString(2, Telefone_fornecedor_cadastroF.getText());
                statement.setString(3, Email_fornecedor_cadastroF.getText());
                statement.setString(4, Cidade_fornecedor_cadastroF.getText());
                statement.executeUpdate();
                System.out.println("PASS");
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "CADASTRO INVALIDO");
            }        // TODO add your handling code here:
        }
        else {
            if (nome_valido == false) {
                JOptionPane.showMessageDialog(null, "NOME INVÁLIDO");
            }
            else if (email_valido == false) {
                JOptionPane.showMessageDialog(null, "EMAIL INVÁLIDO");
            }
            else if (telefone_valido_1 == false || telefone_valido_2 == false) {
                JOptionPane.showMessageDialog(null, "TELEFONE INVÁLIDO");
            }
            else if (cidade_valido == false) {
                JOptionPane.showMessageDialog(null, "CIDADE INVÁLIDO");
            }
        }
    }//GEN-LAST:event_Cadastro_fornecedorActionPerformed

    private void Voltar_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar_fornecedorActionPerformed
        Tela_Inicial telInicial = new Tela_Inicial();
        telInicial.setVisible(true);
        this.dispose();
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Voltar_fornecedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Fornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastro_fornecedor;
    private javax.swing.JTextField Cidade_fornecedor_cadastroF;
    private javax.swing.JTextField Email_fornecedor_cadastroF;
    private javax.swing.JTextField Nome_fornecedor_cadastroF;
    private javax.swing.JTextField Telefone_fornecedor_cadastroF;
    private javax.swing.JButton Voltar_fornecedor;
    private javax.swing.JLabel jLabel_CidadeF;
    private javax.swing.JLabel jLabel_TelefoneF;
    private javax.swing.JLabel jLabel_emailF;
    private javax.swing.JLabel jLabel_iconeF;
    private javax.swing.JLabel jLabel_nomeF;
    private javax.swing.JLabel jLabel_tituloF;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
