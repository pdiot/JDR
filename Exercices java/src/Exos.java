import java.util.Scanner;


public class Exos {
	public static void main (String[] args){
		tp48();
	}
	
	public static void tp21() {
		double val;
		double val2;
		val = 231;
		val2 = val*2;
		System.out.println(val);
		System.out.println(val2);
	}
	
	public static void tp22() {
		System.out.println("Entrer un chiffre");
		Scanner s = new Scanner(System.in);
		System.out.println(Math.pow(s.nextInt(), 2));
	}
	
	public static void tp23() {
		System.out.println("Quel est votre pr�nom ?");
		Scanner s = new Scanner(System.in);
		System.out.println("Bonjour, " + s.nextLine()+".");
	}
	
	public static void tp24() {
		System.out.println("Prix HT de l'article");
		Scanner s = new Scanner(System.in);
		double prixHT = s.nextDouble();
		System.out.println("Quantit� d'articles");
		s = new Scanner (System.in);
		int q = s.nextInt();
		System.out.println("Taux de TVA en %");
		s = new Scanner (System.in);
		double tva = s.nextDouble();
		System.out.println(q + " articles achet�s � " + prixHT + "� avec un taux de TVA de " + tva + "%.");
		System.out.println("Prix total : " + q*prixHT*(100+tva)/100);
	}
	
	public static void tp31(){
		System.out.println("Entrer un nombre");
		Scanner s = new Scanner(System.in);
		double val = s.nextDouble();
		String retour = val <= 0 ? "N�gatif" : "Positif";
		System.out.println(retour);		
	}
	
	public static void tp32() {
		System.out.println("Entrer deux nombres");
		Scanner s = new Scanner(System.in);
		double x = s.nextDouble();
		double y = s.nextDouble();
		if ((x > 0 && y > 0) || (x <0 && y <0)) {
			System.out.println("Le r�sultat est positif");
		} else {
			System.out.println("Le r�sultat est n�gatif");
		}
	}
	
	public static void tp33() {
		System.out.println("Entrer trois noms");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();
		String c = s.nextLine();
		if (a.compareTo(b) <= 0 && b.compareTo(c) <= 0){
			System.out.println("Les noms sont dans l'ordre alphab�tique");
		}
		else {
			System.out.println("Les noms ne sont pas dans l'ordre alphab�tique");
		}
	}
	
	public static void tp34() {
		System.out.println("Entrer un nombre");
		Scanner s = new Scanner(System.in);
		double val = s.nextDouble();
		if (val < 0) {
			System.out.println("N�gatif");
		}
		else if (val != 0) {
			System.out.println("Positif");
		}
		else {
			System.out.println("Z�ro");
		}
	}
	
	public static void tp35(){
		System.out.println("Entrer deux nombres");
		Scanner s = new Scanner(System.in);
		double x = s.nextDouble();
		double y = s.nextDouble();
		String ret;
		if (x==0 || y == 0) {
			ret = "Le r�sultat est nul";
		} else if ((x > 0 && y > 0) || (x <0 && y <0)) {
			ret = "Le r�sultat est positif";
		} else {
			ret = "Le r�sultat est n�gatif";
		}
		System.out.println(ret);
	}
	
	public static void tp36() {
		System.out.println("Quel est l'�ge de l'enfant ?");
		Scanner s = new Scanner(System.in);
		double age = s.nextDouble();
		String ret = "Aucune cat�gorie";
		if (age >= 6 && age <= 7) {
			ret = "Poussin";
		} else if (age >=8 && age <= 9){
			ret = "Pupille";
		} else if (age >= 10 && age <= 11) {
			ret = "Minime";
		} else if (age >= 12) {
			ret = "Cadet";
		}
		System.out.println(ret);
	}
	
	public static void tp42() {
		System.out.println("Quelle heure est-il ? (HH:MM)");
		Scanner s = new Scanner(System.in);
		String time = s.nextLine();
		try {			
			if (!time.contains(":")) {
				NumberFormatException e = new NumberFormatException("Utilisez le format HH:MM");
				throw e;
			}
			String h = time.substring(0, time.indexOf(":"));
			String m = time.substring(time.indexOf(":")+1);
			
			
			int hh = Integer.parseInt(h);
			int mm = Integer.parseInt(m);
			if (hh < 0 || hh > 23) {
				NumberFormatException e = new NumberFormatException("Erreur sur le format de l'heure");
				throw e;
			}
			if (mm < 0 || mm > 60) {
				NumberFormatException e = new NumberFormatException("Erreur sur le format des minutes");
				throw e;		
			}
			int hnew, mnew;
			if (mm <= 58) {
				mnew = mm + 1;
				hnew = hh;
			}
			else {
				if (hh <= 22) {
					mnew = 0;
					hnew = hh + 1;
				}
				else {
					mnew = 0;
					hnew = 0;
				}
			}
			
			System.out.println("Dans une minute il sera " + hnew + " heures et " + mnew + " minutes.");
		}
		catch(NumberFormatException nfe) {
			System.out.println("Erreur dans l'entr�e : " + nfe.getMessage());
		}
	}
	
	public static void tp43() {
		System.out.println("Quelle heure est-il ? (HH MM SS)");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		int hnew, mnew, snew;
		if (s<= 58){
			snew = s+1;
			mnew = m;
			hnew = h;
		}
		else {
			snew = 0;
			if (m <= 58) {
				mnew = m + 1;
				hnew = h;
			}
			else {
				if (h <= 22) {
					mnew = 0;
					hnew = h + 1;
				}
				else {
					mnew = 0;
					hnew = 0;
				}
			}
		}
		
		System.out.println("Dans une minute il sera " + hnew + " heures, " + mnew + " minutes et " +snew + "secondes.");
		
	}

	public static void tp44() {
		System.out.println("Entrer le nombre de copies d�sir�es");
		// 0,10 1-10, 0,09 11-30, 0,08 31+++
		Scanner s = new Scanner (System.in);
		int copies = s.nextInt();
		double ret;
		if (copies <= 10) {
			ret = copies * 0.10;
		}
		else if (copies <= 30) {
			ret = 1 + (copies - 10) * 0.09;
		}
		else {
			ret = 1 + 20*0.09 + (copies - 30) * 0.08;
		}
		
		System.out.println("Le prix total est de " + ret + "�");
	}
	
	public static void tp45() {
		System.out.println("Entrer le sexe du Zorglubien (m/f)");
		Scanner s = new Scanner (System.in);
		String sexe = s.nextLine();
		System.out.println("Entrer l'�ge du Zorglubien");
		s = new Scanner (System.in);
		int age = s.nextInt();
		if ((sexe.equalsIgnoreCase("m") && age >= 20) || (sexe.equalsIgnoreCase("f") && (age >= 18 && age <= 35))) {
			System.out.println("Le zorglubien est imposable");
		} 
		else {
			System.out.println("Le zorglubien n'est pas imposable");
		}		
	}
	
	public static void tp46() {
		System.out.println("Entrer les scores des 4 candidats en %");
		Scanner s = new Scanner(System.in);
		double c1, c2, c3, c4;
		c1 = s.nextDouble();
		c2 = s.nextDouble();
		c3 = s.nextDouble();
		c4 = s.nextDouble();
		
		if (c2 > 50 || c3 > 50 || c4 > 50) {
			System.out.println("Le candidat 1 a perdu");
		} else if (c1 > 50) {
			System.out.println("Le candidat 2 a perdu");
		} 
		else {
			if ((c1 > 12.5) && (c1 > c2 && c1 > c3 && c1 > c4)) {
				System.out.println("Le candidat est en ballotage favorable");
			}
			else if (c1 > 12.5) {
				System.out.println("Le candidat est en ballotage d�favorable");
			}
		}
	}
	
	public static void tp47() {
		int assurance = 1;
		
		int age;
		int nbAccidents;
		int dureePermis;
		int dureeAssur;
		
		System.out.println("Entrer l'age, la dur�e de possession du permis, le nombre d'accidents et depuis combien de temps le client est assur�");
		Scanner s = new Scanner (System.in);
		age = s.nextInt();
		dureePermis = s.nextInt();
		nbAccidents = s.nextInt();
		dureeAssur = s.nextInt();
		
		if (age < 25 && dureePermis <2) {
			assurance = assurance + 2;
		}
		if (age >= 25 && dureePermis < 2) {
			assurance = assurance + 1;
		}				
		
		assurance = assurance + nbAccidents;
		
		if (dureeAssur >= 5 && assurance < 4) {		
			assurance --;	}	
				
		if (assurance >= 4) {
			System.out.println("Le client n'est pas assurable");
		} else if (assurance == 3){
			System.out.println("Rouge");
		} else if (assurance == 2){
			System.out.println("Orange");
		} else if (assurance == 1){
			System.out.println("Vert");
		} else {
			System.out.println("Bleu");
		}		
		
	}

	public static void tp48() {
		// ann�es bisextiles
		// f�vrier 28/29 -> 29 si bisextile

		int j, m, y;
		int fevMax=28;
		boolean bisextile = false;
		
		System.out.println("Entrer une date (JJ MM YYYY)");
		Scanner s = new Scanner (System.in);
		
		j = s.nextInt();
		m = s.nextInt();
		y = s.nextInt();
		try {
			if (y % 4 == 0) {
				if (y % 100 != 0) {
					bisextile = true;
				}
				else if (y % 400 == 0) {
					bisextile = true;
				}
			}
			
			if (bisextile) {
				fevMax = 29;
			}
			
			if (m > 12) {
				throw new NumberFormatException("Le mois fourni n'est pas valide");
			}
			
			if (m == 2) {
				if (j > fevMax) {
					throw new NumberFormatException("Le nombre de jours est trop grand pour le mois fourni");
				}
			}
			
			switch (m) {
				case 1:
					if (j > 31) {
						throw new NumberFormatException("Le nombre de jours est trop grand pour le mois fourni");
					}
					break;
				case 2:
					break;
				case 3:
					if (j > 31) {
						throw new NumberFormatException("Le nombre de jours est trop grand pour le mois fourni");
					}
					break;
				case 5:
					if (j > 31) {
						throw new NumberFormatException("Le nombre de jours est trop grand pour le mois fourni");
					}
					break;
				case 7:
					if (j > 31) {
						throw new NumberFormatException("Le nombre de jours est trop grand pour le mois fourni");
					}
					break;
				case 8:
					if (j > 31) {
						throw new NumberFormatException("Le nombre de jours est trop grand pour le mois fourni");
					}
					break;
				case 10:
					if (j > 31) {
						throw new NumberFormatException("Le nombre de jours est trop grand pour le mois fourni");
					}
					break;
				case 12:
					if (j > 31) {
						throw new NumberFormatException("Le nombre de jours est trop grand pour le mois fourni");
					}
					break;
				default:
					if (j > 30) {
						throw new NumberFormatException("Le nombre de jours est trop grand pour le mois fourni");
					}
			}
			
			System.out.println("La date " + j + "/"+m+"/"+y+" est valide." );
			
			
		}
		catch (NumberFormatException nfe) {
			System.out.println("Erreur dans la date entr�e : " + nfe.getMessage());
		}
	}

	


}
