/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jao07
 */
public class Doenca_model {
    private int id_doenca;
    private String nome_doenca;
    private String gravidade;

    public int getId_doenca() {
        return id_doenca;
    }

    public void setId_doenca(int id_doenca) {
        this.id_doenca = id_doenca;
    }

    public String getNome_doenca() {
        return nome_doenca;
    }

    public void setNome_doenca(String nome_doenca) {
        this.nome_doenca = nome_doenca;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }
}
