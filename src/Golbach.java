import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Golbach.
 */

import java.util.Scanner;

public class Golbach {
	
	/** The prime numbers. */
	private ArrayList<Integer> primeNumbers;
	private Scanner input;

	/**
	 * Instantiates a new golbach.
	 */
	public Golbach(){
		primeNumbers = new ArrayList<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
	}
	
	public String findSum(int number){
		if(isOdd(number) && number > 5 && !isDecimal(number)){
			return process(number);
		}
		return "number does not match the requirements";
	}
	
	/**
	 * Checks if is odd.
	 *
	 * @param number the int
	 * @return true, if is odd
	 */
	public boolean isOdd(int number){
		
		if (number % 2 == 0){
			return false;
		}
		else {
			return true;
		}
	}
	
	/**
	 * Checks if is decimal.
	 *
	 * @param number the int
	 * @return true, if is decimal
	 */
	public boolean isDecimal(int number){
		if (number % 1 == 0){
			return false;	
	}
		else {
			return true;
		}
	}
	
	
	/**
	 * Checks if is prime.
	 *
	 * @param number the number
	 * @return true, if is prime
	 */
	public boolean isPrime(int number){
		
		if(primeNumbers.contains(number)){
			return true;
		}
		else if(!isOdd(number)){
			//no even number can be prime bar 2
			return false;
		}
		else{
			for(int i = 3; i < number/2; i++){
				if (!isDecimal(number/i)){
					//if division returns Integer then it is not prime
					return  false;
				}
				i++;
				//incrementing by 2 each loop to only divide by odd numbers
			}
		}
		
		return true;
		
	}
	
	/**
	 * Finds the sum of the number given with 3 primes.
	 *
	 * @param oddNumber the odd number
	 */
	public String process(int oddNumber){
		
		boolean processing = true;
		int indexZ = 0;
		int indexY = 0;
		Boolean varLastIncremented = true;
		while(processing){
			
			int n = oddNumber - (primeNumbers.get(indexY) + (primeNumbers.get(indexZ)));
			
			if(isPrime(n)){
				processing = false;
				String result =  outputResults(n, primeNumbers.get(indexY), primeNumbers.get(indexZ));
				return result;
			}
			else if(varLastIncremented){
				indexY++;
			}
			else {
				indexZ++;
			}
		}
		return "failed";
	}

	/**
	 * Output results.
	 *
	 * @param prime1 the prime 1
	 * @param prime2 the prime 2
	 * @param prime3 the prime 3
	 * @return the string
	 */
	public String outputResults(int prime1, int prime2, int prime3){
		return "Here are the numbers " + prime1 + " " + prime2 + " " + prime3;
	}
	
}
