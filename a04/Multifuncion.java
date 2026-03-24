/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a04;

/**
 *
 * @author ALUMNO
 */
public interface Multifuncion extends Escaneable, Imprimible {
        default void procesarDocumento(String nombreDocumento) {
        imprimir(nombreDocumento);
        escanear(nombreDocumento);
    }
}
