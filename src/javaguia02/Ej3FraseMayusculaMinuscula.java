/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package javaguia02;

import java.util.Scanner;

public class Ej3FraseMayusculaMinuscula {
        public static void main(String[] args) {
            String palabra = "";
            Scanner hp= new Scanner(System.in);
            System.out.println("Ingrese una frase o palabra");
            palabra=hp.nextLine();
            System.out.println(palabra.toLowerCase());
            System.out.println(palabra.toUpperCase());
        } 
}
