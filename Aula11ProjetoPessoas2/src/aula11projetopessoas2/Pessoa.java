/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11projetopessoas2;

/**
 *
 * @author murilonobrega8
 */
public abstract class Pessoa {
    // Atributos
    private String nome, sexo;
    private int idade;
    
    // Métodos
    public void fazerAniver() {
        this.idade++;
    }
    
    // Métodos Epeciais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Dados {nome = " + nome + ", sexo = " + sexo + ", idade = " + idade + "}";
    }
    
    
    
}
