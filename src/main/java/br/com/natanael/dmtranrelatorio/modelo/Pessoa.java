package br.com.natanael.dmtranrelatorio.modelo;

import jakarta.persistence.*;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome", unique = true)
    private String nome;
    @Column(unique = true)
    private String matricula;
    @Column(unique = true)
    private String nomeDeUsuario;
    private String senhaDeUsuario;

    public Pessoa() {
    }

    public Pessoa(Integer id, String nome, String matricula, String nomeDeUsuario, String senhaDeUsuario) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.nomeDeUsuario = nomeDeUsuario;
        this.senhaDeUsuario = senhaDeUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public String getSenhaDeUsuario() {
        return senhaDeUsuario;
    }

    public void setSenhaDeUsuario(String senhaDeUsuario) {
        this.senhaDeUsuario = senhaDeUsuario;
    }
}
