package esercizio3;
import java.util.Scanner;
public class App3 {
	
public static void main(String[] args) {
		
		String inputString;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("write: | fin = stop cycles");
			inputString = scanner.nextLine();
			if(!inputString.equals("fin")) {
				System.out.println(String.join(",", inputString.split(""))); 
			}
			System.out.println();
			
		}while(!inputString.equals("fin"));
		
		scanner.close();
		
		System.out.println();
		System.out.println("stop successfully");
	}
}
