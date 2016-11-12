package br.com.core.softpet.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compra")
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c ORDER BY c.id"),
    @NamedQuery(name = "Compra.findById", query = "SELECT c FROM Compra c WHERE c.id = :id"),
    @NamedQuery(name = "Compra.findByNome", query = "SELECT c FROM Compra c WHERE c.numero LIKE :numero")})
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Fornecedor fornecedor;

    @OneToOne
    private Usuario usuario;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "compra", orphanRemoval = true)
    private List<CompraItem> compraItem = new ArrayList<>();

    private String numero;

    private Date dateEmissao;

    private Boolean situacao;

    private String tipoPagamento;

    private String observacao;

    private Double valorTotalDesconto;

    private Double valorTotalFrete;

    private Double valorTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDateEmissao() {
        return dateEmissao;
    }

    public void setDateEmissao(Date dateEmissao) {
        this.dateEmissao = dateEmissao;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Double getValorTotalDesconto() {
        return valorTotalDesconto;
    }

    public void setValorTotalDesconto(Double valorTotalDesconto) {
        this.valorTotalDesconto = valorTotalDesconto;
    }

    public Double getValorTotalFrete() {
        return valorTotalFrete;
    }

    public void setValorTotalFrete(Double valorTotalFrete) {
        this.valorTotalFrete = valorTotalFrete;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<CompraItem> getCompraItem() {
        return compraItem;
    }

    public void setCompraItem(List<CompraItem> compraItem) {
        this.compraItem = compraItem;
    }
}
