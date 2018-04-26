package metier;

public class Utilisateur {

	/**
	 * @param args
	 */
	protected String mail;
	protected String login;
	protected String pwd;
	public String avatar;
	public String pseudo;
	
	public Utilisateur( String mail, String login, String pwd, String avatar, String pseudo){
		this.mail = mail;
		this.login = login;
		this.pwd = pwd;
		this.avatar = avatar;
		this.pseudo = pseudo;
	}
	public Utilisateur( String mail, String login, String pwd, String pseudo){
		this.mail = mail;
		this.login = login;
		this.pwd = pwd;
		this.pseudo = pseudo;
	}
	
	protected void seConnecter(){
		
	}
	protected void creerUnCompte(){
		
	}
	protected void modifierSonCompte(){
		
	}
	protected void supprimerSonCompte(){
		
	}
	protected void seDeconnecter(){
		
	}
	protected void recupererSonIdentifiant(){

	}
	protected void recupererSonMdp(){

	}
	protected void discuterSalleAttente(){
	}
	
	protected void lancerLesDes(){

	}
	protected void discuterDansLaPartie(){

	}
	

}
