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
 *
 * @author Denner Dias
 */
public class EmailTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        Email email = new Email("Email de Confirmação ", "Segue o assunto: usuário e senha para acesso ao sistema de auditoria\n"+"Usuario:root\n"+"Senha: poop", "nathan.guimaraez@gmail.com");
        
        email.enviar();
        

    }
    
}
