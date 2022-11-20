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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Natha
 */
@Entity
@Table(name = "tb_acao")
public class Acao{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(nullable = false)
    private String descricao;
    
    @ManyToOne
    @JoinColumn(name = "cod_ordem")
    private Ordem ordem;
    
    @ManyToOne
    @JoinColumn(name = "cod_servicoPrestado")
    private ServicoPrestado servicoPrestado;
    
    @OneToMany(mappedBy = "acao")
    private List<Processo> processos;
    
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
    public Ordem getOrdem() {
        return ordem;
    }   

    public void setOrdem(Ordem ordem) {
        this.ordem = ordem;
    }

    public ServicoPrestado getServicoPrestado() {
        return servicoPrestado;
    }

    public void setServicoPrestado(ServicoPrestado servicoPrestado) {
        this.servicoPrestado = servicoPrestado;
    }

   
}
