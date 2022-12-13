package Fraction_Class;

import java.util.Scanner;

public class FractionRunner {
    public static void main(String[] args){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction f3 = new Fraction();
        Scanner s = new Scanner(System.in);
        String userInput = "";
        int n1 = 34, d1 = 68, n2 = 1, d2 = 5;
        while (!(userInput.equals("stop"))){
            System.out.println("Here are some examples of what you can do:");
            f1.setNumerator(n1);
            f1.setDenominator(d1);
            f1.setSimplify(true);
            System.out.println(f1.toString() + " is your fraction #1. As a decimal it is " + f1.toDecimal());
            f2.setNumerator(n2);
            f2.setDenominator(d2);
            System.out.println(f2.toString() + " is your fraction #2. As a decimal it is " + f2.toDecimal());
            System.out.println(f1.add(f2) + " is the sum of your fractions");
            System.out.println(f1.subtract(f2) + " is the difference of your fractions");
            System.out.println(f1.multiply(f2) + " is the product of your fractions");
            System.out.println(f1.divide(f2) + " is the quotient of your fractions");
            if (f1.equals(f2)){
                System.out.println("Your fractions are equal.");
            }
            else {
                System.out.println("Your fractions are not equal.");
            }
            System.out.println("\n\nType in a numerator");
            n1 = Integer.valueOf(s.next());
            System.out.println("Type in a denominator");
            d1 = Integer.valueOf(s.next());
            System.out.println("Type in a numerator");
            n2 = Integer.valueOf(s.next());
            System.out.println("Type in a denominator");
            d2 = Integer.valueOf(s.next());




        }

    }
}
