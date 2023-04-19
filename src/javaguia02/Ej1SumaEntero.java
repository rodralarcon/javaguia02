/*Escribir un programa que pida dos números enteros por teclado y calcule la
suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
package javaguia02;

import java.util.Scanner;

public class Ej1SumaEntero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner obj = new Scanner(System.in);
           int num1;
           int num2;
           int resultado;
           System.out.println("Ingresar el primer numero");
           num1 = obj.nextInt();
           System.out.println("Ingresar el segundo numero");
           num2 = obj.nextInt();
           resultado = num1 + num2;
           System.out.println("El resultado final es: " + resultado);
    }      
}
