/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicoEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Classe responsável por enviar E-mail.
 * @author Denner Dias
 */
public class Email {
    static final String REMETENTE_NOME = "sys.agenda.ai@gmail.com";
    static final String REMETENTE_SENHA = "lmyxvqxupefmksrn";
    private String assunto ;
    private String mensagem;
    private String destinatario;
    
    /**
     * 
     * @param assunto  Assunto para envio do E-mail.
     * @param mensagem  Mensagem qual vai ser enviado ao destinatário.
     * @param destinatario  E-mail do destinatário.
     */
    public Email(String assunto, String mensagem, String destinatario) {
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    
    
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
   
    /**
     * Função para enviar o e-mail ao destinatário.
     */
    public void enviar (){
        SimpleEmail email = new SimpleEmail();              //classe importada das bibliotecas importadas 
            email.setSSLOnConnect(true);                    //conexaao por SSL
            email.setHostName("smtp.gmail.com");            //host name gmail
            email.setSslSmtpPort("465");                    //porta padrao SMTP
       email.setAuthenticator(new DefaultAuthenticator(REMETENTE_NOME, REMETENTE_SENHA));
       try {
           email.setFrom(REMETENTE_NOME);

           email.setDebug(true);

           email.setSubject(this.assunto);                  //settando assunto que vamos passar para a classe
           email.setMsg(this.mensagem);
           email.addTo(this.destinatario);                  //verificar antes de testar!!!!

           email.send();

       } catch (EmailException e) {
           e.printStackTrace();
       }
    }
}
