public class Controller {

	public static void main(String[] args) {
		
		Golbach golbach  = new Golbach();
		TextUserInterface TUI = new TextUserInterface(golbach);
		
		while(true){
			TUI.prompt();
		}
	}
	
	
}
