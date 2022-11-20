/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;

import br.com.mycompany.maestro.Modelo.VO.Processo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Natha
 */
public class ProcessoDAOImpl implements ProcessoDAO{
    
    EntityManager manager;
    
    public ProcessoDAOImpl() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Processo ps) {
        manager.getTransaction().begin();
        manager.persist(ps);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Processo ps) {
        manager.getTransaction().begin();
        manager.merge(ps);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Processo ps) {
        manager.getTransaction().begin();
        manager.remove(ps);
        manager.getTransaction().commit();
    }

    @Override
    public List<Processo> listarTodos() {
        List<Processo> ps;
        
        Query query = manager.createQuery("SELECT s FROM Processo s");
        ps = query.getResultList();
        
        return ps;
    }

    @Override
    public Processo ListarUm(Long id) {
        Processo ordemServico;
        
        Query query = manager.createQuery("SELECT s FROM Processo s WHERE s.codigo = " + id);
        ordemServico = (Processo)query.getSingleResult();
        return ordemServico;
    }
    
    @Override
    public List<Processo> ListarFiltroLike(String like) {
        List<Processo> ps;
        Query query = manager.createQuery("SELECT s FROM Processo s WHERE s.cliente.nome LIKE '%"+like+"%'");
        ps = query.getResultList();
        return ps;
    }    

}