/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author murilonobrega8
 */
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
         
    //* Escrito com Alt+Insert:

    public Caneta(String modelo, float ponta, String cor) { //Este é um método CONSTRUTOR pois possui o memso nome da CLASSE!
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    
    /** Escrito a mão:
    public Caneta(String m, String c, float p) { //Este é um método CONSTRUTOR pois possui o memso nome da CLASSE!
        this.modelo = m; // Poderia ser também this.setModelo(m);
        this.cor = c;
        this.setPonta(p); // Poderia ser também this.ponta = p;
        this.tampar();
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta( float p) {
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }*/
    
}
