package com.ufsm.csi.model;

import java.sql.Date;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private Date data_cadastro;

    public Usuario(String nome, String email, String senha, Date data_cadastro) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.data_cadastro = data_cadastro;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }



    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }



    private boolean ativo;
}
