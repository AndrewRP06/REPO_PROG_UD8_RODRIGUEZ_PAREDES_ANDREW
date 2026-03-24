/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a04;

/**
 *
 * @author ALUMNO
 */
public class ImpresoraAvanzada implements Multifuncion {
    @Override
    public void imprimir(String nombreDocumento) {
        System.out.println("Imprimiendo: " + nombreDocumento);
    }
    @Override
    public void escanear(String nombreDocumento) {
        System.out.println("Escaneando: " + nombreDocumento);
    }
}
