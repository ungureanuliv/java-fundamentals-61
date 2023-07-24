package com.sda.statics;

import  com.sda.oop.Dog;

public class Main {

    public static void main(String[] args) {
        Dog.isCute();
        Dog.isCute();
        System.out.println(Dog.isCute);


        double temp = 35;
        if(temp < TEMPERATURA_FIERBERE){
            System.out.println("Nu fierbe");
        }else {
            System.out.println("Fierbe");
        }

        // aria unui cerc
        // pi * r la 2
        double raza = 5.0;
        double aria = Math.PI * Math.pow(raza, 2);
        System.out.printf("Aria este %.2f", aria);


        System.out.println("\n");
        //clasa imbricate
        ClasaExterioara exterioara = new ClasaExterioara();
        ClasaExterioara.ClasaImbricata inner = exterioara.new ClasaImbricata();
        inner.afisare();

        // clase statice
        ClasaExterioara.ClasaStatica clasaStatica = new ClasaExterioara.ClasaStatica();
        clasaStatica.afisare();

        if (Dog.JUCAUS_TARE) {
            System.out.println(Dog.MAX_SATISF);
        }

        final double temperaturaInghet = 0;
        // temperaturaInghet = 1; // nu mai merge deoarece este final



    }
    static final int TEMPERATURA_FIERBERE = 100; // constanta si nu mai poate fi modificata

}
