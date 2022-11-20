/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.RN;

import br.com.mycompany.maestro.Modelo.DAO.ClienteDAO;
import br.com.mycompany.maestro.Modelo.DAO.ClienteDAOImpl;
import br.com.mycompany.maestro.Modelo.VO.Cliente;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Natha
 */
public class ClienteRN {
    
    private ClienteDAO clienteDao;
    
    public ClienteRN() {
        clienteDao = new ClienteDAOImpl();
    }
    
    public void salvar(Cliente cliente) {
        try {
            clienteDao.salvar(cliente);
        } catch (HibernateException he) {
            System.out.println(he); 
        }
    }
    
    public List<Cliente> listaTodos() {
        return clienteDao.listarTodos();
    }
    
    public Cliente listarUm(Long id) {
        return clienteDao.ListarUm(id);
    }
    
    public List<Cliente> listarFitroLike(String like) {
        return clienteDao.ListarFiltroLike(like);
    }
    
    public void atualizar(Cliente cliente) {
        clienteDao.atualizar(cliente);
    }
    
    public void excluir(Cliente cliente) {
        clienteDao.excluir(cliente);
    }
    
}