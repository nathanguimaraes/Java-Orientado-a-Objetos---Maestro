/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;

import br.com.mycompany.maestro.Modelo.VO.User;
import br.com.mycompany.maestro.View.ViewMain;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Natha
 */
public class UserDAOImpl implements UserDAO{
 
    EntityManager manager;
    private Object query;
    
    public UserDAOImpl() {
        manager = ConexaoHibernate.getInstance();
    }

    @Override
    public void atualizar(User user) {
        manager.getTransaction().begin();
        manager.merge(user);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(User user) {
        manager.getTransaction().begin();
        manager.remove(user);
        manager.getTransaction().commit();
    }

    @Override
    public List<User> listarTodos() {
        List<User> user;
        
        Query query = manager.createQuery("SELECT u FROM User u");
        user = query.getResultList();
        
        return user;
    }
    
    @Override
    public User ListarUm(Long id) {
        User  user;
        
        Query query = manager.createQuery("SELECT u FROM User u WHERE u.codigo = " + id);
        user = (User)query.getSingleResult();
        return user;
    }
    
    @Override
    public boolean Logar(Integer id, String senha){
        boolean lo;
        try {
            Query query = manager.createQuery("SELECT u FROM User u WHERE u.id = " +id+" and u.senha ="+senha);
            query.getSingleResult();
            lo = true;
        } catch (Exception e) {
            lo = false;
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido(s)!");
        }
        
        return lo;
    }
}

