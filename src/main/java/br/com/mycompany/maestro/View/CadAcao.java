/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.View;

import br.com.mycompany.maestro.Modelo.VO.Acao;
import br.com.mycompany.maestro.Modelo.VO.Ordem;
import br.com.mycompany.maestro.Modelo.VO.ServicoPrestado;
import br.com.mycompany.maestro.Modelo.RN.AcaoRN;
import br.com.mycompany.maestro.Modelo.RN.OrdemRN; 
import br.com.mycompany.maestro.Modelo.RN.ServicoPrestadoRN;

import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Natha
 */
public class CadAcao extends javax.swing.JFrame {
    private Long idAlteracao = 0L;
    private List<Ordem> ordens;
    private OrdemRN ordemRN;
    private List<ServicoPrestado> servicosPrestados;
    private ServicoPrestadoRN servicoPrestadoRN;
    private Acao acao;
    private AcaoRN acaoRN;
    private List<Acao> acoes;
    
    public CadAcao() {
        this.acaoRN = new AcaoRN();
        this.ordemRN = new OrdemRN();
        this.servicoPrestadoRN = new ServicoPrestadoRN();
        initComponents();
        setLocationRelativeTo(null);
        this.popularComboServicoPrestado();
        this.popularComboOrdem();
    }
    
    public CadAcao(Long idAlteracao) {
        initComponents();
        setLocationRelativeTo(null);
        this.acaoRN = new AcaoRN();
        this.ordemRN = new OrdemRN();
        this.servicoPrestadoRN = new ServicoPrestadoRN();
        this.idAlteracao = idAlteracao;
        try{
            acao = acaoRN.listarUm(idAlteracao);
            txt_id.setText(String.valueOf(acao.getCodigo()));
            txt_descricao.setText(acao.getDescricao());
            popularComboOrdemEdicao(idAlteracao);
            popularComboServicoPrestadoEdicao(idAlteracao);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_descricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_ordem = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cb_servicoPrestado = new javax.swing.JComboBox();
        btn_cancel = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        jLabel_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Natha\\OneDrive\\??rea de Trabalho\\POO2\\View Imagens\\icon-tik.png")); // NOI18N
        jLabel3.setText("ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 60, 30));

        txt_id.setEditable(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 70, 30));

        txt_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descricaoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Natha\\OneDrive\\??rea de Trabalho\\POO2\\View Imagens\\icon-description.png")); // NOI18N
        jLabel1.setText("Descri????o:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Natha\\OneDrive\\??rea de Trabalho\\POO2\\View Imagens\\icon-ordem.png")); // NOI18N
        jLabel2.setText("Ordem:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 30));

        getContentPane().add(cb_ordem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 180, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Natha\\OneDrive\\??rea de Trabalho\\POO2\\View Imagens\\icon-servico.png")); // NOI18N
        jLabel4.setText("Servi??o:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 30));

        cb_servicoPrestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_servicoPrestadoActionPerformed(evt);
            }
        });
        getContentPane().add(cb_servicoPrestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 180, 30));

        btn_cancel.setText("Cancelar");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 30));

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 70, 30));

        jLabel_background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Natha\\OneDrive\\??rea de Trabalho\\POO2\\View Imagens\\maestro.png")); // NOI18N
        jLabel_background.setText("jLabel1");
        getContentPane().add(jLabel_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 430, 454));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
         try{
            if(this.idAlteracao == 0){
                acao = new Acao();
                acao.setOrdem((Ordem)this.getOrdemSelecionada(cb_ordem.getSelectedIndex()));
                acao.setServicoPrestado((ServicoPrestado)this.getServicoPrestadoSelecionado(cb_servicoPrestado.getSelectedIndex()));
                acao.setDescricao(txt_descricao.getText());

                acaoRN.salvar(acao);
                
            }else{
                acao.setOrdem((Ordem)this.getOrdemSelecionada(cb_ordem.getSelectedIndex()));
                acao.setServicoPrestado((ServicoPrestado)this.getServicoPrestadoSelecionado(cb_servicoPrestado.getSelectedIndex()));
                acao.setDescricao(txt_descricao.getText());
                
                acaoRN.atualizar(acao);           
            }
            JOptionPane.showMessageDialog(this, "Lan??amento cadastrado com sucesso!");
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_btn_salvarActionPerformed

     

    
        private void popularComboOrdem() {//
        ComboBoxModel modeloOrdem;
            try {
                Vector linhas = new Vector();
                ordens = ordemRN.listaTodos();
                
                for (Ordem o : ordens)
                {
                    Vector linha = new Vector();
                    linha.add(o.getCodigo());
                    linha.add(o.getDescricao());
                    linhas.add(linha);
                }
                modeloOrdem = new DefaultComboBoxModel(linhas);
                cb_ordem.setModel(modeloOrdem);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    private void popularComboOrdemEdicao(Long id) {
        ComboBoxModel modeloOrdem;
            try {
                Vector linhas = new Vector();
                ordens = ordemRN.listaTodos();
                int index = 0;
                int indexSelecionado = 0;
                for (Ordem o : ordens)
                {
                    Vector linha = new Vector();
                    linha.add(o.getCodigo());
                    linha.add(o.getDescricao());
                    linhas.add(linha);
                    
                    if(acao.getOrdem().getCodigo() == o.getCodigo()){
                        indexSelecionado = index;
                    }
                    index++;
                }
                modeloOrdem = new DefaultComboBoxModel(linhas);
                cb_ordem.setModel(modeloOrdem);
                cb_ordem.setSelectedIndex(indexSelecionado);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    
    private Object getOrdemSelecionada(int posicao){
        Ordem o = new Ordem();
        o = (Ordem) ordens.get(posicao);

        return o;
    }
    
    
    
    private void popularComboServicoPrestado() {//
          ComboBoxModel servicoServ;
            try {
                Vector linhas = new Vector();
                servicosPrestados = servicoPrestadoRN.listaTodos();
                
                for (ServicoPrestado serv : servicosPrestados)
                {
                    Vector linha = new Vector();
                    linha.add(serv.getCodigo());
                    linha.add(serv.getDescricao());
                    linhas.add(linha);
                }
                servicoServ = new DefaultComboBoxModel(linhas);
                cb_servicoPrestado.setModel(servicoServ); //parei aqui 
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    
    

    private void cb_servicoPrestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_servicoPrestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_servicoPrestadoActionPerformed

    private void txt_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descricaoActionPerformed

    private void popularComboServicoPrestadoEdicao(Long idAlteracao) {//
      ComboBoxModel modeloMod;
            try {
                Vector linhas = new Vector();
                servicosPrestados = servicoPrestadoRN.listaTodos();
                int index = 0;
                int indexSelecionado = 0;
                for (ServicoPrestado s : servicosPrestados)
                {
                    Vector linha = new Vector();
                    linha.add(s.getCodigo());
                    linha.add(s.getDescricao());
                    linhas.add(linha);
                    
                    if(acao.getServicoPrestado().getCodigo() == s.getCodigo()){
                        indexSelecionado = index;
                    }
                    index++;
                }
                modeloMod = new DefaultComboBoxModel(linhas);
                cb_servicoPrestado.setModel(modeloMod);
                cb_servicoPrestado.setSelectedIndex(indexSelecionado);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }  
    
    private Object getServicoPrestadoSelecionado(int posicao)
    {
        ServicoPrestado s = new ServicoPrestado();
        s = (ServicoPrestado) servicosPrestados.get(posicao);

        return s;
    }
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
            java.util.logging.Logger.getLogger(CadAcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAcao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox cb_ordem;
    private javax.swing.JComboBox cb_servicoPrestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_background;
    private javax.swing.JTextField txt_descricao;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
