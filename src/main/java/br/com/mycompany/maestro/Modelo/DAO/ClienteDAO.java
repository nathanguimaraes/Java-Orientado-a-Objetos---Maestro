/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;
import br.com.mycompany.maestro.Modelo.VO.Cliente;
import java.util.List;

/**
 *
 * @author Natha
 */
public interface ClienteDAO {
    
    void salvar(Cliente cliente);
    
    void atualizar(Cliente cliente);
    
    void excluir(Cliente cliente);
    
    List<Cliente> listarTodos();
    
    Cliente ListarUm(Long id);
    
    List<Cliente> ListarFiltroLike(String like);
}
