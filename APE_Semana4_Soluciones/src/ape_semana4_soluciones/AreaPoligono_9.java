/*
Algoritmo 9
El programa debe calcular el área del polígono. La figura se compone de un 
cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), cuya 
base mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo 
ancho mide lo mismo que uno de los lados del cuadrado, mientras que la altura 
mide lo mismo que la altura de los triángulos. Se pide que haga un programa 
que calcule el área total.
Por cultura general, sabemos que el área de un rectángulo se calcula 
multiplicando su base por su altura; el área de un triángulo rectángulo se 
calcula multiplicando su base por su altura, y luego dividiendo el resultado 
entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado 
la medida de uno de sus lados.
 */
package ape_semana4_soluciones;

import java.util.Scanner;

public class AreaPoligono_9 {

    public static void main(String[] args) {
        double ladoCuadrado, areaCuadrado, alturaTriangulo, areaTriangulo, 
                areaTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la medida de un lado del cuadrado: ");
        ladoCuadrado = teclado.nextDouble();
        System.out.println("Ingrese la medida de la altura del rectangulo: ");
        alturaTriangulo = teclado.nextDouble();
        areaCuadrado = Math.pow(ladoCuadrado, 2);
        areaTriangulo = (((ladoCuadrado * alturaTriangulo) / 2) * 5);
        areaTotal = (areaCuadrado + areaTriangulo);
        System.out.println("El area total del poligono es: " + areaTotal);
    }
}
