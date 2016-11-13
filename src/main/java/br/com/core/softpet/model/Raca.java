package br.com.core.softpet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "raca")
@NamedQueries({
    @NamedQuery(name = "Raca.findAll", query = "SELECT r FROM Raca r ORDER BY r.id"),
    @NamedQuery(name = "Raca.findById", query = "SELECT r FROM Raca r WHERE r.id = :id"),
    @NamedQuery(name = "Raca.findByDescricao", query = "SELECT r FROM Raca r WHERE r.descricao LIKE :descricao")})
public class Raca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    private Especie especie;

    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
