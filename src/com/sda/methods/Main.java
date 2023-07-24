package com.sda.methods;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;

        //double sum1 = a+b;
        double sum1 = sumaNumerelor(a,b);
        int c = 2;
        //double sum2 = sum1 + c;

        System.out.println(sumaNumerelor(c, sum1)); // am apelat metoda creata de noi in metoda main
        System.out.println(sumaNumerelor(c, sumaNumerelor(a,b))); // apelam metoda succesiv

        String java = "Java"; // variabila java
        afisareMesaj(java); // variabila pasata ca argument pentru metoda

        System.out.println(sumaNumerelor(a,1,c));
        System.out.println(sumaNumerelor(a,c));
        boolean isHot = eFoarteCaldAfara (35);
        if (isHot) {
            System.out.println("Afara este bine");
        }else {
            System.out.println("Afara este bine");
        }
        // apel de metoda in cadrul unei bucle
        int s =0;
        for (int i =0; i<5; i++) {
            s +=sumaNumerelor(i, i+1);
        }
        System.out.println(s);

        System.out.println(sumaVarargs(1,2));
        System.out.println(sumaVarargs( ));
        System.out.println(sumaVarargs(2.2,5,3.3,7));
        System.out.println(medie("Hello", 5,7,9));

        System.out.println(sumaInterval(1,5));
     }

     static double sumaNumerelor(int x, double y) {
         //double s = x + y;
         //return s;
        return x + y;}
     static void afisareMesaj(String s){ //parametru s

        System.out.println("Hello from method, " + s + "!");

    }
    static double sumaNumerelor(int x, int y, int z) {
        return x+y+z;
    }
    static int sumaNumerelor(int x, int y) {
        return x + y;
    }
    static boolean eFoarteCaldAfara(double temperature) {
        if(temperature >25) {
        return true;
    }
            return false;
    }
    static double sumaVarargs(double... numere) { // double[] numere;
        double rezultat = 0;

        for(double nr:
                numere){
            rezultat += nr; // rezultat = rezultat + nr;
        }
        return rezultat;
    }

    static double medie(String mesaj, double...numere) {
        System.out.println(mesaj);
        return sumaVarargs(numere) / numere.length;
    }
    static double sumaInterval(int nrMin, int nrMax){
        double rezultat = 0;
        for (int i=nrMin; i <=nrMax; i++){
            rezultat +=i;
        }
        return rezultat;
    }
}
