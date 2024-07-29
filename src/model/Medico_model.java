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
public class Medico_model {
    private int id_medico;
    private String nome_medico;
    private Date data_nascimento_medico;
    private String endereco_medico;
    private String especialidade;

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public String getNome_medico() {
        return nome_medico;
    }

    public void setNome_medico(String nome_medico) {
        this.nome_medico = nome_medico;
    }

    public Date getData_nascimento_medico() {
        return data_nascimento_medico;
    }

    public void setData_nascimento_medico(Date data_nascimento_medico) {
        this.data_nascimento_medico = data_nascimento_medico;
    }

    public String getEndereco_medico() {
        return endereco_medico;
    }

    public void setEndereco_medico(String endereco_medico) {
        this.endereco_medico = endereco_medico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
