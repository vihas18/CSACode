package Fraction_Class;

/**
 * class Fraction will be used to test class construction knowledge
 *
 * @author Vihas Veggalam
 * @version 2022
 */
public class Fraction {
    private int numerator ;//The top part of the fraction
    private int denominator;//The bottom part of the fraction
    private boolean autoSimp;//Decides if the object will automatically be in its simplest form
    /**
     * Default Fraction Constructor
     */
    public Fraction(){
        this.numerator = 0;
        this.denominator = 1;
        this.autoSimp = false;
    }

    /**
     * All Fraction Constructor
     * @precondition d is not 0
     * @param n is the numerator and d is the denominator
     * @param d is the denominator of the unit fraction
     */
    public Fraction(int n, int d){
        this();
        this.numerator = n;
        if (d != 0)
            this.denominator = d;
     }


     /**
     * All Fraction Constructor With Simplification Toggle
     * @precondition d is not 0
     * @param n is the numerator and d is the denominator
     * @param d is the denominator of the unit fraction
      * @param s is if the class will simplify automatically
     */
    public Fraction(int n, int d, boolean s){
        this();
        this.numerator = n;
        if (d != 0)
            this.denominator = d;
        this.autoSimp = s;
     }

    /**
     * Unit Fraction Constructor
     * @precondition d is not 0
     * @param d is the denominator of the unit fraction
     */
    public Fraction(int d){
        this();
        this.numerator = 1;
        if (d != 0)
            this.denominator = d;
    }

    /**
     * Accessor Method
     * @return the numerator of the fraction
     */
    public int getNumerator(){
        return this.numerator;
    }

    /**
     * Accessor Method
     * @return the denominator of the fraction
     */
    public int getDenominator(){
        return this.denominator;
    }

    /**
     * Accessor Method
     * @return the toggle for simplifying of the fraction
     */
    public boolean getSimplify(){
        return this.autoSimp;
    }


    /**
     * Setter Method
     * @param n is the numerator of the fraction
     */
    public void setNumerator(int n){
        this.numerator = n;
    }

    /**
     * Setter Method
     * @precondition d is not = 0
     * @param d is the denominator of the fraction
     */
    public void setDenominator(int d){
        if (d != 0)
           this.denominator = d;
    }
    /**
     * Setter Method
     * @param s is the toggle for simplifying
     */
    public void setSimplify(boolean s){
       this.autoSimp = s;
    }


    /**
     * Returns the fraction as a decimal
     */
    public double toDecimal(){
        return this.numerator/(double) this.denominator;
    }

    /**
     * Checks if this fraction object equals another fraction object
     * @param f is another fraction to check equality
     */
    public boolean equals(Fraction f){
        return this.toDecimal() == f.toDecimal(); //Converts both fractions to decimals and compares the results. This accounts for instances like 3/4 and 6/8
    }

    /**
     * Returns the fraction as a string
     */
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }

    //CALCULATION METHODS

    /**
     *
     * @param f2 is the other fraction to be added to this one
     * @return a fraction that is the sum of the object calling the method and f2.
     */
    public Fraction add(Fraction f2){
        int n1 = this.getNumerator(), n2 = f2.getNumerator(), d1 = this.getDenominator(), d2 = f2.getDenominator();
        int n3, d3; //Fraction values for output
        n3 = n1*d2 + d1*n2;
        d3 = d2*d1;
        Fraction output = new Fraction(n3, d3);
        if (this.autoSimp){
            output.reduce();
        }
        return output;
    }

    /**
     *
     * @param f2 is the other fraction to be subtracted to this one
     * @return a fraction that is the difference of the object calling the method and f2.
     */
    public Fraction subtract(Fraction f2){
        int n1 = this.getNumerator(), n2 = f2.getNumerator(), d1 = this.getDenominator(), d2 = f2.getDenominator();
        int n3, d3; //Fraction values for output
        n3 = n1*d2 - d1*n2;
        d3 = d2*d1;
        Fraction output = new Fraction(n3, d3);
        if (this.autoSimp){
            output.reduce();
        }
        return output;
    }
    /**
     *
     * @param f2 is the other fraction to be multiplied to this one
     * @return a fraction that is the product of the object calling the method and f2.
     */
    public Fraction multiply(Fraction f2){
        int n1 = this.numerator, n2 = f2.getNumerator(), d1 = this.denominator, d2 = f2.getDenominator();
        int n3, d3; //Fraction values for output
        n3 = n1*n2;
        d3 = d2*d1;

        Fraction output = new Fraction(n3, d3);
        if (this.autoSimp){
            output.reduce();
        }

        return output;
    }
    /**
     *
     * @param f2 is the divisor and the object calling the method is the dividend
     * @return a fraction that is the quotient of the object calling the method and f2.
     */
    public Fraction divide(Fraction f2){
        int n1 = this.numerator, n2 = f2.getNumerator(), d1 = this.denominator, d2 = f2.getDenominator();
        int n3, d3; //Fraction values for output
        n3 = n1*d2;
        d3 = n2*d1;
        Fraction output = new Fraction(n3, d3);
        if (this.autoSimp){
            output.reduce();
        }
        return output;
    }

    /**
     * Reduces a fraction
     * @return
     */
    public void reduce(){
        String numeratorFactors = "";
        for (int i = 1; i <= (int) Math.sqrt(this.numerator); i++){ //Iterates through the number up to its sqrt
            if (this.numerator % i == 0){ //If the number is a factor continue
                numeratorFactors += i +"," + this.numerator/i + ","; //Adds the factor and the other number that multiplies to numerator to a string
            }
        }
        int gcd = 1;
        while (!numeratorFactors.equals(",")){
            int posComma1 = 0;
            int posComma2 = 0;

            posComma1 = numeratorFactors.indexOf(",");
            posComma2 = numeratorFactors.indexOf(",", posComma1+1);
            String numberString = (numeratorFactors.substring(posComma1+1, posComma2));//Finds the number between the commas
            int number = Integer.valueOf(numberString);//Converts the string to int
            if (this.denominator % number == 0){ //If the factor is a factor of the denominator continue
                if (number > gcd){ //If the factor is larger than the current Greatest Common Demoninator replace the gcd with the factor.
                    gcd = number;
                }
            }
            numeratorFactors = numeratorFactors.substring(posComma2);



        }

        //Divide both numerator and denomiator by the gcd
        this.numerator /= gcd;
        this.denominator /= gcd;

    }


}
