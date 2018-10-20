import java.util.Scanner;

public class TextUserInterface {

	private Scanner input;
	private Golbach golbach;
	private int dumbCount;
	
	public TextUserInterface(Golbach golbach){
		input = new Scanner(System.in);
		this.golbach =  golbach;
		display("Welcome");
		displayRules();
		dumbCount = 0;
	}
	
	public void prompt(){
		
		String userInput = input.nextLine().trim();
		
			try{
				int number = Integer.parseInt(userInput);
				display(golbach.findSum(number));
			}
			catch(Exception e) {
				dumbCount++;
				displayError();
				displayRules();
			}
			
			
		
	
	}
	
	private void display(String info) {
		System.out.println(info);
	}
	
	public void displayRules(){
		String rules = "Enter a number that is:\n" +
				"- Greater than 5 \n" +
				"- An Odd Number \n" +
				"- A whole number";
		display(rules);
	}
	
	public void displayError(){
		if(dumbCount <= 2) {
			display("Mate, could I have  proper number, please\n");	
		}
		else if (5 >= dumbCount && dumbCount >= 3){
			display("You're not very bright are you? See your keyboard yeah, "
				+ "press one of the numbers then enter\n");
		}
		else {
			display("You are absolutley hopeless, end this program now.\n");
		}
	}
	
}
