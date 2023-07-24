package com.sda.operators;

public class Main {
    public static void main(String[] args) {
        // 1. operatorilor unari - operatorul + numele variabilei/valoare
        System.out.println(+7);
        System.out.println(7);
        System.out.println(-7);

        int negativeNumber = -2;
        System.out.println(negativeNumber);
        int positiveNumber = -2;
        System.out.println(-positiveNumber);

        boolean javaIsFun = false; // !fasle = true ; !true = false
        System.out.println(!javaIsFun);

        int number = 6;
        // pre-incrementare
        System.out.println("Pre-incrementare " + ++number); // 7
        // pre-decrementare
        System.out.println("Pre-decrementare " + --number); // 6

        // post-incrementare
        System.out.println("Post-incrementare " + number++); // 6
        System.out.println("Dupa post-decrementare " + number); // 7

        // post-decrementare  - numarul nostru este 7
        System.out.println("Post-incrementare " + number--); // 7
        System.out.println("Dupa post-decrementare " + number); // 6

        // 2. operatorii binari (2 operanzi)
        // aritmetici
        System.out.println(1+2);
        System.out.println(1+2-3);
        System.out.println(1+2*2/4+10);
        System.out.println(12%5); // % - restul impartirii
        // numar par : numar%2 = 0

        System.out.println((1+2*2/4+10)%2); //0
        System.out.println(1+2*2/4+10%2); // 2 +10%2

        // operatori de atribuire
        int num = 10;
        // num = num++;
        // num = num +1;
        // num += 1; folosind operatorul de atribuie +=
        // num++
        num += 1;
        System.out.println(num);
        num -= 1;
        System.out.println(num);
        num *=2;
        System.out.println(num);
        num /=5;
        System.out.println(num);
        num %=2;
        System.out.println(num);

        // operatori de comparatie
        double temperature = 25.7;
        int stdTemperature = 22;
        boolean isHotOutside = temperature > stdTemperature;
        System.out.println(isHotOutside);

        char chA = 'A';
        boolean isLowerThan60 = chA < 60;
        System.out.println(isLowerThan60);

        int number100 = 100;
        boolean isEqualTo100 = number100 == 100;
        System.out.println(isEqualTo100);

        temperature = 0;
        boolean isNotEqualTo0 = temperature != 0;
        System.out.println(isNotEqualTo0);

        // operatori logici
        //&& - si; II - sau; ! - negatie
        int number1 = 100;
        boolean between100And500 = number1 >= 100 && number1 < 500;
        System.out.println(between100And500);

        // operatori pe biti
        // & | ^
        System.out.println(10 & 12);
        // binar - in baza 2 - secvente de 0 si 1
        // 10/2 = 5 rest 0
        //=> 10 = 1010
        // 2'3   2'2    2'1    2'0
        //  8     4      2      1
        //  1     0      1      0 -> 10
        //

        //1010
        //1100
        //------ (&)
        // 1000 = 8 in baza 10
        System.out.println(10 | 12);
        // 1010
        //1100
        //------(|)

        System.out.println(~10); //-11
        //~n = - (n+1)

        int number2 = 2;
        // 2 = 0010

        System.out.println(number2 <<2);
        // 0010 - 001000 = 1000 = 8

        System.out.println(number2 >>2);
        //0010 - 000010 = 0000

        // operatorul ternar
        // intrerupatorul de la bec
        boolean intrerupator = true;
        // int number4 = 1;
        char esteAprins = intrerupator ? 'T' : 'F'; // conditie ? valAdevarat : valFalsa
        System.out.println(esteAprins);

        double temperature2 = 21.5;
        String weather = (temperature >= 22) ? "Afara este cald" : "Afara este frig";
        System.out.println(weather);

    }
}
