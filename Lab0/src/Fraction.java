

/**
 * Fraction is a class that represents a rational number.
 * @author Ben Gaudreau
 * @version Sept. 12 2023
 */
public class Fraction implements INumber<Fraction>, Comparable<Fraction> {
	
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
	
	/**
	 * Compares the value of this 
	 * @param input 
	 * @return
	 */
	public boolean hasSameValue(Fraction input) {
//		TODO complete method
		if (this.numerator * input.denominator == input.numerator * this.denominator) {
			return true;
		}
		return false;
	}
	
	public Fraction findMax(Fraction[] inputArray) {
//		TODO complete method
		return null;
	}
	
	public Fraction findMix(Fraction[] inputArray) {
//		TODO complete method
		return null;
	}
	
	public void selectionSort(Fraction input) {
//		TODO complete method
	}
	
	public int getCountGreater(Fraction[] inputArray, Fraction inputFraction) {
//		TODO complete method
		return -1;
	}
	
	//Joseph Rumery
	public Fraction findFrequent(Fraction[] input) {
		
		//count1 holds the number of copies of currently tested 
		int count1 = 0;
		int count2 = 0;
		
		Fraction current;
		Fraction frequent;
		
		for(int i = 0; i < input.length; i++) {
			
			current = input[i];
			
			for(int j = 0; j < input.length; j++) {
				
				if(current.toString().compareTo(input[j].toString()) == 0) {
					
					count1++; 
				}
				
			}
			
			if((count1-1)>count2) {
				
				frequent = current;
				count2 = count1-1;
				
			}
		}
		
		return frequent;
	}
	
	//changes 
	
	//boolean add method 
	public boolean add(Fraction input) {
		return true;
	}
	
	//Fraction remove method
	public Fraction remove(Fraction input) {
		return input;
	}
	
	//contains method 
	public boolean contains(Fraction input) {
		return true;
	}
}
