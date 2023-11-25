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
@Table(name = "PessoaJuridica")
@NamedQueries({
    @NamedQuery(name = "PessoaJuridica.findAll", query = "SELECT p FROM PessoaJuridica p"),
    @NamedQuery(name = "PessoaJuridica.findByPessoaJuridicaID", query = "SELECT p FROM PessoaJuridica p WHERE p.pessoaJuridicaID = :pessoaJuridicaID"),
    @NamedQuery(name = "PessoaJuridica.findByCnpj", query = "SELECT p FROM PessoaJuridica p WHERE p.cnpj = :cnpj")})
public class PessoaJuridica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PessoaJuridicaID")
    private Integer pessoaJuridicaID;
    @Column(name = "CNPJ")
    private Integer cnpj;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoaJuridicaPessoaJuridicaID")
    private Collection<MovimentoCompra> movimentoCompraCollection;
    @JoinColumn(name = "Pessoa_PessoaID", referencedColumnName = "PessoaID")
    @ManyToOne(optional = false)
    private Pessoa pessoaPessoaID;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Integer pessoaJuridicaID) {
        this.pessoaJuridicaID = pessoaJuridicaID;
    }

    public Integer getPessoaJuridicaID() {
        return pessoaJuridicaID;
    }

    public void setPessoaJuridicaID(Integer pessoaJuridicaID) {
        this.pessoaJuridicaID = pessoaJuridicaID;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Collection<MovimentoCompra> getMovimentoCompraCollection() {
        return movimentoCompraCollection;
    }

    public void setMovimentoCompraCollection(Collection<MovimentoCompra> movimentoCompraCollection) {
        this.movimentoCompraCollection = movimentoCompraCollection;
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
        hash += (pessoaJuridicaID != null ? pessoaJuridicaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaJuridica)) {
            return false;
        }
        PessoaJuridica other = (PessoaJuridica) object;
        if ((this.pessoaJuridicaID == null && other.pessoaJuridicaID != null) || (this.pessoaJuridicaID != null && !this.pessoaJuridicaID.equals(other.pessoaJuridicaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.PessoaJuridica[ pessoaJuridicaID=" + pessoaJuridicaID + " ]";
    }
    
}
