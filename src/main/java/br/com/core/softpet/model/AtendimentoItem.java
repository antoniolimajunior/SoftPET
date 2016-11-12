package br.com.core.softpet.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "atendimentoItem")
@NamedQueries({
    @NamedQuery(name = "AtendimentoItem.findAll", query = "SELECT ai FROM AtendimentoItem ai ORDER BY ai.id"),
    @NamedQuery(name = "AtendimentoItem.findById", query = "SELECT ai FROM AtendimentoItem ai WHERE ai.id = :id"),
    @NamedQuery(name = "AtendimentoItem.findByAtendimento", query = "SELECT ai FROM AtendimentoItem ai WHERE ai.atendimento.id LIKE :id")
})
public class AtendimentoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Produto produto;
    
    @ManyToOne
    private Atendimento atendimento;
    
    private Double quantidade;
    
    private Double valorUnitario;
    
    private Double percentualDesconto;
    
    private Double valorDesconto;
    
    private Double valorTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(Double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }    
}
