/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14projetoyoutube;

/**
 *
 * @author murilonobrega8
 */
public class Aula14ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        System.out.println(v[0].toString());
        System.out.println("===================================================="
                + "=========================================");
        System.out.println(v[1].toString());
        System.out.println("===================================================="
                + "=========================================");
        System.out.println(v[2].toString());
        
        System.out.println("");
        System.out.println("          =====-------------------------------------"
                + "--------------------------=====          ");
        System.out.println("");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", "M", 22, "juba");
        g[1] = new Gafanhoto("Creuza", "F", 12, "creuzita");
        
        System.out.println(g[0].toString());
        System.out.println("===================================================="
                + "============");
        System.out.println(g[1].toString());
    }
    
}
