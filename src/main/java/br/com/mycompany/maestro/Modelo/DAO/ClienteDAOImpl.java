/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;

import br.com.mycompany.maestro.Modelo.VO.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Natha
 */

public class ClienteDAOImpl implements ClienteDAO {

    EntityManager manager;
    
    public ClienteDAOImpl() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Cliente cliente) {
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Cliente cliente) {
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Cliente cliente) {
        manager.getTransaction().begin();
        manager.remove(cliente);
        manager.getTransaction().commit();
    }

    @Override
    public List<Cliente> listarTodos() {
        List<Cliente> clientes;
        
        Query query = manager.createQuery("SELECT c FROM Cliente c");
        clientes = query.getResultList();
        
        return clientes;
    }

    @Override
    public Cliente ListarUm(Long id) {
        Cliente cliente;
        
        Query query = manager.createQuery("SELECT c FROM Cliente c WHERE c.codigo = " + id);
        cliente = (Cliente)query.getSingleResult();
        return cliente;
    }
    
    @Override
    public List<Cliente> ListarFiltroLike(String like) {
        List<Cliente> clientes;
        
        Query query = manager.createQuery("SELECT c FROM Cliente c WHERE c.nome LIKE '%" + like + "%'");
        clientes = query.getResultList();
        return clientes;
    }  
}

