package com.sda.conversions;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // conversii implicite

        // byte la short
        byte nbyte1 = 10; //-128 - 127
        short nshort1 = nbyte1;
        System.out.println(nbyte1);
        System.out.println(nshort1);

        // short - int
        short nShort2 = 100;
        int nInt1 = nShort2;
        System.out.println(nShort2);
        System.out.println(nInt1);

        // int - long
        long nLong1 = nInt1;
        System.out.println(nLong1);

        // float - double
        float nFloat1 = 3.14F;
        double nDouble1 = nFloat1;
        System.out.println(nFloat1);
        System.out.println(nDouble1);
        // %f %d %s
        System.out.printf("%.2f" , nDouble1);
        System.out.println("\n");
        int a = 5;
        System.out.printf("%d", a);

        System.out.println("\n");
        // char - int
        char chA = 'A';
        chA = 'a';
        int codA = chA;
        System.out.println(chA);
        System.out.println(codA);

        // int - float
        int nInt2 = 123456789;
        float nFloat2 = nInt2;
        System.out.println(nInt2);
        System.out.println(nFloat2); //notatie stiintifica
        System.out.printf("%.2f", nFloat2);

        System.out.println("\n");
        // long - float
        long nLong2 = 123456789L;
        float nFloat3 = nInt2;
        System.out.println(nLong2);
        System.out.println(nFloat3); //notatie stiintifica
        System.out.printf("%.2f", nFloat3);

        System.out.println("\n");
        //rezolvarea: sa avem o variabila de tip double, nu una de tip float
        double nDouble2 = nLong2;
        System.out.println(nLong2);
        System.out.println(nDouble2); //notatie stiintifica
        System.out.printf("%.2f", nDouble2);

        System.out.println("\n");

        // long - double
        long nLong3 = 1234567890123456789L;
        double nDouble3 = nLong3;
        System.out.println(nLong3);
        System.out.println(nDouble3);
        System.out.printf("%.2f", nDouble3);

        System.out.println("\n\nConversii explicite (cast)");

        // int - byte
        int nInt3 = 200;
        byte nByte2 = (byte) nInt3;
        System.out.println(nByte2);

        // 200 - 128 = 72
        // 72 - 128 = - 56

        //long - int
        long nLong4 = 123456789L;
        int nInt4 = (int) nLong4;
        System.out.println(nInt4);

        // float - long
        float nFloat4 = 3.14f;
        long nLong5 = (long)nFloat4;
        System.out.println(nLong5);

        // double - float
        double nDouble4 = 3.1445678945D;
        float nFloat5 = (float)nDouble4;
        System.out.println(nFloat5);

        // char - byte
        char ch1  = 200;
        byte nByte3 = (byte)ch1;
        System.out.println(nByte3);




        }


    }

