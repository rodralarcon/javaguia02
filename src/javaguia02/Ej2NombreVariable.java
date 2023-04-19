/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo 
muestre por pantalla.
*/
package javaguia02;

import java.util.Scanner;

public class Ej2NombreVariable {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
           String nom,ape;
           System.out.println("Ingrese nombre");
           nom = teclado.nextLine();
           System.out.println("Ingrese apellido");
           ape = teclado.nextLine();
           System.out.println("Usted se llama " + nom +" "+ ape);
   
    }
}
           