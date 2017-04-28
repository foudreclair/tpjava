package tp7;

public class ListeEntier {
	int entier;
	ListeEntier suivant = null;

	public ListeEntier(int entier) {
		this.entier = entier;
	}

	public int getEntier() {
		return entier;
	}

	public void setEntier(int entier) {
		this.entier = entier;
	}

	public ListeEntier getSuivant() {
		return suivant;
	}

	private void setSuivant(ListeEntier suivant) {
		this.suivant = suivant;
	}
	
	public void AjouterFin(int entier) {
		ListeEntier courant = this;
		while (courant.suivant != null) {
			courant = courant.suivant;
		}
		courant.suivant = new ListeEntier(entier);
	}

	private ListeEntier Clonage(ListeEntier list) {
		ListeEntier nouvelleListe = new ListeEntier(this.entier);
		while(this.suivant != null) {
			nouvelleListe.suivant = this.suivant;
		}
		return nouvelleListe;
		
	}
	
	public int Max(){
        int max = this.entier;
        while (this.suivant != null){
            if (this.suivant.entier >max){
                max = this.suivant.entier;
            }
        }
        System.out.println(max);
        return max;
    }
	
	public int Longueur() {
		int longueur = 0;
		ListeEntier courant = this;
		while (courant != null) {
			courant = courant.suivant;
			longueur += 1;
		}
		return longueur;
	}
	
	public void AjouterDebut(int entier) {
		ListeEntier list = new ListeEntier(this.entier);
		list.suivant = this.suivant;
		this.suivant = list;
		this.entier = entier;
	}
	
	public void Afficher() {
		ListeEntier courant = this;
		while (courant != null) {
			System.out.println(courant.entier);
			courant = courant.suivant;
		}
	}
}
