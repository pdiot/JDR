package metier;

public class Personnage {

	/**
	 * @param args
	 */
	
	/**
	 * Liste des variables
	 */
	public String nom;
	public String race;
	public String classe;
	public String sexe;
	public int pv;
	public int force;
	public int defense;
	public int intelligence;
	public int esprit;
	public int intitiative;
	public String equipement;
	public String inventaire;
	public String background;
	
	Personnage(String nom,String race,String classe,String sexe,int pv,int force,
	int defense,int intelligence,int esprit,int intitiative,String background){
		this.nom = nom;
		this.race = race;
		this.classe = classe;
		this.sexe = sexe;
		this.pv = pv;
		this.force = force;
		this.defense = defense;
		this.intelligence = intelligence;
		this.esprit = esprit;
		this.intitiative = intitiative;
		this.background = background;
		
	}
	Personnage(String nom,String race,String classe,String sexe,int pv,int force,
			int defense,int intelligence,int esprit,int intitiative){
				this.nom = nom;
				this.race = race;
				this.classe = classe;
				this.sexe = sexe;
				this.pv = pv;
				this.force = force;
				this.defense = defense;
				this.intelligence = intelligence;
				this.esprit = esprit;
				this.intitiative = intitiative;
				
			}

}
