/*
Crear un programa en Java que permita registrar compras 
dentro de una matriz de 4x4. Visualizar el total y el promedio de las compras.
 */
package tarea11;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] compras = new int[4][4];
        int totalCompras = 0;
        int cantidadCompras = 4 * 4; 

        // Registro de compras en la matriz
        System.out.println("Ingrese el monto de las compras para cada posición de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Compra en [" + i + "][" + j + "]: ");
                compras[i][j] = scanner.nextInt();
                totalCompras += compras[i][j];
            }
        }

        // matriz de compras
        System.out.println("\nMatriz de Compras:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(compras[i][j] + "\t");
            }
            System.out.println();
        }

        // promedio de compras
        double promedioCompras = (double) totalCompras / cantidadCompras;

        // el total y el promedio de compras
        System.out.println("\nEl total de las compras es: " + totalCompras);
        System.out.printf("El promedio de las compras es: %.2f\n", promedioCompras);
        
    }
}


