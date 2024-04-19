/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_gabrielmejia;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Fila 1 Silla 5
public class Lab1P2_GabrielMejia {

    static Random random = new Random();
    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamagno = 0;

        System.out.println("Ingrese el tamaño de la matriz: ");
        tamagno = input.nextInt();

        if (tamagno > 4 && tamagno % 2 != 0) {
            int[][] matriz = new int[tamagno][tamagno];
            int[][] matrizOrdenada = new int[tamagno][tamagno];
            matriz = llenarMatriz(matriz);
            System.out.println("Matriz generada");
            imprimirMatriz(matriz);
            System.out.println("Matriz ordenada:");
            imprimirMatriz(matrizOrdenada);
            System.out.println("Arreglo medianas:");
            ArrayList<Integer> arregloMediana = new ArrayList<>();
            arregloMediana = arregloMedianas(matriz);
            System.out.println(arregloMediana);

            int medianaMedianas = medianadeLasMediana(arregloMediana);
            System.out.println("Mediana de las medianas: " + medianaMedianas);

            ArrayList<Integer> arrayOrdenada = new ArrayList<>();
            ordenarMedianas(arrayOrdenada, arrayOrdenada.size());
            System.out.println("Mediana ordenada: ");
            System.out.println(arrayOrdenada);

        } else {
            System.out.println("Ingrese solo numeros mayores  a 4 e impares");

        }

    }

    public static int[][] llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(0, 9);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static int[] BubbleSortRecursiva(int[][] matriz, int i) {
        int aux;
        int menor;
        int fila[] = new int[matriz.length];
        int[] filaOrdenada = new int[fila.length];
        for (int k = 0; k < fila.length; k++) {
            for (int j = 0; j < fila.length; j++) {
                if (fila[j] > fila[j + 1]) {
                    menor = fila[j];
                    aux = fila[j + 1];
                    filaOrdenada[j] = menor;

                }
            }
        }
        return filaOrdenada;
    }
   

    public static ArrayList<Integer> arregloMedianas(int[][] matriz) {

        ArrayList<Integer> arregloMediana = new ArrayList<>();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == matriz[0].length / 2) {
                    arregloMediana.add(matriz[i][j]);
                }
            }
        }

        return arregloMediana;
    }

    public static int medianadeLasMediana(ArrayList fila) {
        int mediana = 0;
        for (int i = 0; i < fila.size(); i++) {
            if (i == fila.size() / 2) {
                mediana = (int) fila.get(i);

            }
        }
        return mediana;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
    }

public static void ordenarMedianas(ArrayList<Integer> fila, int n) {
 
}

}
