/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_gabrielmejia;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author gabri
 */
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
            matriz = llenarMatriz(matriz);
            imprimirMatriz(matriz);
            
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
    public static ArrayList BubbleSortRecursiva(ArrayList fila,int i){
        int aux;
        int menor;
        for(int j =0;i<fila.size();i++){
            
        }
    }
    
}
