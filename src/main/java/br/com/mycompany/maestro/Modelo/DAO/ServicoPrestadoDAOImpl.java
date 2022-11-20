/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;

import br.com.mycompany.maestro.Modelo.VO.ServicoPrestado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
/**
 *
 * @author Natha
 */

public class ServicoPrestadoDAOImpl implements ServicoPrestadoDAO{
    
    EntityManager manager;
    
    public ServicoPrestadoDAOImpl() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(ServicoPrestado servicoPrestado) {
        manager.getTransaction().begin();
        manager.persist(servicoPrestado);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(ServicoPrestado servicoPrestado) {
        manager.getTransaction().begin();
        manager.merge(servicoPrestado);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(ServicoPrestado servicoPrestado) {
        manager.getTransaction().begin();
        manager.remove(servicoPrestado);
        manager.getTransaction().commit();
    }

    @Override
    public List<ServicoPrestado> listarTodos() {
        List<ServicoPrestado> ordem;
        
        Query query = manager.createQuery("SELECT m FROM ServicoPrestado m");
        ordem = query.getResultList();
        
        return ordem;
    }

    @Override
    public ServicoPrestado ListarUm(Long id) {
        ServicoPrestado ordem;
        
        Query query = manager.createQuery("SELECT m FROM ServicoPrestado m WHERE m.codigo = " + id);
        ordem = (ServicoPrestado)query.getSingleResult();
        return ordem;
    }
    
    @Override
    public List<ServicoPrestado> ListarFiltroLike(String like) {
        List<ServicoPrestado> servicoPrestado;
        
        Query query = manager.createQuery("SELECT m FROM ServicoPrestado m WHERE m.descricao LIKE '%" + like + "%'");
        servicoPrestado = query.getResultList();
        return servicoPrestado;
    }
}

