/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO.Generic;

import java.util.List;

/**
 *
 * @author Natha
 */
public interface GenericDAO<T>{
    
    void save(T object);
    
    T listOne(String pkName, int pkValue, Class clazz);
    
    List listAll(Class clazz);
    
    void update(T object);
    
    void delete(T object);   
}
