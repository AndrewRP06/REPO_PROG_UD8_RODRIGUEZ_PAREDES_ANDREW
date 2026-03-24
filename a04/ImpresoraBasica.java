/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a04;

/**
 *
 * @author ALUMNO
 */
public class ImpresoraBasica implements Imprimible  {
    @Override
    public void imprimir(String nombreDocumento) {
        System.out.println("Imprimiendo: " + nombreDocumento);
    }
}
