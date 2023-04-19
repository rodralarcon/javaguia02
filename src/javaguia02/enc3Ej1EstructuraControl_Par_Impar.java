/*Crear un programa que dado un número determine si es par o impar.
  */
package javaguia02;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class enc3Ej1EstructuraControl_Par_Impar {

    public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      int num;
      System.out.println("ingrese un numero a evaluar: ");
      num=teclado.nextInt();
      if(num % 2==0)
      System.out.println(num + " es un numero par");
      else
      System.out.println(num + " es un numero es impar");
    }
    
}
