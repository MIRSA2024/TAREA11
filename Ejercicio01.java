/*
 Crear un programa en Java que permita registrar ventas 
dentro de una matriz de 4x4. Visualizar el total de las ventas.
 */
package tarea11;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] ventas = new int[4][4];
        int totalVentas = 0;

        // Registro de ventas en la matriz
        System.out.println("Ingrese las ventas para cada posición de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ventas en [" + i + "][" + j + "]: ");
                ventas[i][j] = leer.nextInt();
                totalVentas += ventas[i][j];
            }
        }

        // la matriz de ventas
        System.out.println("\nMatriz de Ventas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }

        // Resultado
        System.out.println("\nEl total de las ventas es: " + totalVentas);
        
    }
}
    

