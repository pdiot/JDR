package metier;

public class Partie {

	/**
	 * @param args
	 */
	
	/**
	 * Liste des variables
	 */
	public int nbJoueurs;
	public String imageFond;
	public String titre;
	
	/**
	 * Constructeur de la partie. 
	 * @param nbJoueurs
	 * @param imageFond
	 * @param titre
	 */
	public Partie( int nbJoueurs, String imageFond, String titre){
		this.nbJoueurs = nbJoueurs;
		this.imageFond = imageFond;
		this.titre = titre;
	}

}
