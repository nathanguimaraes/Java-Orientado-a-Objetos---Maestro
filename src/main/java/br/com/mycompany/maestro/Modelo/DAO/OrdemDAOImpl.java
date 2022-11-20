/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;

import br.com.mycompany.maestro.Modelo.VO.Ordem;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
/**
 *
 * @author Natha
 */
public class OrdemDAOImpl implements OrdemDAO{
 
    EntityManager manager;
    
    public OrdemDAOImpl() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Ordem ordem) {
        manager.getTransaction().begin();
        manager.persist(ordem);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Ordem ordem) {
        manager.getTransaction().begin();
        manager.merge(ordem);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Ordem ordem) {
        manager.getTransaction().begin();
        manager.remove(ordem);
        manager.getTransaction().commit();
    }

    @Override
    public List<Ordem> listarTodos() {
        List<Ordem> ordem;
        
        Query query = manager.createQuery("SELECT m FROM Ordem m");
        ordem = query.getResultList();
        
        return ordem;
    }

    @Override
    public Ordem ListarUm(Long id) {
        Ordem ordem;
        
        Query query = manager.createQuery("SELECT m FROM Ordem m WHERE m.codigo = " + id);
        ordem = (Ordem)query.getSingleResult();
        return ordem;
    }
    
    @Override
    public List<Ordem> ListarFiltroLike(String like) {
        List<Ordem> ordem;
        
        Query query = manager.createQuery("SELECT m FROM Ordem m WHERE m.descricao LIKE '%" + like + "%'");
        ordem = query.getResultList();
        return ordem;
    }
}
