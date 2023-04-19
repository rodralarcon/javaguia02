/*Escribir un programa que lea un número entero por teclado y muestre por
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package javaguia02;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ej5EnteroDobleTripleRaiz {
        public static void main(String[] args) {
        int numero;
        int numero_doble;
        int numero_triple;
        double numero_Raiz;
        System.out.println("Escribe un numero para saber su doble, triple y su raiz cuadrada");
        Scanner cap = new Scanner(System.in);
        numero = cap .nextInt();
        numero_doble = numero*2;
        numero_triple = numero*3;
        numero_Raiz = Math.sqrt(numero);
        System.out.println("El doble de " + numero + " = " + numero_doble);
        System.out.println("El triple de " + numero + " = " + numero_triple);
        System.out.println("La raiz cuadrada de " + numero + " = " + numero_Raiz);                                        
        } 
}
