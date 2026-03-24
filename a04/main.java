/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a04;

/**
 *
 * @author ALUMNO
 */
public class main {
      public static void main(String[] args){
          Multifuncion mf = new ImpresoraAvanzada();
            mf.imprimir("Factura.pdf");
            mf.escanear("Contrato.pdf");        
                
         System.out.println("-------");
         System.out.println("-------");
         Imprimible im = new ImpresoraBasica();
         im.imprimir("Factura.pdf");
      
      
      
  }
}
