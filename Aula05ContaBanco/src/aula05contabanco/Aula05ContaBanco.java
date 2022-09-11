/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05contabanco;

/**
 *
 * @author murilonobrega8
 */
public class Aula05ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(13001);
        p1.setDono("Jubileu");
        p1.abrirConta("CP");
        p1.depositar(300);
        p1.sacar(450);
        p1.fecharConta();
        
        p1.EstadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(13002);
        p2.setDono("Creuza");
        p2.abrirConta("CC");
        p2.depositar(500);
        p2.sacar(100);
                
        p2.EstadoAtual();
    }
    
}
