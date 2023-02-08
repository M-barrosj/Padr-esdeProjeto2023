/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControleDeMatriculaInterface;

/**
 *
 * @author Aluno
 */
public class Aluno {
    
    private String nome;
    private String cpf;
    private String numeroMatricula;

    public Aluno(String nome, String cpf, String numeroMatricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
    
    
    
    
    
}
