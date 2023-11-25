/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "PessoaFisica")
@NamedQueries({
    @NamedQuery(name = "PessoaFisica.findAll", query = "SELECT p FROM PessoaFisica p"),
    @NamedQuery(name = "PessoaFisica.findByPessoaFisicaID", query = "SELECT p FROM PessoaFisica p WHERE p.pessoaFisicaID = :pessoaFisicaID"),
    @NamedQuery(name = "PessoaFisica.findByCpf", query = "SELECT p FROM PessoaFisica p WHERE p.cpf = :cpf")})
public class PessoaFisica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PessoaFisicaID")
    private Integer pessoaFisicaID;
    @Column(name = "CPF")
    private Integer cpf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoaFisicaPessoaFisicaID")
    private Collection<MovimentoVenda> movimentoVendaCollection;
    @JoinColumn(name = "Pessoa_PessoaID", referencedColumnName = "PessoaID")
    @ManyToOne(optional = false)
    private Pessoa pessoaPessoaID;

    public PessoaFisica() {
    }

    public PessoaFisica(Integer pessoaFisicaID) {
        this.pessoaFisicaID = pessoaFisicaID;
    }

    public Integer getPessoaFisicaID() {
        return pessoaFisicaID;
    }

    public void setPessoaFisicaID(Integer pessoaFisicaID) {
        this.pessoaFisicaID = pessoaFisicaID;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Collection<MovimentoVenda> getMovimentoVendaCollection() {
        return movimentoVendaCollection;
    }

    public void setMovimentoVendaCollection(Collection<MovimentoVenda> movimentoVendaCollection) {
        this.movimentoVendaCollection = movimentoVendaCollection;
    }

    public Pessoa getPessoaPessoaID() {
        return pessoaPessoaID;
    }

    public void setPessoaPessoaID(Pessoa pessoaPessoaID) {
        this.pessoaPessoaID = pessoaPessoaID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pessoaFisicaID != null ? pessoaFisicaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaFisica)) {
            return false;
        }
        PessoaFisica other = (PessoaFisica) object;
        if ((this.pessoaFisicaID == null && other.pessoaFisicaID != null) || (this.pessoaFisicaID != null && !this.pessoaFisicaID.equals(other.pessoaFisicaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.PessoaFisica[ pessoaFisicaID=" + pessoaFisicaID + " ]";
    }
    
}
