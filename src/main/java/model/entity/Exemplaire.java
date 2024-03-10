package model.entity;

public class Exemplaire {

		private int Exemplaire_id;
		private int ISBN;
		private int disponible;
		
		//Getters Setterss
			public int getExemplaire_id() {
				return Exemplaire_id;
			}
			public void setExemplaire_id(int exemplaire_id) {
				Exemplaire_id = exemplaire_id;
			}
			public int getISBN() {
				return ISBN;
			}
			public void setISBN(int iSBN) {
				ISBN = iSBN;
			}
			public int getDisponible() {
				return disponible;
			}
			public void setDisponible(int disponible) {
				this.disponible = disponible;
			}
			
			
}
