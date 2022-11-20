/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.RN;

import br.com.mycompany.maestro.Modelo.DAO.ProcessoDAO;
import br.com.mycompany.maestro.Modelo.DAO.ProcessoDAOImpl;
import br.com.mycompany.maestro.Modelo.VO.Processo;
import java.util.List;
import org.hibernate.HibernateException;


/**
 *
 * @author Natha
 */
public class ProcessoRN {
       
    private ProcessoDAO processoDAO;
    
    public ProcessoRN() {
        processoDAO = new ProcessoDAOImpl();
    }
    
    public void salvar(Processo processo) {
        try {
            processoDAO.salvar(processo);
        } catch (HibernateException he) {
            System.out.println(he); 
        }
    }
    
    public List<Processo> listaTodos() {
        return processoDAO.listarTodos();
    }
    
    public Processo listarUm(Long id) {
        return processoDAO.ListarUm(id);
    }
    
    public List<Processo> listarFitroLike(String like) {
        return processoDAO.ListarFiltroLike(like);
    }
    
    public void atualizar(Processo processo) {
        processoDAO.atualizar(processo);
    }
    
    public void excluir(Processo processo) {
        processoDAO.excluir(processo);
    }    
}
