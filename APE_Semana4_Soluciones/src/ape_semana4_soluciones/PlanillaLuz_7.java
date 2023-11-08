/*
Algoritmo-7
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una
planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el 
número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 
65 años, se debe descontar el 10%.
 */
package ape_semana4_soluciones;

import java.util.Scanner;

public class PlanillaLuz_7 {

    public static void main(String[] args) {
        double costokWh, consumokWh, valorPlanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo del kilovatio/hora: ");
        costokWh = teclado.nextDouble();
        System.out.println("Ingrese el consumo del kilovatio/hora: ");
        consumokWh = teclado.nextDouble();
        valorPlanilla = (costokWh * consumokWh);
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad > 65) {
            valorPlanilla *= 0.9;
            System.out.println("Se aplico un descuento del 10% por ser mayor de 65 anios.");
        }
        System.out.println("El valor a cancelar de la planilla de luz es: " + valorPlanilla);
    }
}
