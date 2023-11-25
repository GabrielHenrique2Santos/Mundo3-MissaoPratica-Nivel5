/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "MovimentoVenda")
@NamedQueries({
    @NamedQuery(name = "MovimentoVenda.findAll", query = "SELECT m FROM MovimentoVenda m"),
    @NamedQuery(name = "MovimentoVenda.findByMovimentoVendaID", query = "SELECT m FROM MovimentoVenda m WHERE m.movimentoVendaID = :movimentoVendaID"),
    @NamedQuery(name = "MovimentoVenda.findByQuantidade", query = "SELECT m FROM MovimentoVenda m WHERE m.quantidade = :quantidade")})
public class MovimentoVenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MovimentoVendaID")
    private Integer movimentoVendaID;
    @Column(name = "Quantidade")
    private Integer quantidade;
    @JoinColumn(name = "PessoaFisica_PessoaFisicaID", referencedColumnName = "PessoaFisicaID")
    @ManyToOne(optional = false)
    private PessoaFisica pessoaFisicaPessoaFisicaID;
    @JoinColumn(name = "Produtos_ProdutosID", referencedColumnName = "ProdutosID")
    @ManyToOne(optional = false)
    private Produtos produtosProdutosID;
    @JoinColumn(name = "Usuario_UsuarioID", referencedColumnName = "UsuarioID")
    @ManyToOne(optional = false)
    private Usuario usuarioUsuarioID;

    public MovimentoVenda() {
    }

    public MovimentoVenda(Integer movimentoVendaID) {
        this.movimentoVendaID = movimentoVendaID;
    }

    public Integer getMovimentoVendaID() {
        return movimentoVendaID;
    }

    public void setMovimentoVendaID(Integer movimentoVendaID) {
        this.movimentoVendaID = movimentoVendaID;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public PessoaFisica getPessoaFisicaPessoaFisicaID() {
        return pessoaFisicaPessoaFisicaID;
    }

    public void setPessoaFisicaPessoaFisicaID(PessoaFisica pessoaFisicaPessoaFisicaID) {
        this.pessoaFisicaPessoaFisicaID = pessoaFisicaPessoaFisicaID;
    }

    public Produtos getProdutosProdutosID() {
        return produtosProdutosID;
    }

    public void setProdutosProdutosID(Produtos produtosProdutosID) {
        this.produtosProdutosID = produtosProdutosID;
    }

    public Usuario getUsuarioUsuarioID() {
        return usuarioUsuarioID;
    }

    public void setUsuarioUsuarioID(Usuario usuarioUsuarioID) {
        this.usuarioUsuarioID = usuarioUsuarioID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movimentoVendaID != null ? movimentoVendaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimentoVenda)) {
            return false;
        }
        MovimentoVenda other = (MovimentoVenda) object;
        if ((this.movimentoVendaID == null && other.movimentoVendaID != null) || (this.movimentoVendaID != null && !this.movimentoVendaID.equals(other.movimentoVendaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MovimentoVenda[ movimentoVendaID=" + movimentoVendaID + " ]";
    }
    
}
