/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;
import br.com.mycompany.maestro.Modelo.VO.Acao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


/**
 *
 * @author Natha
 */
public class AcaoDAOImpl implements AcaoDAO{
    
    EntityManager manager;
    
    public AcaoDAOImpl() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Acao acao) {
        manager.getTransaction().begin();
        manager.persist(acao);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Acao acao) {
        manager.getTransaction().begin();
        manager.merge(acao);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Acao acao) {
        manager.getTransaction().begin();
        manager.remove(acao);
        manager.getTransaction().commit();
    }

    @Override
    public List<Acao> listarTodos() {
        List<Acao> acao;
        
        Query query = manager.createQuery("SELECT e FROM Acao e");
        acao = query.getResultList();
        
        return acao;
    }

    @Override
    public Acao ListarUm(Long id) {
        Acao acao;
        
        Query query = manager.createQuery("SELECT e FROM Acao e WHERE e.codigo = " + id);
        acao = (Acao)query.getSingleResult();
        return acao;
    }
    
    @Override
    public List<Acao> ListarFiltroLike(String like) {
        List<Acao> equip;
        
        Query query = manager.createQuery("SELECT e FROM Acao e WHERE e.descricao LIKE '%" + like + "%'");
        equip = query.getResultList();
        return equip;
    }

}