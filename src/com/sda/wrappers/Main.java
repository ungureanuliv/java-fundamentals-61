package com.sda.wrappers;

public class Main {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println(maxInt + " " + minInt);

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println(maxLong + " " + minLong);

        Float numarFloat1 = 3.14f;
        Float numarFloat2 = 4.14f;
        Float numarFloat3 = new Float(3.14f);

        if (numarFloat1.equals(numarFloat2)) {
            System.out.println("Obiectele au aceeasi valoare");
        } else {
            System.out.println("Obiectele nu au aceeasi valoare");
        }
        if (numarFloat1 == numarFloat3) {
            System.out.println("Obiectele au aceeasi referinta");
        } else {
            System.out.println("Obiectele nu au aceeasi referinta");
        }

        System.out.println(numarFloat2.compareTo(numarFloat1)); // 1 - primul mai mare ; -1 - primul mai mic; 0 - egale

        // autoboxing - conversie de la primitive la obiect
        // clasele - prima liter mare ; din clasa
        Double numarDouble1 = 30.58d;
        char z = 'z';
        Character character1 = z;
        Character character2 = character1;
        System.out.println(character1 + " " + character2 + " " + z);

        Integer numarInteger = 5;

        //unboxing - conversie de la obiect la primitiva
        int numarInt = numarInteger;
        System.out.println(numarInt);
        double numarDouble = numarInteger;
        System.out.println( numarDouble1);
        int numarInt2 = numarDouble1.intValue();
        System.out.println(numarInt2);

        // conversia de la primitiv la obiect
        int numarInt1 = 999900000;
        Long numarLong1 =(long) numarInt1;
        Long numarLong2 = Long.valueOf(numarInt1);// int ->long -> long - nu se pierde precizie
        System.out.println(numarLong1);

        Float numarFloat4 =(float)numarInt1;
        Float numarFloat5 = Float.valueOf(numarInt1);
        System.out.printf("Numarul este %.2f \n" ,numarFloat5);

        // conversie de la sir de caractere  (String) la clasa Double
        Double numarDouble2 = Double.valueOf("3.14");
        System.out.println(numarDouble2);

        String numarString = "123";
        Short numarShort = Short.valueOf(numarString);
        System.out.println(numarShort);

        //conversie de la wrapper la sir de caractere
        String numarDoubleString = numarDouble2.toString();
        System.out.println(numarDoubleString);

        // printf
        System.out.printf("Numerele sunt %.2f, %.2f, %d, %s\n", numarFloat5, numarDouble2, numarInt,numarDoubleString);
        Integer [] numere = {10, 20, 30};
        for (Integer numar:
                numere){
            System.out.println(numar);
        }
        String[] numereS = new String[numere.length];
        for (int i=0; i < numere.length; i++) {
            numereS[i] = numere[i].toString();
        }
        for (String numar:
            numereS) {
            System.out.println(numar + " ");
        }
        System.out.println();
    }
}
