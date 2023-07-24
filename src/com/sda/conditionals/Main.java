package com.sda.conditionals;

public class Main {
    public static void main(String[] args) {
        // if

        // 1.
        double temperature = 20;
//        String weather = (temperature >= 22) ? "Afara este cald" : "Afara este frig";
//        System.out.println(weather);

        if (temperature >= 22) {
            System.out.println("Afara este cald");
        } else if (temperature >= 14) {
            System.out.println("Afara este potrivit");
        } else if (temperature >= 0) {
            System.out.println("Afara este frig");
        } else {
            System.out.println("Afara este foarte frig");
        }
        System.out.println("Iesim afara");


        /*
        if (conditie){
            // instructiuni daca este adevarat conditia
         }
         else {
            // instructiuni daca conditia este falsa
         */

        // switch
        /*
        switch (temperature) {
            case 22:
                System.out.println("Afara este cald");
            case 0:
                System.out.println("Afara este frig");
        }
        */

        int zi = 4;
        switch (zi+1) {
            case 1:
                System.out.println("luni");
                break;
            case 2:
                System.out.println("marti");
                break;
            case 3:
                System.out.println("miercuri");
                break;
            case 4:
                System.out.println("joi");
                break;
            case 5:
                System.out.println("vineri");
                break;
            case 6:
                System.out.println("sambata");
                break;
            case 7:
                System.out.println("duminica");
                break;
            default:
            case 8:
                System.out.println("zi invalida");


        }
        // daca pica fata a unui zar care este numar par, sa iti afiseze "You are the winner", altfel "valoare invalida"
        // daca un numar este par, sa iti afiseze "numar par", altfel "numar invalid"
        System.out.println("\n");
            int unu = 1;
            int doi = 2;
            int trei =3;
            int patru =4;
            int cinci =5;
            int sase =6;

            if(unu % 2 == 0) {
                System.out.println("You are the winner");
            }
            else {
                System.out.println("Fals");
            }
            if(doi % 2 == 0) {
            System.out.println("You are the winner");
            }
            else {
            System.out.println("Fals");
            }
            if(trei % 2 == 0) {
            System.out.println("You are the winner");
            }
            else {
            System.out.println("Fals");
            }
            if(patru % 2 == 0) {
                System.out.println("You are the winner");
            }
            else {
                System.out.println("Fals");
            }
            if(cinci % 2 == 0) {
            System.out.println("You are the winner");
            }
            else {
            System.out.println("Fals");
        }
            if(sase % 2 == 0) {
            System.out.println("You are the winner");
        }
            else {
            System.out.println("Fals");
    }
}
}