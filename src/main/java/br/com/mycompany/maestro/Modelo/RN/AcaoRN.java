/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.RN;

import br.com.mycompany.maestro.Modelo.VO.Acao;
import br.com.mycompany.maestro.Modelo.DAO.AcaoDAO;
import br.com.mycompany.maestro.Modelo.DAO.AcaoDAOImpl;

import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Natha
 */

public class AcaoRN {

        
    private AcaoDAO acaoDao;
    
    public AcaoRN() {
        acaoDao = new AcaoDAOImpl();
    }
    
    public void salvar(Acao acao) {
        try {
            acaoDao.salvar(acao);
        } catch (HibernateException he) {
            System.out.println(he); 
        }
    }
    
    public List<Acao> listaTodos() {
        return acaoDao.listarTodos();
    }
    
    public Acao listarUm(Long id) {
        return acaoDao.ListarUm(id);
    }
    
    public List<Acao> listarFitroLike(String like) {
        return acaoDao.ListarFiltroLike(like);
    }
    
    public void atualizar(Acao acao) {
        acaoDao.atualizar(acao);
    }
    
    public void excluir(Acao acao) {
        acaoDao.excluir(acao);
    }
}
