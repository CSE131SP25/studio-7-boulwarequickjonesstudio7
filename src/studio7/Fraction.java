package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction multiplyFraction(Fraction f) {
		return new Fraction(numerator*f.numerator, denominator*f.denominator);
	}
	
	public Fraction addFraction(Fraction f) {
		int newNumerator = numerator*(f.denominator);
		int newDenominator = denominator*f.denominator;
		int otherNumerator = f.numerator*(denominator);
		return new Fraction(newNumerator + otherNumerator, newDenominator);
	}
	
	public Fraction reciprocalFract() {
		return new Fraction(denominator, numerator);
	}
	
	public Fraction simplifyFract() {
		for(int i = denominator; i >= 2; i--) {
			if 
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
