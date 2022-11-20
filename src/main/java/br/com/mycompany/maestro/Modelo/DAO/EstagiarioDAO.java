/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;

import br.com.mycompany.maestro.Modelo.VO.Estagiario;
import java.util.List;
/**
 *
 * @author Natha
 */
public interface EstagiarioDAO {
    
    void salvar(Estagiario estagiario);
    
    void atualizar(Estagiario estagiario);
    
    void excluir(Estagiario estagiario);
    
    List<Estagiario> listarTodos();
    
    Estagiario ListarUm(Long id);
    
    List<Estagiario> ListarFiltroLike(String like);    
}
