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
public class Receita_model {
    private int id_receita;
    private Date data_receita;
    private double dosagem_medicamento_receita ;
    private int periodo_medicacao;
    private String observacao_receita;
    private int fk_medico;
    private int fk_medicamento;

    public int getId_receita() {
        return id_receita;
    }

    public void setId_receita(int id_receita) {
        this.id_receita = id_receita;
    }

    public Date getData_receita() {
        return data_receita;
    }

    public void setData_receita(Date data_receita) {
        this.data_receita = data_receita;
    }

    public double getDosagem_medicamento_receita() {
        return dosagem_medicamento_receita;
    }

    public void setDosagem_medicamento_receita(double dosagem_medicamento_receita) {
        this.dosagem_medicamento_receita = dosagem_medicamento_receita;
    }

    public int getPeriodo_medicacao() {
        return periodo_medicacao;
    }

    public void setPeriodo_medicacao(int periodo_medicacao) {
        this.periodo_medicacao = periodo_medicacao;
    }

    public String getObservacao_receita() {
        return observacao_receita;
    }

    public void setObservacao_receita(String observacao_receita) {
        this.observacao_receita = observacao_receita;
    }

    public int getFk_medico() {
        return fk_medico;
    }

    public void setFk_medico(int fk_medico) {
        this.fk_medico = fk_medico;
    }

    public int getFk_medicamento() {
        return fk_medicamento;
    }

    public void setFk_medicamento(int fk_medicamento) {
        this.fk_medicamento = fk_medicamento;
    }
    
}
