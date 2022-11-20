/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.RN;

import br.com.mycompany.maestro.Modelo.DAO.UserDAO;
import br.com.mycompany.maestro.Modelo.DAO.UserDAOImpl;
import br.com.mycompany.maestro.Modelo.VO.User;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Natha
 */

public class UserRN {
     private UserDAO userDAO;
    
    public UserRN() {
        userDAO = new UserDAOImpl();
    }
   
    public List<User> listaTodos() {
        return userDAO.listarTodos();
    }
    
    public User listarUm(Long id) {
        return userDAO.ListarUm(id);
    }
    
    public boolean Logar(Integer id, String senha) {
        return userDAO.Logar(id, senha);
    }
    public void atualizar(User user) {
        userDAO.atualizar(user);
    }
    
    public void excluir(User user) {
        userDAO.excluir(user);
    }      
}

