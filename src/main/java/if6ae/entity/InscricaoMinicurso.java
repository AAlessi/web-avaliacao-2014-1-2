/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6ae.entity;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author a1015591
 */
@Entity
@Table(name = "incricao_minicurso")

public class InscricaoMinicurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)

    private int numero_inscricao; // chave primaria
    private int minicurso; //chave primaria
    private Date data_hora;
    private int situacao;

    public int getNumero_inscricao() {
        return numero_inscricao;
    }

    public void setNumero_inscricao(int numero_inscricao) {
        this.numero_inscricao = numero_inscricao;
    }

    public int getMinicurso() {
        return minicurso;
    }

    public void setMinicurso(int minicurso) {
        this.minicurso = minicurso;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }
    
    


}
