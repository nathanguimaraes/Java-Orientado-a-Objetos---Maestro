/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO.Generic;

import br.com.mycompany.maestro.Modelo.DAO.ConexaoHibernate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Natha
 */

public class GenericDAOImpl<T> implements GenericDAO<T> {

    EntityManager manager;
    
    public GenericDAOImpl() {
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void save(T object) {
        manager.getTransaction().begin();
        manager.persist(object);
        manager.getTransaction().commit();
    }

    @Override
    public  T listOne(String pkName, int pkValue, Class clazz) {
        String jpql = "SELECT t FROM " + clazz.getTypeName() + " t WHERE t." + pkName + " = " + pkValue;
        Query query = this.manager.createQuery(jpql);
        Object obj = query.getSingleResult();
        
        return (T) obj;
    }

    @Override
    public List listAll(Class clazz) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(T object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(T object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
