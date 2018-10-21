public class Controller {

	public static void main(String[] args) {
		
		Goldbach golbach  = new Goldbach();
		TextUserInterface TUI = new TextUserInterface(golbach);
		
		while(true){
			TUI.prompt();
		}
	}
	
	
}
