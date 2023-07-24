package com.sda.enums;

public class Main {
    public static void main(String[] args) {
        ZiSaptamana zi = ZiSaptamana.JOI;

        String ziString = zi.toString();
        System.out.println(ziString);

        // switch
        switch (zi) {
            case LUNI:
                System.out.println("Astazi este luni.");
                break;
            case MARTI:
                System.out.println("Astazi este marti.");
                break;
            case MIERCURI:
                System.out.println("Astazi este miercuri.");
                break;
            case JOI:
                System.out.println("Astazi este joi.");
                break;
            case VINERI:
                System.out.println("Astazi este vineri.");
                break;
            case SAMBATA:
                System.out.println("Astazi este sambata.");
                break;
            case DUMINICA:
                System.out.println("Astazi este dumnica.");
                break;
        }
    }
}
