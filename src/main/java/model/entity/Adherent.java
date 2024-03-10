package model.entity;

public class Adherent {
	
	private	int IdAdh;
	private	String nom;
	private	String prenom;
	private	String	mail;
	private	String	telephone;
	
	public Adherent(String nom, String prenom, String mail, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;

		this.telephone = telephone;
	}
		//Setters Getters
		public int getIdAdh() {
			return IdAdh;
		}
		public void setIdAdh(int idAdh) {
			IdAdh = idAdh;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
	
}
