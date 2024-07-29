/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jao07
 */
public class Patologia_model {
    private int id_patologia;
    private String descricao_patologia;
    private String gravidade_patologia;

    public int getId_patologia() {
        return id_patologia;
    }

    public void setId_patologia(int id_patologia) {
        this.id_patologia = id_patologia;
    }

    public String getDescricao_patologia() {
        return descricao_patologia;
    }

    public void setDescricao_patologia(String descricao_patologia) {
        this.descricao_patologia = descricao_patologia;
    }

    public String getGravidade_patologia() {
        return gravidade_patologia;
    }

    public void setGravidade_patologia(String gravidade_patologia) {
        this.gravidade_patologia = gravidade_patologia;
    }
    
}
