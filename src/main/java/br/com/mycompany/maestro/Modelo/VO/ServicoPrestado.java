/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.VO;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Natha
 */

@Entity
@Table(name = "tb_servicoPrestado")
public class ServicoPrestado{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(nullable = false)
    private String descricao;
    
    @OneToMany(mappedBy = "servicoPrestado")
    private List<Acao> acao;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }  
}
