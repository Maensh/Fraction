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
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
