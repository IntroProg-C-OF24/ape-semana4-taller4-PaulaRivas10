package ape_semana4_soluciones;
import java.util.Scanner;
public class PlanillaTelefono_4 {
    public static void main(String[] args) {
        double costoPlanillaenMinutos, costoPlanillaenMes, total ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el costo de la Planilla en minutos: ");
        costoPlanillaenMinutos = teclado.nextDouble();
        System.out.println("Ingresa el costo de la Planilla minutos consumidos en el mes: ");
        costoPlanillaenMes =  teclado.nextDouble();
        total = costoPlanillaenMinutos * costoPlanillaenMes;
        System.out.println("Valor de planilla del Teléfono de la casa es: " + total);
    }
}
