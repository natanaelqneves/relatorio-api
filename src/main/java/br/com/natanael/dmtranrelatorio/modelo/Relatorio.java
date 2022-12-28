package br.com.natanael.dmtranrelatorio.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeMotorista;
    private String matriculaMotorista;
    private String placaVeiculo;
    private Long kmRodadoNoServico;
    private boolean avariadoNoServico;
    private String detalheDaAvariaNoServico;

    public Relatorio() {
    }

    public Relatorio(Integer id, String nomeMotorista, String matriculaMotorista, String placaVeiculo, Long kmRodadoNoServico, boolean avariadoNoServico, String detalheDaAvariaNoServico) {
        this.id = id;
        this.nomeMotorista = nomeMotorista;
        this.matriculaMotorista = matriculaMotorista;
        this.placaVeiculo = placaVeiculo;
        this.kmRodadoNoServico = kmRodadoNoServico;
        this.avariadoNoServico = avariadoNoServico;
        this.detalheDaAvariaNoServico = detalheDaAvariaNoServico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getMatriculaMotorista() {
        return matriculaMotorista;
    }

    public void setMatriculaMotorista(String matriculaMotorista) {
        this.matriculaMotorista = matriculaMotorista;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public Long getKmRodadoNoServico() {
        return kmRodadoNoServico;
    }

    public void setKmRodadoNoServico(Long kmRodadoNoServico) {
        this.kmRodadoNoServico = kmRodadoNoServico;
    }

    public boolean isAvariadoNoServico() {
        return avariadoNoServico;
    }

    public void setAvariadoNoServico(boolean avariadoNoServico) {
        this.avariadoNoServico = avariadoNoServico;
    }

    public String getDetalheDaAvariaNoServico() {
        return detalheDaAvariaNoServico;
    }

    public void setDetalheDaAvariaNoServico(String detalheDaAvariaNoServico) {
        this.detalheDaAvariaNoServico = detalheDaAvariaNoServico;
    }
}
