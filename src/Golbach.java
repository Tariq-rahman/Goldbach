import java.util.ArrayList;

public class Golbach {
	
	private ArrayList<Integer> primeNumbers;

	public static void main(String[] args) {
	
		Golbach golbach  = new Golbach();
		
		golbach.populatePrimes();

	}
	
	public Golbach(){
		primeNumbers = new ArrayList<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
	}
	
	public boolean isOdd(int number){
		
		if (number % 2 == 0){
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isPrime(int number){
		
		if(number % 1 == 0){
			return false;
		}
		else{
			return true;
		}
		
	}
	
	public void process(int oddNumber){
		
		boolean processing = true;
		while(processing){
			
			int n = oddNumber - ()
		}
	}
	
	public void populatePrimes(){
		
	}

}
