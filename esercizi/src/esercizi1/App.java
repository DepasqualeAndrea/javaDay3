package esercizi1;

public interface App {
public static void main(String[] args) {
		
		System.out.println(" Caratteri pari = true || dispari = false)");
		System.out.println();
		//controllo stringhe
		
		String nome1 = "mi chiamo Andrea";
		System.out.println("La stringa - " + nome1 + " - è: " + stringPariDispari(nome1));
		
		
		String nome2 = "Il mio nome è Gennaro";
		System.out.println("La stringa  " + nome2 + " - è: " + stringPariDispari(nome2));
		
		System.out.println();
		
		System.out.println("Anno bisestile");
		System.out.println();
		
		// controllo prima stringa
		int year1 = 2013;
		System.out.println("L'anno " + year1 + " è: " + annoBisestile(year1));
		
		// controllo seconda stringa
		int year2 = 2024;
		System.out.println("L'anno " + year2 + " è: " + annoBisestile(year2));
		
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
