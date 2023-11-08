/*
Algoritmo-8
Se debe generar un algoritmo que permite calcular y mostrar el valor total a
pagar mensual de servicios digitales de una persona. Los servicios digitales 
son: netflix, youtube premium, dropbox, spotify. Si la persona es menor a 30 
años se descuenta el 20% del total mensual.
 */
package ape_semana4_soluciones;

import java.util.Scanner;

public class ServiciosDigitales_8 {

    public static void main(String[] args) {
        double mensualidadNetflix, mensualidadYoutubePremium, mensualidadDropbox,
                mensualidadSpotify, costoTotalMensual;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el costo de la mensualidad de Netflix: ");
        mensualidadNetflix = teclado.nextDouble();
        System.out.println("Ingresar el costo de la mensualidad de Youtube "
                + "Premium: ");
        mensualidadYoutubePremium = teclado.nextDouble();
        System.out.println("Ingresar el costo de la mensualidad de DropBox: ");
        mensualidadDropbox = teclado.nextDouble();
        System.out.println("Ingresar el costo de la mensualidad de Spotify: ");
        mensualidadSpotify = teclado.nextDouble();
        costoTotalMensual = mensualidadNetflix + mensualidadYoutubePremium
                + mensualidadDropbox + mensualidadSpotify;
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad < 30) {
            costoTotalMensual *= 0.8;
            System.out.println("Se aplico un descuento del 20% por ser menor "
                    + "de 30 anios.");
        }
        System.out.println("El valor total a pagar mensual por servicios "
                + "digitales es: " + costoTotalMensual);
    }
}
