/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;
import br.com.mycompany.maestro.Modelo.VO.Estagiario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Natha
 */
public class EstagiarioDAOImpl implements EstagiarioDAO{
 
    EntityManager manager;
    
    public EstagiarioDAOImpl() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Estagiario estagiario) {
        manager.getTransaction().begin();
        manager.persist(estagiario);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Estagiario estagiario) {
        manager.getTransaction().begin();
        manager.merge(estagiario);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Estagiario estagiario) {
        manager.getTransaction().begin();
        manager.remove(estagiario);
        manager.getTransaction().commit();
    }

    @Override
    public List<Estagiario> listarTodos() {
        List<Estagiario> estagiario;
        
        Query query = manager.createQuery("SELECT t FROM Estagiario t");
        estagiario = query.getResultList();
        
        return estagiario;
    }

    @Override
    public Estagiario ListarUm(Long id) {
        Estagiario estagiario;
        
        Query query = manager.createQuery("SELECT t FROM Estagiario t WHERE t.codigo = " + id);
        estagiario = (Estagiario)query.getSingleResult();
        return estagiario;
    }
    
    @Override
    public List<Estagiario> ListarFiltroLike(String like) {
        List<Estagiario> estagiario;
        
        Query query = manager.createQuery("SELECT t FROM Estagiario t WHERE t.nome LIKE '%" + like + "%'");
        estagiario = query.getResultList();
        return estagiario;
    }   
}

