/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04canetaclasse;

/**
 *
 * @author murilonobrega8
 */
public class Aula04CanetaClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("null", 0.0f, "null");
        c1.status();
        Caneta c2 = new Caneta("BIC", 0.7f, "Vermelha");
        c2.status();
        Caneta c3 = new Caneta("Printer", 0.5f, "Verde");
        c3.status();
    }
    
}
