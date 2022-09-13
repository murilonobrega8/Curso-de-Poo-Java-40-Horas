/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aula09leitorlivro;

/**
 *
 * @author murilonobrega8
 */
public interface Publicacao {
    public void abrir();
    public void fechar();
    public void folhear(int pagina);
    public void avancarPag();
    public void voltarPag();
}
