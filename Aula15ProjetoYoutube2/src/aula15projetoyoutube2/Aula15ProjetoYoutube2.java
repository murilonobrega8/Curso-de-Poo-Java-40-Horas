/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15projetoyoutube2;

/**
 *
 * @author murilonobrega8
 */
public class Aula15ProjetoYoutube2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        System.out.println("");
        System.out.println("          =====----------------------------VÍDEOS----------------------------=====          ");
        System.out.println("");
        
        System.out.println(v[0].toString());
        System.out.println("===================================================="
                + "=========================================");
        System.out.println(v[1].toString());
        System.out.println("===================================================="
                + "=========================================");
        System.out.println(v[2].toString());
        
        System.out.println("");
        System.out.println("          =====--------------------------GAFANHOTOS--------------------------=====          ");
        System.out.println("");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", "M", 22, "juba");
        g[1] = new Gafanhoto("Creuza", "F", 12, "creuzita");
        
        System.out.println(g[0].toString());
        System.out.println("===================================================="
                + "============");
        System.out.println(g[1].toString());
        
        System.out.println("");
        System.out.println("          =====-----------------------------VIEWS----------------------------=====          ");
        System.out.println("");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        v[2].play();
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        System.out.println("===================================================="
                + "===================================================");
        vis[1] = new Visualizacao(g[0], v[1]);
        v[1].play();
        vis[1].avaliar(5);
        System.out.println(vis[1].toString());
        System.out.println("===================================================="
                + "===================================================");
        vis[2] = new Visualizacao(g[1], v[0]);
        vis[2].avaliar(75.3f);
        v[0].setCurtidas(1);
        System.out.println(vis[2].toString());
        System.out.println("===================================================="
                + "===================================================");
        vis[3] = new Visualizacao(g[0], v[0]);
        vis[3].avaliar(10);
        v[0].setCurtidas(1);
        System.out.println(vis[3].toString());
        System.out.println("===================================================="
                + "===================================================");
        vis[4] = new Visualizacao(g[1], v[2]);
        v[2].pause();
        vis[4].avaliar();
        System.out.println(vis[4].toString());
                
        System.out.println("");
        System.out.println("          =====------------------------------------"
                + "--------------------------=====          ");
        System.out.println("");
    }
    
}
