/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.VO;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Natha
 */


@Table(name = "tb_processo")
@Entity
public class Processo{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    private LocalDate dtent;
    
    private LocalDate dtsaida;
    
    @ManyToOne
    @JoinColumn(name = "cod_cli")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name = "cod_acao")
    private Acao acao;
    
    @Enumerated(EnumType.STRING)
    private EstadoProcesso estadoProcesso;
    
    @ManyToOne
    @JoinColumn(name = "cod_estag")
    private Estagiario estagiario;

    
    @Column(nullable = false)
    
    
    private String indiciado;
    private String servico;
    private double valort;
    private String causa;
    private String servicosExtras;
  
   

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDtent() {
        return dtent;
    }

    public void setDtent(LocalDate dtent) {
        this.dtent = dtent;
    }

    public LocalDate getDtsaida() {
        return dtsaida;
    }

    public void setDtsaida(LocalDate dtsaida) {
        this.dtsaida = dtsaida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Acao getAcao() {
        return acao;
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }

    public EstadoProcesso getEstadoProcesso() {
        return estadoProcesso;
    }

    public void setEstadoProcesso(EstadoProcesso estadoProcesso) {
        this.estadoProcesso = estadoProcesso;
    }

    public Estagiario getEstagiario() {
        return estagiario;
    }

    public void setEstagiario(Estagiario estagiario) {
        this.estagiario = estagiario;
    }

    public String getCausa() {
        return causa;
   }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getIndiciado() {
        return  indiciado;
    }

    public void setIndiciado(String indiciado) {
        this.indiciado = indiciado;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public double getValort() {
        return valort;
    }

    public void setValort(double valort) {
        this.valort = valort;
    }
    
    public void setServicosExtras(String servicosExtras){
        this.servicosExtras = servicosExtras;
    }
    
    public String getServicosExtras(){
        return servicosExtras;
    }


}
