/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package javaguia02;

import java.util.Scanner;

public class Ej4GradosFahrenheit {
      public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      double F, C;
      System.out.println("Ingrese la cantidad de grados Celsius a convertir");
      C = lector.nextDouble();
      F = 9 / 5.0 * C + 32;
      System.out.println(C + "grados celsius equivale a " + F + "grados Fahrenheit.");
      
      }
}