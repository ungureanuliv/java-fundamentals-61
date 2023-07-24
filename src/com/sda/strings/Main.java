package com.sda.strings;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello World ";
        String str2 = new String();


        // Utilizarea unui array de caractere:
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);

        //Utilizarea unui array de octeti si un set de caractere
        byte[] bytes = {72, 101, 108, 108, 111};
        String str4 = new String(bytes);


        //Utilizarea unui array de caractere si specificarea unui interval din acesta
        char[] chars1 = {'H', 'e', 'l', 'l', 'o'};
        String str5 = new String(chars, 0, 5); // Creează sirul “Hello"


        // Utilizarea metodei `format()`:
        int num = 42;
        double num2 = 3.14;
        String str6 = String.format("Numerele sunt: %d, %.2f", num, num2);


        //Utilizarea concatenării irurilor: ș
        String str7 = "Hello" + " " + "World";


        // IMUTABILITATE - sirurile de caractere nu se modifica
        String abc1 = "abc";
        String abc2 = "abc";
        String abc3 = new String("abc");
        String abc4 = abc1;

        String ab = "ab";
        String c = "c";
        abc4 = ab + c;

        if (abc1 == abc4) {
            System.out.println("Referinte egale");
        }
        else {
            System.out.println("Referinte diferite");
        }

        if (abc1.equals(abc4)){
            System.out.println("Siruri egale");
        }else {
            System.out.println("Siruri diferite");
        }
        System.out.println(System.identityHashCode(abc1));
        System.out.println(System.identityHashCode(abc4));

        // COMPARARE - compareTi
        String nume1 = "Alexandra";
        String nume2 = "Gigel";
        System.out.println(nume1.compareTo(nume2));

        char a = 'A', g = 'G';
        System.out.println((byte)a + " " + (byte)g);


        //metode ale clasei String
        String exemplu = "Exemplu";
        int lungime = exemplu.length(); // 7
        int index = exemplu.indexOf("e");// 2
        char caracter = exemplu.charAt(index); // e
        String subsir = exemplu.substring(index); // emplu
        String subsir2 = exemplu.substring(1, 3); // xe
        String mare = exemplu.toUpperCase();
        String mic = exemplu.toLowerCase();
        String concatenat = exemplu.concat(" siruri de caractere"); //exemplu siruri de caractere

        // replace, starts, ends, split
        String replaced = exemplu.replace('e', 'a') ;
        boolean incepeCuEx = exemplu.startsWith("ex"); // true
        boolean terminaCuLu = exemplu.startsWith("lu"); // false
        String[] cuvinte = concatenat.split(" ");

        for(int i= 0; i < cuvinte.length; i++) {
            System.out.println(cuvinte[i]);
        }
        Integer numarIntreg = Integer.valueOf(4258);
        int valoareInreaga = numarIntreg.intValue();
        if (numarIntreg.equals(valoareInreaga)) {
            System.out.println("Numerele sunt egale.");
        }
    }
}
