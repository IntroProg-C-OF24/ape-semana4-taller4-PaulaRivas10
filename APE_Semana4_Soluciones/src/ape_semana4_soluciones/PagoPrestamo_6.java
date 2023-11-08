/*
Algoritmo-6
Generar un solución que permita calcular y mostrar el pago mensual de un 
préstamo de 1 año de plazo. Se debe ingresar el monto del préstamo y el interés
mensual a cobrar.
 */
package ape_semana4_soluciones;

import java.util.Scanner;

public class PagoPrestamo_6 {

    public static void main(String[] args) {
        double montoDePrestamo, interesMensual, interesAnual, tasaInteres,
                plazoEnMeses, pagoMensual;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el monto del prestamo: ");
        montoDePrestamo = teclado.nextDouble();
        System.out.print("Ingrese el interes mensual a cobrar: ");
        interesMensual = teclado.nextDouble();
        interesAnual = (interesMensual * 12);
        tasaInteres = (interesAnual / 100);
        plazoEnMeses = 12;
        pagoMensual = (montoDePrestamo * tasaInteres)
                / (1 - Math.pow(1 + tasaInteres, -plazoEnMeses));
        System.out.println("El pago mensual del prestamo es: " + pagoMensual);
    }
}
