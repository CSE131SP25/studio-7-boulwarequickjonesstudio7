package studio7;

public class Complex {
	private double r;
	private double i;
	
	public Complex(double real, double imaginary) {
		r = real;
		i = imaginary;
	}
	
	public Complex addComplex(Complex other) {
		return new Complex(r+other.r, i + other.i);
	}
	
	public Complex multComplex(Complex other) {
		return new Complex(r*other.r - i*other.i, r*other.i + i*other.r);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
