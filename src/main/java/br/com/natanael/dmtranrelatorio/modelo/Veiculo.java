package br.com.natanael.dmtranrelatorio.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String placaVeiculo;
    private String nomeMarca;
    private Long kmRodado;
    private boolean avariado;
    private String detalheDaAvaria;

    public Veiculo() {
    }

    public Veiculo(Integer id, String placaVeiculo, String nomeMarca, Long kmRodado, boolean avariado, String detalheDaAvaria) {
        this.id = id;
        this.placaVeiculo = placaVeiculo;
        this.nomeMarca = nomeMarca;
        this.kmRodado = kmRodado;
        this.avariado = avariado;
        this.detalheDaAvaria = detalheDaAvaria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public Long getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(Long kmRodado) {
        this.kmRodado = kmRodado;
    }

    public boolean isAvariado() {
        return avariado;
    }

    public void setAvariado(boolean avariado) {
        this.avariado = avariado;
    }

    public String getDetalheDaAvaria() {
        return detalheDaAvaria;
    }

    public void setDetalheDaAvaria(String detalheDaAvaria) {
        this.detalheDaAvaria = detalheDaAvaria;
    }
}
