/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicoEmail;

import br.com.mycompany.maestro.Modelo.VO.Processo;
import br.com.mycompany.maestro.Modelo.VO.Acao;
import java.time.LocalDate;

/**
 *
 * @author Natha
 */
public class Correio {
    
    public void NotificarPorEmail(Processo processo){
        
        String emailFormatado = formatarEmail(processo);
        String destinatario = processo.getCliente().getEmail();
        
        //implementando o uso da classe email
        Email email = new Email("Processo", emailFormatado, destinatario);
        email.enviar();
    }

    private String formatarEmail(Processo processo) {
       
        String nomeCliente = processo.getCliente().getNome();
        String acao = processo.getAcao().getDescricao();
        LocalDate dataInicio = processo.getDtent();
        LocalDate dataFim = processo.getDtsaida();
        double valor = processo.getValort();
        
        return "Olá " + nomeCliente + " Informamos que " + acao +
                " Esta marcado para o dia " + dataInicio + " com fim para " + dataFim +
                ". O valor do servico R$ " + valor + ". Para mais informações entre em contato pelo numero 40028922!!";
    }
}


