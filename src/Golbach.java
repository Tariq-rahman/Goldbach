import java.util.ArrayList;

public class Golbach {
	
	private ArrayList<Integer> primeNumbers;

	public static void main(String[] args) {
	
		Golbach golbach  = new Golbach();

	}
	
	public Golbach(){
		primeNumbers = new ArrayList<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
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
	
	public void process(int oddNumber){
		
		boolean processing = true;
		int indexZ = 0;
		int indexY = 0;
		Boolean varLastIncremented = true;
		while(processing){
			
			int n = oddNumber - (primeNumbers.get(indexY) + (primeNumbers.get(indexZ)));
			
			if(isPrime(n)){
				processing = false;
				outputResults(n, primeNumbers.get(indexY), primeNumbers.get(indexZ));
			}
			else if(varLastIncremented){
				indexY++;
			}
			else {
				indexZ++;
			}
		}
	}

	public String outputResults(int prime1, int prime2, int prime3){
		return "Here are the numbers " + prime1 + " " + prime2 + " " + prime3;
	}
}
