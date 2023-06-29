package esercizi1;

public interface App {
public static void main(String[] args) {
		
		System.out.println(" Caratteri pari = true || dispari = false)");
		System.out.println();
		
		// controllo prima stringa
		String strOne = "mi chiamo Andrea";
		System.out.println("La stringa - " + strOne + " - è: " + stringPariDispari(strOne));
		
		// controllo seconda stringa
		String strTwo = "Ciao, sono Luca!";
		System.out.println("La stringa - " + strTwo + " - è: " + stringPariDispari(strTwo));
		
		System.out.println();
		
		System.out.println("Anno bisestile");
		System.out.println();
		
		// controllo prima stringa
		int yearOne = 2013;
		System.out.println("L'anno " + yearOne + " è: " + annoBisestile(yearOne));
		
		// controllo seconda stringa
		int yearTwo = 2024;
		System.out.println("L'anno " + yearTwo + " è: " + annoBisestile(yearTwo));
		
	}
	
	public static boolean stringPariDispari(String str) {
		
		if(str.length() % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
		//return (str.length() % 2 == 0);
		
	}
	
	public static boolean annoBisestile(int year) {
		
		
		return (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0);
	}
}
