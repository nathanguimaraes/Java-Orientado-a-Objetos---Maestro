/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.RN;


import br.com.mycompany.maestro.Modelo.DAO.ServicoPrestadoDAO;
import br.com.mycompany.maestro.Modelo.DAO.ServicoPrestadoDAOImpl;
import br.com.mycompany.maestro.Modelo.VO.ServicoPrestado;
import java.util.List;
import org.hibernate.HibernateException;
/**
 *
 * @author Natha
 */

public class ServicoPrestadoRN {
    
    private ServicoPrestadoDAO servicoPrestadoDAO;
    
    public ServicoPrestadoRN() {
        servicoPrestadoDAO = new ServicoPrestadoDAOImpl();
    }
    
    public void salvar(ServicoPrestado servicoPrestado) {
        try {
            servicoPrestadoDAO.salvar(servicoPrestado);
        } catch (HibernateException he) {
            System.out.println(he); 
        }
    }
    
    public List<ServicoPrestado> listaTodos() {
        return servicoPrestadoDAO.listarTodos();
    }
    
    public ServicoPrestado listarUm(Long id) {
        return servicoPrestadoDAO.ListarUm(id);
    }
    
    public List<ServicoPrestado> listarFitroLike(String like) {
        return servicoPrestadoDAO.ListarFiltroLike(like);
    }
    
    public void atualizar(ServicoPrestado servicoPrestado) {
        servicoPrestadoDAO.atualizar(servicoPrestado);
    }
    
    public void excluir(ServicoPrestado servicoPrestado) {
        servicoPrestadoDAO.excluir(servicoPrestado);
    }     
}
