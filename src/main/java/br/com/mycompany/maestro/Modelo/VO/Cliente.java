/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mycompany.maestro.Modelo.VO;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Natha
 */
@Entity
@Table(name = "tb_cliente")
public class Cliente extends Pessoa{
       
    @Transient
    private Boolean status;
    
    @OneToMany(mappedBy = "cliente")
    private List<Processo> processo;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}