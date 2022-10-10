/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09leitorlivro;

/**
 *
 * @author murilonobrega8
 */
public class Aula09LeitorLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] pessoa = new Pessoa[2];
        Livro [] livro = new Livro[3];
        
        pessoa[0] = new Pessoa("Pedro", "M", 22);
        pessoa[1] = new Pessoa("Maria", "F", 25);
        
        livro[0] = new Livro("Aprendendo Java", "José da Silva", 300, pessoa[0]);
        livro[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, pessoa[1]);
        livro[2] = new Livro("Java Avançado", "Maria Cândido", 800, pessoa[0]);
        
        livro[0].abrir();
        livro[0].folhear(100);
        livro[0].avancarPag();
        System.out.println(livro[0].detalhes());
        
        System.out.println(livro[1].detalhes());
    }
    
}
