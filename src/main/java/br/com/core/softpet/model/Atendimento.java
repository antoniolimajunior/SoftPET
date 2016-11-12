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
@Table(name = "atendimento")
@NamedQueries({
    @NamedQuery(name = "Atendimento.findAll", query = "SELECT a FROM Atendimento a ORDER BY a.id"),
    @NamedQuery(name = "Atendimento.findById", query = "SELECT a FROM Atendimento a WHERE a.id = :id"),
    @NamedQuery(name = "Atendimento.findByNome", query = "SELECT a FROM Atendimento a WHERE a.numero LIKE :numero")})
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Cliente cliente;

    @OneToOne
    private Animal animal;
    
    @OneToOne
    private Usuario usuario;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "atendimento", orphanRemoval = true)
    private List<AtendimentoItem> atendimentoItem = new ArrayList<>();

    private String numero;
    
    private Date dataAtendimento;
    
    private String procedimento;
    
    private String prescricao;
    
    private String exameClinico;
    
    private Double temperaturaAnimal;
    
    private Integer frequenciaCardiaca;
    
    private Integer frequenciaRespiratoria;
    
    private String examesSolicitados;
    
    private Boolean situacao;
    
    private Double valorDesconto;
    
    private Double valorTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<AtendimentoItem> getAtendimentoItem() {
        return atendimentoItem;
    }

    public void setAtendimentoItem(List<AtendimentoItem> atendimentoItem) {
        this.atendimentoItem = atendimentoItem;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public String getExameClinico() {
        return exameClinico;
    }

    public void setExameClinico(String exameClinico) {
        this.exameClinico = exameClinico;
    }

    public Double getTemperaturaAnimal() {
        return temperaturaAnimal;
    }

    public void setTemperaturaAnimal(Double temperaturaAnimal) {
        this.temperaturaAnimal = temperaturaAnimal;
    }

    public Integer getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(Integer frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public Integer getFrequenciaRespiratoria() {
        return frequenciaRespiratoria;
    }

    public void setFrequenciaRespiratoria(Integer frequenciaRespiratoria) {
        this.frequenciaRespiratoria = frequenciaRespiratoria;
    }

    public String getExamesSolicitados() {
        return examesSolicitados;
    }

    public void setExamesSolicitados(String examesSolicitados) {
        this.examesSolicitados = examesSolicitados;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
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
