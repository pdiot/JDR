package metier;
import java.util.Scanner;


public class Notation {

	/**
	 * @param args
	 */
	
	/* Main pour tester note(int, int) qui ne v�rifie rien
	public static void main(String[] args) {
		
		Scanner s;
		String examIn, ccIn;
		int exam, cc;
		
		while (true) {
			try {
				System.out.println("Entrer la note d'examen");
				s = new Scanner(System.in);
				examIn = s.nextLine();
				exam = Integer.parseInt(examIn);

				System.out.println("Entrer la note de contr�le continu");
				s = new Scanner(System.in);
				ccIn = s.nextLine();
				cc = Integer.parseInt(ccIn);
				
				if (exam > 75 || exam < 0){
					throw new NumberFormatException("La note d'examen doit �tre comprise entre 0 et 75");
				}
				if (cc > 25 || cc < 0) {
					throw new NumberFormatException("La note de contr�le continu doit �tre comprise entre 0 et 25");
				}
				
				System.out.println(note(exam, cc));
				
				
			}
			catch (NumberFormatException nfe) {
				System.out.println("Erreur dans l'entr�e : " + nfe.getMessage());
			}
			catch (Exception e) {
				System.out.println("Erreur non g�ree : " + e.getMessage());
			}
		}
		
		
		
		
	}
	*/
	
	/* 
	 // Main pour tester note()
	public static void main (String[] args) {
		while (true) {
			note();
		}
	}
	
	*/
	
	/*
	// Main pour tester note(String, String)
	public static void main (String[] args) {
		System.out.println(note("Toto", "25"));
	}
	*/
	
	public static void main (String[] args) {
		System.out.println(note(-1,5));
	}
	
	public static String note(int exam, int cc) {
		// les notes sont v�rifi�es et valid�es avant l'appel de la fonction
		int sum = exam + cc;
		if (exam < 0 || exam > 75) {
			return "Erreur dans exam";
		} 
		else if (cc < 0 || cc > 25) {
			return "Erreur dans cc";
		}
		else {
			if (sum < 30) {
				return "D";
			} else if (sum >=30 && sum < 50){
				return "C";
			} else if (sum >=50 && sum < 70) {
				return "B";
			} else {
				return "A";
			}
		}
	
	}
	
	public static String note(String examIn, String ccIn) {
		// les notes sont v�rifi�es et valid�es avant l'appel de la fonction
		int exam, cc;
		try {
			
			exam = Integer.parseInt(examIn);
			cc = Integer.parseInt(ccIn);
			
			int sum = exam + cc;
			
			if (sum < 30) {
				return "D";
			} else if (sum >=30 && sum < 50){
				return "C";
			} else if (sum >=50 && sum < 70) {
				return "B";
			} else {
				return "A";
			}
		}
		catch (NumberFormatException nfe) {
			return "Erreur dans l'entr�e : " + nfe.getMessage();
		}
		
	
	}
	
	public static void note() {
		// Demande � l'user d'entrer les notes pendant l'ex�cution de la m�thode
		Scanner s;
		String examIn, ccIn;
		boolean valide = true;
		
		int exam, cc;
		
		try {
			System.out.println("Entrer la note d'examen");
			s = new Scanner(System.in);
			examIn = s.nextLine();
			exam = Integer.parseInt(examIn);
			System.out.println("Entrer la note de Contr�le Continu");
			s = new Scanner(System.in);
			ccIn = s.nextLine();
			cc = Integer.parseInt(ccIn);
			if (exam > 75 || exam < 0){
				throw new NumberFormatException("La note d'examen doit �tre comprise entre 0 et 75");
			}
			if (cc > 25 || cc < 0) {
				throw new NumberFormatException("La note de contr�le continu doit �tre comprise entre 0 et 25");
			}
			
			int sum = exam + cc;
			
			if (sum < 30) {
				System.out.println("D");
			} else if (sum >=30 && sum < 50){
				System.out.println("C");
			} else if (sum >=50 && sum < 70) {
				System.out.println("B");
			} else {
				System.out.println("A");
			}			
			
		}
		catch (NumberFormatException nfe) {
			 System.out.println("Erreur dans l'entr�e : " + nfe.getMessage());
		}
	}	

}
