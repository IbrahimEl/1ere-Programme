package fr.demos;

import java.util.ArrayList;

public class Panier {

	ArrayList<Article> list = new ArrayList<>();

	public void ajouter(Article LIVRE) {

		this.list.add(LIVRE);
		
	}

	
	public void supprimer(Article LIVRE) {
		this.list.remove(LIVRE);
	}

	
	public ArrayList<Article> getList() {
		return list;
	}

		

	



	@Override
	public String toString() {
		return "Panier [list=" + list + "]";
	}
	
	

}
