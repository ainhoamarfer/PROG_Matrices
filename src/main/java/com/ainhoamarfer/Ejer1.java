package com.ainhoamarfer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejer1 {

    public static final int W = 100;
    public static final int H = 100;

    public static final int MAX_RND_RANGE = 50;
    public static final int MIN_RND_RANGE = -50;

    private Random rnd = new Random();
    private int[][] matriz;

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        var ejer1 = new Ejer1();

        // Crear una matriz

        // Rellenar la matriz con numeros aleatorios

        ejer1.rellenarMatriz(MIN_RND_RANGE, MAX_RND_RANGE);

        // Crear lista positivos

        List<Integer> positivos = ejer1.getPositivos();

        // Crear lista negativos
        List<Integer> negativos = ejer1.getNegativos();
        long endTime = System.nanoTime();

        // Mostrar lista positivos
         System.out.print("Positivos: ");
         positivos.stream().forEach((n) -> {
         System.out.print(n + " ");
         });

        System.out.println();
        // Mostrar lista negativos
         System.out.print("Negativos: ");

         negativos.stream().forEach((n) -> {
         System.out.print(n + " ");
         });

        System.out.println("Positivos: " + positivos.size() +
                " negativos: " + negativos.size());
        System.out.println(((endTime - startTime) / 1000 / 1000) + " ms");
    }

    private List<Integer> getPositivos() {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= 0) {
                    numeros.add(matriz[i][j]);
                }
            }
        }

        return numeros;
    }

    private List<Integer> getNegativos() {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    numeros.add(matriz[i][j]);
                }
            }
        }

        return numeros;
    }

    public Ejer1() {
        matriz = new int[W][H];
    }

    private void rellenarMatriz(int minRndRange, int maxRndRange) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(minRndRange, maxRndRange);
            }
        }
    }
}
