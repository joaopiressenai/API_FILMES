package com.filmes;

import jakarta.persistence.*;

@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 50,nullable = false)
    private String titulo;
    @Column(length = 200, nullable = false )
    private String descricao;
    @Column(nullable = false)
    private int duracao;

    public Filme() {
    }

    public Filme( String titulo, String descricao, int duracao) {

        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
