/*Crear un programa en Java que permita generar ventas aleatorias (1000-10000) y asignar los 
a una matriz de datos de 3 x 3. Visualizar el total y el promedio de las ventas.
 */
package tarea11;

import java.util.Random;

public class Ejercicio04 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[3][3];
        int totalVentas = 0;
        int cantidadVentas = 3 * 3; // Número total de elementos en la matriz 3x3

        // Generación aleatoria de ventas en la matriz
        System.out.println("Matriz de Ventas Aleatorias:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = 1000 + random.nextInt(9001); // números entre 1000 y 10000
                System.out.print(ventas[i][j] + "\t");
                totalVentas += ventas[i][j];
            }
            System.out.println();
        }

        // promedio de ventas
        double promedioVentas = (double) totalVentas / cantidadVentas;

        // Mostrar el total y el promedio de ventas
        System.out.println("\nEl total de las ventas es: " + totalVentas);
        System.out.printf("El promedio de las ventas es: %.2f\n", promedioVentas);
    }
}

