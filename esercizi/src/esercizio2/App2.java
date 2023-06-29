package esercizio2;

public class App2 {
	
public static void main(String[] args) {
		
		int numero[] = {0, 1, 2, 3, 4, 5};
		
		for(int num: numero) {
			switch(num) {
			
			case 0:
				System.out.println("Il numero è: Zero");
				break;
				
			case 1:
				System.out.println("Il numero è: Uno");
				break;
				
			case 2:
				System.out.println("Il numero è: Due");
				break;
				
			case 3:
				System.out.println("Il numero è: Tre");
				break;
			case 4:
				System.out.println("Il numero è: Quatro");
				break;
			case 5:
				System.out.println("Il numero è: Cinque");
				break;
			default:
				System.out.println("Il numero non è compreso tra 0 e 5!");
			}
		}
		
	}

}
