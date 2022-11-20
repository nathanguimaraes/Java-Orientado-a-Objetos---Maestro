/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.View;

import br.com.mycompany.maestro.Modelo.RN.EstagiarioRN;
import br.com.mycompany.maestro.Modelo.VO.Endereco;
import br.com.mycompany.maestro.Modelo.VO.Estagiario;
import br.com.mycompany.maestro.Modelo.VO.Sexo;

import br.com.mycompany.maestro.Util.DataUtil;
import com.toedter.calendar.JDateChooser;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


/**
 *
 * @author Natha
 */
public class CadEstagiario extends javax.swing.JFrame {

    private Long idAlteracao = 0L;
    private EstagiarioRN estagiarioRN;
    private Estagiario estager;
    private Endereco end;
    private Sexo sex;


   
    
    public CadEstagiario() {
        this.estagiarioRN = new EstagiarioRN();
        this.estager = new Estagiario();
        this.end = new Endereco();
        initComponents();
        setLocationRelativeTo(null);
    }
   
    public CadEstagiario(Long idAlteracao) {
        this.estagiarioRN = new EstagiarioRN();
        this.estager = new Estagiario();
        this.end = new Endereco();
        initComponents();
        setLocationRelativeTo(null);
        this.idAlteracao = idAlteracao;
        try{
            Estagiario estagerRecuperado = estagiarioRN.listarUm(idAlteracao);
            txt_id.setText(String.valueOf(estagerRecuperado.getCodigo()));
            txt_nome.setText(estagerRecuperado.getNome());
            txt_bairro.setText(estagerRecuperado.getEndereco().getBairro());
            txt_cep.setText(estagerRecuperado.getEndereco().getCep());
            txt_cidade.setText(estagerRecuperado.getEndereco().getCidade());
            txt_complemento.setText(estagerRecuperado.getEndereco().getComplemento());
            txt_estado.setText(estagerRecuperado.getEndereco().getEstado());
            txt_cpf.setText(estagerRecuperado.getCpf());
            txt_rg.setText(estagerRecuperado.getRg());
            txt_email.setText(estagerRecuperado.getEmail());
            txt_telefone.setText(estagerRecuperado.getTelefone());
            jd_dtnasc.setDate(DataUtil.converteLocalDateToDate(estagerRecuperado.getDtnas()));
            if(estagerRecuperado.getSexo() == sex.FEMININO){
                rb_fem.setSelected(true);
            }
            else
            {
                rb_masc.setSelected(true);
            }
            txt_logradouro.setText(estagerRecuperado.getEndereco().getLogradouro());
            txt_numero.setText(estagerRecuperado.getEndereco().getNumero());
            txt_salario.setText(String.valueOf(estagerRecuperado.getSalario()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_cpf = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JTextField();
        lbl_rg = new javax.swing.JLabel();
        txt_rg = new javax.swing.JTextField();
        lbl_dtnasc = new javax.swing.JLabel();
        jd_dtnasc = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        rb_masc = new javax.swing.JRadioButton();
        rb_fem = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txt_logradouro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_complemento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cep = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_salario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 14, -1, -1));

        txt_id.setEditable(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 11, 49, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));
        getContentPane().add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 200, 30));

        lbl_cpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_cpf.setText("CPF:");
        getContentPane().add(lbl_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));
        getContentPane().add(txt_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 120, -1));

        lbl_rg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_rg.setText("RG:");
        getContentPane().add(lbl_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));
        getContentPane().add(txt_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 120, -1));

        lbl_dtnasc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_dtnasc.setText("Data de Nascimento:");
        getContentPane().add(lbl_dtnasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        getContentPane().add(jd_dtnasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 140, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Sexo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        rb_masc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rb_masc.setText("Masculino");
        getContentPane().add(rb_masc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        rb_fem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rb_fem.setText("Feminino");
        getContentPane().add(rb_fem, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Logradouro:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        getContentPane().add(txt_logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nº:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));
        getContentPane().add(txt_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 48, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Complemento:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        getContentPane().add(txt_complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 170, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("CEP:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(txt_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Bairro:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        getContentPane().add(txt_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Email:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 200, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Telefone:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        getContentPane().add(txt_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 200, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Salário:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));
        getContentPane().add(txt_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cidade:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));
        getContentPane().add(txt_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 120, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Estado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));
        getContentPane().add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 120, -1));

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        try{
            if(this.idAlteracao == 0){
                estager.setNome(txt_nome.getText());
                estager.setSalario(Double.valueOf(txt_salario.getText()));
                estager.setCpf(txt_cpf.getText());
                estager.setRg(txt_rg.getText());

                Calendar datanasCalendar = jd_dtnasc.getCalendar();
                LocalDate datanasLocalDate = LocalDateTime.ofInstant(datanasCalendar.toInstant(), datanasCalendar.getTimeZone().toZoneId()).toLocalDate();
                estager.setDtnas(datanasLocalDate);

                if(rb_fem.isSelected()){
                    estager.setSexo(Sexo.FEMININO);
                }
                else
                {
                    estager.setSexo(Sexo.MASCULINO);
                }

                estager.setEmail(txt_email.getText());
                estager.setTelefone(txt_telefone.getText());
                end.setBairro(txt_bairro.getText());
                end.setCep(txt_cep.getText());
                end.setCidade(txt_cidade.getText());
                end.setComplemento(txt_complemento.getText());
                end.setEstado(txt_estado.getText());
                end.setLogradouro(txt_logradouro.getText());
                end.setNumero(txt_numero.getText());
                estager.setEndereco(end);

                this.estagiarioRN.salvar(estager);
            }else{
                Estagiario tecRecuperado = estagiarioRN.listarUm(idAlteracao);
                tecRecuperado.setNome(this.txt_nome.getText());
                tecRecuperado.setSalario(Double.valueOf(txt_salario.getText()));
                tecRecuperado.setCpf(txt_cpf.getText());
                tecRecuperado.setRg(txt_rg.getText());

                Calendar datanasCalendar = jd_dtnasc.getCalendar();
                LocalDate datanasLocalDate = LocalDateTime.ofInstant(datanasCalendar.toInstant(), datanasCalendar.getTimeZone().toZoneId()).toLocalDate();
                tecRecuperado.setDtnas(datanasLocalDate);

                if(rb_fem.isSelected()){
                    tecRecuperado.setSexo(Sexo.FEMININO);
                }
                else
                {
                    tecRecuperado.setSexo(Sexo.MASCULINO);
                }

                tecRecuperado.setEmail(txt_email.getText());
                tecRecuperado.setTelefone(txt_telefone.getText());
                end.setBairro(txt_bairro.getText());
                end.setCep(txt_cep.getText());
                end.setCidade(txt_cidade.getText());
                end.setComplemento(txt_complemento.getText());
                end.setEstado(txt_estado.getText());
                end.setLogradouro(txt_logradouro.getText());
                end.setNumero(txt_numero.getText());
                tecRecuperado.setEndereco(end);

                this.estagiarioRN.atualizar(tecRecuperado);
            }
            JOptionPane.showMessageDialog(this, "Estagiario cadastrado com sucesso!");
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadEstagiario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jd_dtnasc;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JLabel lbl_dtnasc;
    private javax.swing.JLabel lbl_rg;
    private javax.swing.JRadioButton rb_fem;
    private javax.swing.JRadioButton rb_masc;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cep;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_logradouro;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_rg;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}
