package fr.demos;

public class Livre extends  Article{
	
	private String auteur;
	private String titre;
	private String editeur;
	
	
	public Livre(String auteur, String titre, String editeur, double prixHT, double stock, String description, String reference) {
		super(prixHT, stock, description, reference);
		this.auteur = auteur;
		this.titre = titre;
		this.editeur = editeur;
	}


	
	
	
	
	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getEditeur() {
		return editeur;
	}






	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", titre=" + titre + ", editeur=" + editeur + ", toString()="
				+ super.toString() + "]";
	}






	
}
