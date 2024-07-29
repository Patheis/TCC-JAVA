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
public class Medicamento_model {
    private int id_medicamento;
    private String nome_medicamento;
    private String tarja_medicamento;
    private double dosagem_max;
    private double dosagem_medicamento;
    private Date data_vencimento;
    private String dados_adicionais;

    public int getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public String getNome_medicamento() {
        return nome_medicamento;
    }

    public void setNome_medicamento(String nome_medicamento) {
        this.nome_medicamento = nome_medicamento;
    }

    public String getTarja_medicamento() {
        return tarja_medicamento;
    }

    public void setTarja_medicamento(String tarja_medicamento) {
        this.tarja_medicamento = tarja_medicamento;
    }

    public double getDosagem_max() {
        return dosagem_max;
    }

    public void setDosagem_max(double dosagem_max) {
        this.dosagem_max = dosagem_max;
    }

    public double getDosagem_medicamento() {
        return dosagem_medicamento;
    }

    public void setDosagem_medicamento(double dosagem_medicamento) {
        this.dosagem_medicamento = dosagem_medicamento;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public String getDados_adicionais() {
        return dados_adicionais;
    }

    public void setDados_adicionais(String dados_adicionais) {
        this.dados_adicionais = dados_adicionais;
    }
    
}
