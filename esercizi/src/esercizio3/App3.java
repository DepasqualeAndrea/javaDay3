package esercizio3;
import java.util.Scanner;
public class App3 {
	
public static void main(String[] args) {
		
		String inputStr;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Inserire la stringa | fin = esci dal ciclo");
			inputStr = scanner.nextLine();
			if(!inputStr.equals("fin")) {
				System.out.println(String.join(",", inputStr.split(""))); 
			}
			System.out.println();
			
		}while(!inputStr.equals("fin"));
		
		scanner.close();
		
		System.out.println();
		System.out.println("Programma chiuso!");
	}
}
