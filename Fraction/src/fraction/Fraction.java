/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author Maen
 */
//Fraction Class
//try it
public class Fraction {

    /**
     * @param args the command line arguments
     */
    
    int numerator;
    int denominator;
 
    /**
    * Constructor
    * 
    * @param numr
    * @param denr
    */
    
    public Fraction(){
        numerator = 0;
	denominator = 0;
    }
    
    public Fraction(int numr, int denr) {
	numerator = numr;
	denominator = denr;
	reduce();
    }
 
    public int getNumerator() {
	return numerator;
    }
 
    public void setNumerator(int numerator) {
	this.numerator = numerator;
    }
 
    public int getDenominator() {
	return denominator;
    }
 
    public void setDenominator(int denominator) {
	this.denominator = denominator;
    }
    
    public int calculateGCD(int numerator, int denominator) {
	if (numerator % denominator == 0) {
             return denominator;
        }
	return calculateGCD(denominator, numerator % denominator);
	}
 
    /**
    * Reduce the fraction to lowest form
    */
    void reduce() {
	int gcd = calculateGCD(numerator, denominator);
	numerator /= gcd;
	denominator /= gcd;
    }
    
     /**
    * Adds two fractions
    * 
    * @param fractionTwo
    * @return
    */
    public Fraction add(Fraction fractionTwo) {
	int numer = (numerator * fractionTwo.getDenominator()) + 
                            (fractionTwo.getNumerator() * denominator);
	int denr = denominator * fractionTwo.getDenominator();
	return new Fraction(numer, denr);
    }
 
    /**
    * Subtracts two fractions
    * 
    * @param fractionTwo
    * @return
    */
    public Fraction subtract(Fraction fractionTwo) {
        int newNumerator = (numerator * fractionTwo.denominator) - 
                                 (fractionTwo.numerator * denominator);
	int newDenominator = denominator * fractionTwo.denominator;
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
    }
 
    /**
    * Multiples two functions
    * 
    * @param fractionTwo
    * @return
    */
    public Fraction multiply(Fraction fractionTwo) {
	int newNumerator = numerator * fractionTwo.numerator;
	int newDenominator = denominator * fractionTwo.denominator;
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
    }
 
    /**
    * Divides two fractions
    * 
    * @param fractionTwo
    * @return
    */
    public Fraction divide(Fraction fractionTwo) {
	int newNumerator = numerator * fractionTwo.getDenominator();
	int newDenominator = denominator * fractionTwo.numerator;
	Fraction result = new Fraction(newNumerator, newDenominator);
	return result;
    }
 
    /**
    * Returns string representation of the fraction
    */
    @Override
    public String toString() {
	return this.numerator + "/" + this.denominator;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
