/**
 * Fraction is a class that represents a rational number.
 * @author Ben Gaudreau
 * @version Sept. 12 2023
 */
public class Fraction implements INumber<Fraction> {
	
	private int numerator, denominator;
	
	/**
	 * Construct a new Fraction given input parameters.
	 * @param num The fraction's numerator
	 * @param denom The fraction's denominator
	 */
	public Fraction(int num, int denom) {
		this.numerator = num;
		this.denominator = denom;
	}
	
	/** 
	 * Adds two Fractions and returns the result.
	 * The formula used is: (a/b) + (c/d) = (ad+cb/bd).
	 * @param input The Fraction to add to this one.
	 * @returns The sum of this Fraction and the input Fraction. 
	 */
	@Override
	public Fraction plus(Fraction input) {
		int numResult = (this.numerator * input.denominator) + (input.numerator * this.denominator);
		int denomResult = this.denominator * input.denominator;
		return new Fraction(numResult, denomResult);
	}
	
	/** 
	 * Subtracts two Fractions and returns the result.
	 * The formula used is: (a/b) - (c/d) = (ad+cb/bd).
	 * @param input The Fraction to subtract from this one.
	 * @returns The difference of this Fraction and the input Fraction. 
	 */
	@Override
	public Fraction minus(Fraction input) {
		int numResult = (this.numerator * input.denominator) - (input.numerator * this.denominator);
		int denomResult = this.denominator * input.denominator;
		return new Fraction(numResult, denomResult);
	}
	
	/** 
	 * Divides two Fractions and returns the result.
	 * The formula used is: (a/b) / (c/d) = (ad/bc).
	 * @param input The Fraction to divide this one by.
	 * @returns The quotient of this Fraction and the input Fraction.
	 */
	@Override
	public Fraction divide(Fraction input) {
		int numResult = this.numerator * input.denominator;
		int denomResult = this.denominator * input.numerator;
		return new Fraction(numResult, denomResult);
	}

	/** 
	 * Multiplies two Fractions and returns the result.
	 * The formula used is: (a/b) * (c/d) = (ac/bd).
	 * @param input The Fraction to multiply this Fraction by.
	 * @returns The product of this Fraction and the input Fraction.
	 */
	@Override
	public Fraction multiply(Fraction input) {
		int numResult = this.numerator * input.numerator;
		int denomResult = this.denominator * input.denominator;
		return new Fraction(numResult, denomResult);
	}
	
	/**
	 * Prints this Fraction as a String representation of its data.
	 */
	@Override
	public void print() {
		System.out.printf("%d/%d", this.numerator, this.denominator);
		
	}

	public boolean hasSameValue(Fraction F) {
//		TODO complete method
		return false;
	}
	
	public Fraction findFrequent(Fraction[] inputArray) {
//		TODO complete method
		return null;
	}
	
	public void insertionSort(Fraction[] inputArray) {
//		TODO complete method
	}
	
	public void printReverse(Fraction[] inputArray) {
//		TODO complete method
	}

}
