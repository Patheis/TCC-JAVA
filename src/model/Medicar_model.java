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
public class Medicar_model {
    private int id_medicar;
    private String descricao_aplicacao;
    private Date data_aplicacao;
    private double dosagem_medicada;
    private int fk_paciente;
    private int fk_enfermeiro;
    private int fk_medicamento;
    private int fk_receita;

    public int getFk_receita() {
        return fk_receita;
    }

    public void setFk_receita(int fk_receita) {
        this.fk_receita = fk_receita;
    }

    public int getId_medicar() {
        return id_medicar;
    }

    public void setId_medicar(int id_medicar) {
        this.id_medicar = id_medicar;
    }

    public String getDescricao_aplicacao() {
        return descricao_aplicacao;
    }

    public void setDescricao_aplicacao(String descricao_aplicacao) {
        this.descricao_aplicacao = descricao_aplicacao;
    }

    public Date getData_aplicacao() {
        return data_aplicacao;
    }

    public void setData_aplicacao(Date data_aplicacao) {
        this.data_aplicacao = data_aplicacao;
    }

    public double getDosagem_medicada() {
        return dosagem_medicada;
    }

    public void setDosagem_medicada(double dosagem_medicada) {
        this.dosagem_medicada = dosagem_medicada;
    }

    public int getFk_paciente() {
        return fk_paciente;
    }

    public void setFk_paciente(int fk_paciente) {
        this.fk_paciente = fk_paciente;
    }

    public int getFk_enfermeiro() {
        return fk_enfermeiro;
    }

    public void setFk_enfermeiro(int fk_enfermeiro) {
        this.fk_enfermeiro = fk_enfermeiro;
    }

    public int getFk_medicamento() {
        return fk_medicamento;
    }

    public void setFk_medicamento(int fk_medicamento) {
        this.fk_medicamento = fk_medicamento;
    }
    
    
}
