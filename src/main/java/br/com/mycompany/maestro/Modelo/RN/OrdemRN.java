/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.RN;

import br.com.mycompany.maestro.Modelo.DAO.OrdemDAO;
import br.com.mycompany.maestro.Modelo.DAO.OrdemDAOImpl;
import br.com.mycompany.maestro.Modelo.VO.Ordem;


import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Natha
 */
public class OrdemRN {
    
    private OrdemDAO servicoPrestadoDAO;
    
    public OrdemRN() {
        servicoPrestadoDAO = new OrdemDAOImpl();
    }
    
    public void salvar(Ordem ordem) {
        try {
            servicoPrestadoDAO.salvar(ordem);
        } catch (HibernateException he) {
            System.out.println(he); 
        }
    }
    
    public List<Ordem> listaTodos() {
        return servicoPrestadoDAO.listarTodos();
    }
    
    public Ordem listarUm(Long id) {
        return servicoPrestadoDAO.ListarUm(id);
    }
    
    public List<Ordem> listarFitroLike(String like) {
        return servicoPrestadoDAO.ListarFiltroLike(like);
    }
    
    public void atualizar(Ordem ordem) {
        servicoPrestadoDAO.atualizar(ordem);
    }
    
    public void excluir(Ordem ordem) {
        servicoPrestadoDAO.excluir(ordem);
    }    
}

