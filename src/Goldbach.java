import java.util.ArrayList;
import static java.lang.Math.sqrt;;
/**
 * The Class Goldbach.
 */
public class Goldbach {
	
	/**
	 * Instantiates a new goldbach.
	 */
	public Goldbach(){
	}
	
	public String findSum(int number){
		if(isOdd(number) && number > 5 && !isDecimal(number)){
			return findPrimes(number);
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
	public boolean isDecimal(double number){
		if (number % 1.0 == 0.0){
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
		
		if(!isOdd(number)){
			//no even number can be prime bar 2
			return false;
		}
		else{
			double sqrtNum = Math.sqrt((double) number);
			
			for(double i = 3.0; i < sqrtNum ; i++){
				double decimal = number/i;
				if (!isDecimal(decimal)){
					//if division returns Integer then it is not prime
					return false;
				}
				i++; //incrementing by 2 each loop to only divide by odd numbers
			}
		}
		
		return true;
		
	}
	
	public String findPrimes(int oddNumber){
		oddNumber = oddNumber -3;
		int smallPrime = 2;
		int bigPrime = oddNumber;
		int i  = 1;
		boolean solved = false;
		
		while(!solved){
			if(isPrime(bigPrime)){
				String result = outputResults(smallPrime,bigPrime,3);
				return result;
			}
			else {
				smallPrime = findNextPrime(smallPrime);
				bigPrime = oddNumber - smallPrime;
				i++;
			}
		}
		
		return "failed";
	}
	
	public int findNextPrime(int currentPrime){
		
		boolean primeFound = false;
		
		if(currentPrime == 2){
			return 3;
		}
		
		while(!primeFound){
			currentPrime = currentPrime + 2;
			if(isPrime(currentPrime)){
				primeFound = true;
			}
			else{
				currentPrime++;
			}
		}
		
		return currentPrime;
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
