/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.View;

import br.com.mycompany.maestro.Modelo.RN.ServicoPrestadoRN;
import br.com.mycompany.maestro.Modelo.VO.ServicoPrestado;
 
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Natha
 */
public class ViewServicoPrestado extends javax.swing.JFrame{

    private ServicoPrestadoRN servicoPrestadoRN;
    private ServicoPrestado servicoPrestado;
    private List<ServicoPrestado> servicosPrestados;
    
    public ViewServicoPrestado() {
        this.servicoPrestadoRN = new ServicoPrestadoRN();
        this.servicoPrestado = new ServicoPrestado();
        initComponents();
        setLocationRelativeTo(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_desc = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_servicoPrestado = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Descrição:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        txt_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descActionPerformed(evt);
            }
        });
        getContentPane().add(txt_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 11, 326, -1));

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 37, 87, -1));

        tb_servicoPrestado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descricao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_servicoPrestado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 380, 173));

        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 61, -1));

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 255, -1, -1));

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 255, 65, -1));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 255, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 10, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        String filtro = txt_desc.getText();

      try {
            DefaultTableModel servico = (DefaultTableModel) tb_servicoPrestado.getModel();
            servico.setNumRows(0);
            this.servicosPrestados = servicoPrestadoRN.listarFitroLike(filtro);

            for(ServicoPrestado serv : servicosPrestados){
                String[] linha = {String.valueOf(serv.getCodigo()), serv.getDescricao()};
                servico.addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CadServicoPrestado().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        int linha = this.tb_servicoPrestado.getSelectedRow();
        Long id = Long.valueOf(tb_servicoPrestado.getValueAt(linha, 0).toString());
        new CadServicoPrestado(id).setVisible(true);
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        try{
            int linha = this.tb_servicoPrestado.getSelectedRow();
            Long id = Long.valueOf(tb_servicoPrestado.getValueAt(linha, 0).toString());
            ServicoPrestado marFind = servicoPrestadoRN.listarUm(id);
            servicoPrestadoRN.excluir(marFind);

            DefaultTableModel servico = (DefaultTableModel) tb_servicoPrestado.getModel();
            servico.removeRow(linha);
            JOptionPane.showMessageDialog(this, "Servico Prestado Excluído com Sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descActionPerformed

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
            java.util.logging.Logger.getLogger(ViewServicoPrestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewServicoPrestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewServicoPrestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewServicoPrestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewServicoPrestado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_servicoPrestado;
    private javax.swing.JTextField txt_desc;
    // End of variables declaration//GEN-END:variables
}
