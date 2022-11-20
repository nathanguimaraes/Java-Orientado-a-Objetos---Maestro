/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;

import br.com.mycompany.maestro.Modelo.VO.Acao;
import java.util.List;

/**
 *
 * @author Natha
 */
public interface AcaoDAO {
    
    void salvar(Acao acao);
    
    void atualizar(Acao acao);
    
    void excluir(Acao acao);
    
    List<Acao> listarTodos();
    
    Acao ListarUm(Long id);
    
    List<Acao> ListarFiltroLike(String like);    
}