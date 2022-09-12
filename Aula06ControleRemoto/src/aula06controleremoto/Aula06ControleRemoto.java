/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06controleremoto;

/**
 *
 * @author murilonobrega8
 */
public class Aula06ControleRemoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto cr = new ControleRemoto();
        cr.ligar();
        cr.maisVolume();
        cr.abrirMenu();
        cr.ligarMudo();
        cr.abrirMenu();
        cr.desligarMudo();
        cr.abrirMenu();
        cr.play();
        cr.abrirMenu();
        cr.pause();
        cr.abrirMenu();
        cr.fecharMenu();
        cr.menosVolume();
        cr.abrirMenu();
        cr.desligar();
        cr.abrirMenu();
        cr.ligar();
        cr.abrirMenu();
    }
    
}
