package com.sda.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int
        int numar = 10;
        int j;

        System.out.println("FOR ");
        //for
        for (j = 1; j <= numar; j++) {
            // System.out.println(j);
            System.out.print(j + " ");
        }

        System.out.println("\nwhile");

        // while
        //int i = 1;
        j = 1;
        while (j <= numar) {
            System.out.print(j + " ");
            j++;
        }
        /*
        // j este 11
        // do-while
        do {
            System.out.println(j + " ");
            j++;
        } while ( j <= numar); // 12 <= 10 Fals

         */

        System.out.println("\nDo-while");
        j = 1;
        do {
            System.out.print(j + " ");
            j++; // 12
        } while (j <= numar);


        // decrementare

        System.out.println("\nFOR ");
        // for
        for (int i = numar; i > 0; i--) {
            System.out.print(i + " ");
        }

        // while
        System.out.println("\nWhile ");
        int i = numar;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }

        System.out.println("\nDO-WHILE ");
        i = numar;
        // do while
        do {
            System.out.print(i + " ");
            i--;
        } while (i >0) ;

        // afisati toate numerele divizibile cu 3 dintr-un interval

        int minNumber =1;
        int maxNumber =100;

        System.out.println("\nFor divizibile cu 3 ");
        for ( i = minNumber; i <= maxNumber; i++) {
            if (i % 3 == 0) { // numarul este divizibil cu 3
                System.out.print(i + " ");
            }
        }
        System.out.println("\nWhile divizibile cu 3 ");
        i = minNumber;
        while (i <= maxNumber){
            if (i % 3 == 0){ // numaru leste divizibil cu 3
                System.out.print(i + " ");
            }
            i++;
        }

        // do-while

        System.out.println("\nDO-WHILE divizibile cu 3 ");
        i = minNumber;
        do {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            i ++;
        } while (i <= maxNumber);

        // break
        // sa extragem primul numar divizibil cu 5 dintr-un interval
        System.out.println("\nBREAK");
        int nr = 0;
        for (int k =minNumber; k <=maxNumber; k++){
            if (k % 5 == 0){
                //System.out.println( k + " ");
                nr = k;
                break;
            }
        }

        System.out.println(nr);

        // continue
        // sa afisam toate numerele cu exceptia celor divizibile cu 5 dintr-un interval
        System.out.println("\nCONTINUE");
        for (int l = minNumber; l <= maxNumber; l++) {
            if (l % 5 == 0){
                nr = l;
                continue;
        }
            System.out.print(l + " ");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIntroduceti valoarea: ");
        int numarCitit = scanner.nextInt();

        System.out.println("Introduceti valoarea: ");
        double numarCitit2 = scanner.nextDouble();

        System.out.println("Introduceti valoarea: ");
        String textCitit = scanner.next();

        scanner.close();

        System.out.println("Ce am citit: " + numarCitit + " " + numarCitit2 + " " + textCitit);


    }
}

