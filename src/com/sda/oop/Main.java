package com.sda.oop;

public class Main {
    public static void main(String[] args) {
        Dog max = new Dog();
        System.out.println(max);

        // cum accesam o metoda
        max.setNume("Max");
        System.out.println(max.getNume());
        max.latra();

        Dog rex = new Dog("Rex","ciobanesc german", "maro",30.4, 3);
        System.out.println(rex);

        Dog patrocle = new Dog("Patrocle",10);
        patrocle.setVarsta(50);
        System.out.println(patrocle);

    }
}
