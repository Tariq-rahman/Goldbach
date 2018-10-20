import java.util.Scanner;

public class TextUserInterface {

	private Scanner input;
	private Golbach golbach;
	
	public TextUserInterface(Golbach golbach){
		input = new Scanner(System.in);
		this.golbach =  golbach;
		display("please in put a whole odd integer greater than 5");
	}
	
	public void prompt(){
		
		String userInput = input.nextLine().trim();
		
	
			int number = Integer.parseInt(userInput);
			display(golbach.findSum(number));
		
	
	}
	
	private void display(String info) {
		System.out.println(info);
	}
	
}
