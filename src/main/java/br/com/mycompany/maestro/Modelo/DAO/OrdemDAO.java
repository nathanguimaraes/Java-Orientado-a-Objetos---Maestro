/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;
import br.com.mycompany.maestro.Modelo.VO.Ordem;
import java.util.List;
/**
 *
 * @author Natha
 */
public interface OrdemDAO {
    void salvar(Ordem ordem);
    
    void atualizar(Ordem ordem);
    
    void excluir(Ordem ordem);
    
    List<Ordem> listarTodos();
    
    Ordem ListarUm(Long id);
    
    List<Ordem> ListarFiltroLike(String like); 
}