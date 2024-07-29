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
public class Paciente_model {
    private int id_paciente;
    private String nome_paciente;
    private String cpf;
    private String telefone_paciente;
    private Date data_nascimento_paciente;
    private String endereco_paciente;
    private String sexo_paciente;
    private int fk_restricoes;

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNome_paciente() {
        return nome_paciente;
    }

    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone_paciente() {
        return telefone_paciente;
    }

    public void setTelefone_paciente(String telefone_paciente) {
        this.telefone_paciente = telefone_paciente;
    }

    public Date getData_nascimento_paciente() {
        return data_nascimento_paciente;
    }

    public void setData_nascimento_paciente(Date data_nascimento_paciente) {
        this.data_nascimento_paciente = data_nascimento_paciente;
    }

    public String getEndereco_paciente() {
        return endereco_paciente;
    }

    public void setEndereco_paciente(String endereco_paciente) {
        this.endereco_paciente = endereco_paciente;
    }

    public String getSexo_paciente() {
        return sexo_paciente;
    }

    public void setSexo_paciente(String sexo_paciente) {
        this.sexo_paciente = sexo_paciente;
    }

    public int getFk_restricoes() {
        return fk_restricoes;
    }

    public void setFk_restricoes(int fk_restricoes_idrestrico) {
        this.fk_restricoes = fk_restricoes_idrestrico;
    }
    
    
    
}
