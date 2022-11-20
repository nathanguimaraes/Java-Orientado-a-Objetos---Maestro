/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.RN;

import br.com.mycompany.maestro.Modelo.DAO.EstagiarioDAO;
import br.com.mycompany.maestro.Modelo.DAO.EstagiarioDAOImpl;
import br.com.mycompany.maestro.Modelo.VO.Estagiario;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Natha
 */
public class EstagiarioRN {
    
    private EstagiarioDAO estagiarioDAO;
    
    public EstagiarioRN() {
        estagiarioDAO = new EstagiarioDAOImpl();
    }
    
    public void salvar(Estagiario estagiario) {
        try {
            estagiarioDAO.salvar(estagiario);
        } catch (HibernateException he) {
            System.out.println(he); 
        }
    }
    
    public List<Estagiario> listaTodos() {
        return estagiarioDAO.listarTodos();
    }
    
    public Estagiario listarUm(Long id) {
        return estagiarioDAO.ListarUm(id);
    }
    
    public List<Estagiario> listarFitroLike(String like) {
        return estagiarioDAO.ListarFiltroLike(like);
    }
    
    public void atualizar(Estagiario estagiario) {
        estagiarioDAO.atualizar(estagiario);
    }
    
    public void excluir(Estagiario estagiario) {
        estagiarioDAO.excluir(estagiario);
    }   
}
