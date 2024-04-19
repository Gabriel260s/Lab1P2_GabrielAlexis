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
        do {
            
            System.out.println("Ingrese el tamaño de la matriz: ");
            tamagno = input.nextInt();
            int[][] matriz = new int[tamagno][tamagno];
            int[][] matrizOrdenada = new int[tamagno][tamagno];
            matriz = llenarMatriz(matriz);
            System.out.println("Matriz generada");
            imprimirMatriz(matriz);
            System.out.println("Matriz ordenada:");
            imprimirMatriz(matrizOrdenada);
            System.out.println("Arreglo medianas:");
            ArrayList<Integer> arregloMediana = new ArrayList<>();
            arregloMediana= arregloMedianas(matriz);
            System.out.println(arregloMediana);
            

        } while (tamagno > 4 && tamagno % 2 != 0);
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

    public static int[] BubbleSortRecursiva(int[] fila, int i) {
        int aux;
        int menor;
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
    //[][][][][][][] 

    public static ArrayList arregloMedianas(int[][] matriz) {
        ArrayList<Integer> arregloMediana = new ArrayList<>();
        arregloMediana.add(7);
        
        

        for (int i = 0; i < arregloMediana.size(); i++) {
            for (int j = 0; j < arregloMediana.size(); j++) {
                if(j==matriz.length)
               
            }
        }
        return arregloMediana;
    }

    public static int medianadeLasMediana(int[] fila) {
        int mediana = 0;
        for (int i = 0; i < fila.length; i++) {
            if (i == fila.length / 2) {
                mediana = i;

            }
        }
        return mediana;
    }

}
