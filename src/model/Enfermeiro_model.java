/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author jao07
 */
public class Enfermeiro_model {
    private int id_enfermeiro;
    private String coren;
    private String nome_enfermeiro;
    private Date data_nascimento_enfermeiro;
    private String endereco_enfermeiro;

    public int getId_enfermeiro() {
        return id_enfermeiro;
    }

    public void setId_enfermeiro(int id_enfermeiro) {
        this.id_enfermeiro = id_enfermeiro;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public String getNome_enfermeiro() {
        return nome_enfermeiro;
    }

    public void setNome_enfermeiro(String nome_enfermeiro) {
        this.nome_enfermeiro = nome_enfermeiro;
    }

    public Date getData_nascimento_enfermeiro() {
        return data_nascimento_enfermeiro;
    }

    public void setData_nascimento_enfermeiro(Date data_nascimento_enfermeiro) {
        this.data_nascimento_enfermeiro = data_nascimento_enfermeiro;
    }

    public String getEndereco_enfermeiro() {
        return endereco_enfermeiro;
    }

    public void setEndereco_enfermeiro(String endereco_enfermeiro) {
        this.endereco_enfermeiro = endereco_enfermeiro;
    }
    
    
}
