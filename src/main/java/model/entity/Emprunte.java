package model.entity;

import java.sql.Date;

public class Emprunte {

	private	int Emprunte_id;
	private	int Exemplaire_id;
	private int IdAdh;
	private	Date date_achate; 
	private Date dateRetour;
	private int ExemplaireId;
	
	//Setters Getters
		public int getEmprunte_id() {
			return Emprunte_id;
		}
		public void setEmprunte_id(int emprunte_id) {
			Emprunte_id = emprunte_id;
		}
		public int getExemplaire_id() {
			return Exemplaire_id;
		}
		public void setExemplaire_id(int exemplaire_id) {
			Exemplaire_id = exemplaire_id;
		}
		public int getIdAdh() {
			return IdAdh;
		}
		public void setIdAdh(int idAdh) {
			IdAdh = idAdh;
		}
		public Date getDate_achate() {
			return date_achate;
		}
		public void setDate_achate(Date date_achate) {
			this.date_achate = date_achate;
		}
		public Date getDateRetour() {
			return dateRetour;
		}
		public void setDateRetour(Date dateRetour) {
			this.dateRetour = dateRetour;
		}
		public int getExemplaireId() {
			return ExemplaireId;
		}
		public void setExemplaireId(int exemplaireId) {
			ExemplaireId = exemplaireId;
		}
			
}
