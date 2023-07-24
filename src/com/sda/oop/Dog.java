package com.sda.oop;

public class Dog {
    // variabilele de instanta - starea
    private String nume = "Cutzu";
    private String rasa;
    private String culoare;
    private double marime;
    private int varsta;

    public static boolean isCute = true; // constanta\

    public final static boolean JUCAUS_TARE = true;  // constante
    public static final int MAX_SATISF = 10;  // constanta

    public Dog() {
        this.nume = "Cutzu";
        this.rasa = "Maidanez";
        this.culoare = "Standard";
        this.marime = 7;
        this.varsta = 1;
    }

    public Dog(String nume, int varsta) {
        this(nume, "Maidanez", "Standard",7,varsta);
    }

    public Dog(String nume, String rasa, String culoare, double marime, int varsta) {
        this.nume = nume;
        this.rasa = rasa;
        this.culoare = culoare;
        this.marime = marime;
        this.varsta = varsta;
    }

    public void latra() {
        System.out.println(nume + ": Ham, ham!");
    }

    public void alearga() {
        System.out.println(nume + " alearga repede");
    }

    public void doarme() {
        System.out.println(nume + " doarme bustean zzzzz");
    }

    public String getNume() { // getter
        return nume;
    }

    public void setNume(String nume) { // setter
        this.nume = nume;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getMarime() {
        return marime;
    }

    public void setMarime(double marime) {
        this.marime = marime;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        if (varsta < 0 || varsta > 25) {
            System.out.println("Varsta invalida");
        } else {
            this.varsta = varsta;
        }
    }


    public static void isCute() {
        if (isCute) {
            System.out.println("Este foarte dragut");
            isCute = false;
        } else {
            System.out.println("Este nu chiar atat de dragut");
        }
        isCute = true;

    }



    @Override
    public String toString() {
        return "Dog{" +
                "nume='" + nume + '\'' +
                ", rasa='" + rasa + '\'' +
                ", culoare='" + culoare + '\'' +
                ", marime=" + marime +
                ", varsta=" + varsta +
                '}';
    }
}
