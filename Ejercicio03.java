/*
Crear un programa en Java que permita registrar ventas de forma aleatoria (10 - 5000) 
dentro de una matriz de 4x4. Visualizar la venta mayor y menor.
 */
package tarea11;

import java.util.Random;

public class Ejercicio03 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[4][4];
        int ventaMayor = Integer.MIN_VALUE;
        int ventaMenor = Integer.MAX_VALUE;

        //  ventas en la matriz
        System.out.println("Matriz de Ventas Aleatorias:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = 10 + random.nextInt(4991); // Genera números entre 10 y 5000
                System.out.print(ventas[i][j] + "\t");

                //  venta mayor o menor
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
            System.out.println();
        }

        // a venta mayor y menor
        System.out.println("\nLa venta mayor es: " + ventaMayor);
        System.out.println("La venta menor es: " + ventaMenor);
    }
}


