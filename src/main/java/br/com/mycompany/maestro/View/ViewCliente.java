/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.View;

import br.com.mycompany.maestro.Modelo.RN.ClienteRN;
import br.com.mycompany.maestro.Modelo.VO.Cliente;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Natha
 */
public class ViewCliente extends javax.swing.JFrame {

  private ClienteRN clienteRN;
    private List<Cliente> clientes;
    
    public ViewCliente() {
        clienteRN = new ClienteRN();
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_consulC = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir1 = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_consulC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Dt. Nascimento", "Sexo", "Logradouro", "Nº", "Complemento", "CEP", "Cidade", "Bairro", "Estado", "Email", "Telefone", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_consulC);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 845, 267));

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 14, -1, -1));
        getContentPane().add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 11, 584, -1));

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 49, 121, -1));

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 49, 89, -1));

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 49, 89, -1));

        btn_excluir1.setText("Excluir");
        btn_excluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_excluir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 49, 89, -1));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 49, 89, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        String filtro = txt_nome.getText();

        try {
            DefaultTableModel model = (DefaultTableModel) tb_consulC.getModel();
            model.setNumRows(0);
            this.clientes = clienteRN.listarFitroLike(filtro);

            for (Cliente cli : clientes) {
                String[] linha ={cli.getNome(), cli.getCpf(), cli.getRg(), String.valueOf(cli.getDtnas()), String.valueOf(cli.getSexo()), cli.getEndereco().getLogradouro(), cli.getEndereco().getNumero(),
                    cli.getEndereco().getComplemento(), cli.getEndereco().getCep(), cli.getEndereco().getCidade(), cli.getEndereco().getBairro(), cli.getEndereco().getEstado(),cli.getEmail(), cli.getTelefone(), String.valueOf(cli.getStatus()) };
                model.addRow(linha);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        new CadCliente().setVisible(true);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        int linha = this.tb_consulC.getSelectedRow();
        Long id = Long.valueOf(tb_consulC.getValueAt(linha, 0).toString());
        new CadCliente(id).setVisible(true);
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir1ActionPerformed
        try{
            int linha = this.tb_consulC.getSelectedRow();
            Long id = Long.valueOf(tb_consulC.getValueAt(linha, 0).toString());
            Cliente cliFind = clienteRN.listarUm(id);
            clienteRN.excluir(cliFind);

            DefaultTableModel model = (DefaultTableModel) tb_consulC.getModel();
            model.removeRow(linha);
            JOptionPane.showMessageDialog(this, "Cliente Excluído com Sucesso!");
            this.setCloseable(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_excluir1ActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_excluir1;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_consulC;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables

    private void setCloseable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
