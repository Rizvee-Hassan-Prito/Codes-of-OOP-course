
package lab5problem3;

import java.util.Scanner;

public class Lab5Problem3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt(), d = input.nextInt();
        Fraction fraction1 = new Fraction(a, b);
        Fraction fraction2 = new Fraction(c, d);
        System.out.println(fraction1.toString() + "\n" + fraction2.toString());

        fraction1.add(fraction2);
        System.out.println(fraction2);

        fraction2.setNumerator(c);
        fraction2.setDenomirator(d);
        fraction1.sub(fraction2);
        System.out.println(fraction2);

        fraction2.setNumerator(c);
        fraction2.setDenomirator(d);
        fraction1.multiplication(fraction2);
        System.out.println(fraction2);

        fraction2.setNumerator(c);
        fraction2.setDenomirator(d);
        fraction1.divition(fraction2);
        System.out.println(fraction2);

    }

}

class Fraction {

    private int numerator;
    private int denomirator;

    Fraction(int numerator, int denomirator) {
        this.numerator = numerator;
        this.denomirator = denomirator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenomirator() {
        return this.denomirator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenomirator(int denomirator) {
        this.denomirator = denomirator;
    }

    public String toString() {
        return this.numerator + "/" + this.denomirator;
    }

    void add(Fraction fraction) {
        fraction.numerator = this.numerator * fraction.denomirator + fraction.numerator * this.denomirator;
        fraction.denomirator = fraction.denomirator * this.denomirator;
    }

    void sub(Fraction fraction) {
        fraction.numerator = this.numerator * fraction.denomirator - fraction.numerator * this.denomirator;
        fraction.denomirator = fraction.denomirator * this.denomirator;
    }

    void multiplication(Fraction fraction) {
        fraction.numerator = fraction.numerator * this.numerator;
        fraction.denomirator = fraction.denomirator * this.denomirator;
    }

    void divition(Fraction fraction) {

        int a = fraction.numerator;

        fraction.numerator = fraction.denomirator * this.numerator;
        fraction.denomirator = a * this.denomirator;
    }

}
