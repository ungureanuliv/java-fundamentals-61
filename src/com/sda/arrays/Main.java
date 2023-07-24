package com.sda.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // tablouri unidimensionale

        int [] numere1;
        numere1 = new int[4];

        int[] numere = new int[4]; //0 0 0 0 - intializare implicita

        int[] numere2 = {10,20,30,40,50};

        int[] numere3 = new int[]{1,2,3};

        System.out.println("Elementul de pe pozitia 1 din array-ul numere2: " + numere2[1]);
        numere[0] =100;
        numere3[2] = 4;

        //numere[3] = 0; // exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        // 1 2 3 - elemente
        // 0 1 2 - pozitii

        //for
        System.out.println("Elementele array-ului: ");
        for (int i = 0; i < numere1.length; i++){
            System.out.print(numere[i] + " ");

        }

        // foreach
        System.out.println("\nParcurgere cu foreach: ");
        for (int element : numere2) {
            System.out.print(element + " ");
        }

        System.out.println();
        int i = 0;
        while (i < numere3.length) {
            System.out.print(numere3[i] + " ");
            i++;
        }

        String[] numePersoane = new String[3];
        numePersoane[0] = "Ion";
        numePersoane[1] = "Gigel";
        numePersoane[2] = "Ana";

        System.out.println("\nString array: ");
        for (String nume: numePersoane) {
            System.out.println(nume + " ");
        }
/*
        int lungime;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdeceti lungimea array-ului: ");

        lungime = scanner.nextInt();


        int[] num = new int[lungime];

        for (int k = 0; k < num.length; k++){
            System.out.println("Introduceti elementul de pe pozitia: " + k);
            num[k] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("\nArray-ul citit: ");
        for (int element: num) {
            System.out.print(element + " ");
        }
      */
        // tablouri bidimensionale

        double[][] matrice = {{10.2 , 5.5} , {2.2, 15.7, 9.9}};
        // System.out.println(matrice[1][2]);

        //parcurgerea elementelor
        for (int a = 0; a < matrice.length; a++) { // parcurge liniile/randurile
            for (int b = 0; b < matrice[a].length; b++) {// parcurge coloanele
                System.out.print(matrice[a][b] + " ");
            }
            System.out.println();
        }


    }
}
