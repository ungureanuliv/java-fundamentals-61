package com.sda.statics;

public class ClasaExterioara {
    private int numarNonStatic;
    private static int numarStatic = 10;

    public static class ClasaStatica {
        public void afisare(){
            System.out.println("numarStatic: " + numarStatic);
        }
    }

    public class ClasaImbricata {
        public void afisare(){
            System.out.println("Numere: " + numarStatic + " " + numarNonStatic);
    }
}}

