package model.entity;

import java.sql.Date;

public class Livre {
	private int	ISBN ;
	private String titre;
	private String	auteur;
	private String domaine ;
	private Date dateParution; 
	private int nbrExemplaire; 
	private String motsCles ;
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public Date getDateParution() {
		return dateParution;
	}
	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}
	public int getNbrExemplaire() {
		return nbrExemplaire;
	}
	public void setNbrExemplaire(int nbrExemplaire) {
		this.nbrExemplaire = nbrExemplaire;
	}
	public String getMotsCles() {
		return motsCles;
	}
	public void setMotsCles(String motsCles) {
		this.motsCles = motsCles;
	}

}
