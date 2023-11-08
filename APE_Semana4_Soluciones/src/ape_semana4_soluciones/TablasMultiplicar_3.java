/*Algoritmo-3
Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar 
de un número ingresado por el usuario; solo en el caso que el valor del número 
esté entre 2 y 6.
 */
package ape_semana4_soluciones;
import java.util.Scanner;
public class TablasMultiplicar_3 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero (debe estar entre 2 y 6): ");
        int numero = teclado.nextInt();
        if (numero >= 2 && numero <= 6) {
            System.out.println("Tabla de multiplicar del  " + numero + ":");
            for (int i = 1; i <= 12; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("El numero no esta dentro del rango valido (2-6).");
        }

        teclado.close();
}
      