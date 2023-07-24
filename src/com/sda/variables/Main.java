package com.sda.variables;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!"); //comentariu pe o linie

        /*
        comentariu
        pe mai multe linii
         */

        System.out.print("Numele meu este ");
        System.out.print("Ungureanu Ioan-Liviu");
        //concatenarea sirurilor de caractere la afisare

        System.out.println("\nNumele meu este " + "Ungureanu Ioan-Liviu"); // \n inseamna new line

        // varaibile cu tipuri de data primitive
        // byte,short, int, long, float, double, char, boolean
        // -128 - 127 ; memorie = 8 biti = 1 byte

        byte byte1; // doar initializare
        byte1 = 1; // doar atribuire folosind operatorul =

        // memorie = 16 biti = 2 bytes
        short shorVar = -510; // initializare si atribuire pe aceeasi linie

        //memorie = 32 biti = 4 bytes
        int temperaturaDeAfara;
        temperaturaDeAfara = 26;

        // memorie = 64 biti = 8 bytes
        long longNo = 1234567890L;

        //float = 32 biti = bytes
        float inaltime1 = 1.8f;

        // memorie = 64 biti = 8 bytes
        double inaltime2 = 1.6;

        System.out.println(temperaturaDeAfara + "\u0366C");

        // memorie = 16 biti = 2 bytes
        char a = 'A', b = 'C';
        System.out.println(b);
        b = a;
        System.out.println(b);

        char copyright = '\u00A9'; // \ u- caracter unicod
        copyright = '\u00AE';
        System.out.println(copyright);

        // 1 bit = 0 sau 1 - 0 = false; 1 = true
        boolean isRed = true;
        System.out.println("Butonul este rosu? " + isRed);

        // tipuri de date referentiale - String

        String nume = "Ioan-Liviu";
        System.out.println("Numele meu este " + nume);
        nume = "Diana" +
                " Melania";
        System.out.println("Numele meu este " + nume);

        long numarL = 1_309_992_112L;
        System.out.println(numarL);

        char newLine = '\n';
        System.out.println("Java este" + newLine + "fun");

        System.out.println(nume.length());


    }
}