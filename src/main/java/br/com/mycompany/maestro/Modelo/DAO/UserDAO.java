/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;


import br.com.mycompany.maestro.Modelo.VO.User;
import java.util.List;

/**
 *
 * @author Natha
 */

public interface UserDAO {
    
    void atualizar(User user);
    
    void excluir(User user);
    
    List<User> listarTodos();
    
    User ListarUm(Long id);
    
    boolean Logar(Integer id, String senha);   
}

    

