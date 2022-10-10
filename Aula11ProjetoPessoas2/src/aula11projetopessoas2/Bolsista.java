/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11projetopessoas2;

/**
 *
 * @author murilonobrega8
 */
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando Bolsa de " + this.getNome() + "!");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é Bolsista! Pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
     
}
