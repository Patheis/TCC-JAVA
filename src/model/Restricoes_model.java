/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jao07
 */
public class Restricoes_model {
    private int id_restricoes;
    private int fk_medicamento;
    private int fk_patologia;
    private int fk_doenca;

    public int getId_restricoes() {
        return id_restricoes;
    }

    public void setId_restricoes(int id_restricoes) {
        this.id_restricoes = id_restricoes;
    }

    public int getFk_medicamento() {
        return fk_medicamento;
    }

    public void setFk_medicamento(int fk_medicamento) {
        this.fk_medicamento = fk_medicamento;
    }

    public int getFk_patologia() {
        return fk_patologia;
    }

    public void setFk_patologia(int fk_patologia) {
        this.fk_patologia = fk_patologia;
    }

    public int getFk_doenca() {
        return fk_doenca;
    }

    public void setFk_doenca(int fk_doenca) {
        this.fk_doenca = fk_doenca;
    }
}
