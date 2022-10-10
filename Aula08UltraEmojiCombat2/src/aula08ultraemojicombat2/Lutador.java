/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08ultraemojicombat2;

/**
 *
 * @author murilonobrega8
 */
public class Lutador {
    // Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    // Métodos Públicos
    public void apresentar() {
        System.out.println("-----------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome() + "!");
        System.out.print("Diretamente de " + this.getNacionalidade());
        System.out.println(", com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura!");
        System.out.print("Pesando " + this.getPeso() + "kg, tem " + this.getVitorias() + " vitórias, ");
        System.out.println(this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates!");
    }
    
    public void status() {
        System.out.println(this.getNome() + " é da categoria " + this.getCategoria() + "!");
        System.out.println("Ganhou " + this.getVitorias() + " vezes!");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes!");
        System.out.println("E empatou " + this.getEmpates() + " vezes!");
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    // Métodos Especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
            int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Peso Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    
    
}
