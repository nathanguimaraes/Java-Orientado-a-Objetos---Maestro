/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.DAO;


import br.com.mycompany.maestro.Modelo.VO.ServicoPrestado;
import java.util.List;

/**
 *
 * @author Natha
 */
public interface ServicoPrestadoDAO {
    
    void salvar(ServicoPrestado servicoPrestado);
    
    void atualizar(ServicoPrestado servicoPrestado);
    
    void excluir(ServicoPrestado servicoPrestado);
    
    List<ServicoPrestado> listarTodos();
    
    ServicoPrestado ListarUm(Long id);
    
    List<ServicoPrestado> ListarFiltroLike(String like);    
}
