/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06controleremoto;

/**
 *
 * @author murilonobrega8
 */
public class ControleRemoto implements Controlador {

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        this.setVolume(50);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setVolume(0);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 0; i <= this.getVolume(); i+=10) {
                System.out.print("|");
            }
            System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando MENU...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Não posso aumentar o volume de um aparelho desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Não posso diminuir o volume de um aparelho desligado.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("Não posso ligar o Mudo de um aparelho desligado ou que já esteja no Volume 0.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
        this.setVolume(50);
        } else {
            System.out.println("Não posso desligar o Mudo de um aparelho desligado ou que não esteja no Volume 0.");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
        this.setTocando(true);
        } else {
            System.out.println("Não posso Tocar um aparelho desligado ou que já esteja Tocando.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não posso Pausar um aparelho desligado ou que já esteja Pausado.");
        }
    }
}
