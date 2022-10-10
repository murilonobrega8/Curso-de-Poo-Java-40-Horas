/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03caneta2;

/**
 *
 * @author murilonobrega8
 */
public class Aula03Caneta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        // c1.tampada = true; atributo private não pode alterar
        c1.status();
        c1.destampar(); // mas você pode chamar um método público da mesma classe que altere o atributo private
        c1.rabiscar();        
    }
    
}
