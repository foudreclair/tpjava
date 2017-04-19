
public class tp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeEntier list = new ListeEntier(15);
		AjouterFin(36, list);
		AjouterFin(-4, list);
		AjouterFin(9, list);
		AjouterFin(13, list);
		AjouterFin(22, list);
		AjouterFin(-9, list);
		AjouterFin(70, list);
		int longueur = Longueur(list);
		System.out.println(longueur);
		Afficher(list);

	}

	public static ListeEntier Permuter(ListeEntier list, int a, int b) {
		if(a > Longueur(list) | b > Longueur(list)) {
			return list;
		}
		else {
			ListeEntier courant = list;
			
			return courant;
		}
		
	}
	public static ListeEntier RetirerIndex(ListeEntier list, int i) {
		ListeEntier courant = list;
		int j = 0;
		while (j != i - 1 && list.suivant != null) {
			list = list.suivant;
			j++;
		}
		if (list.suivant.suivant == null) {
			list.suivant = null;
		} else {
			list.suivant = list.suivant.suivant;
		}

		return courant;
	}
	public static int MaxListe(ListeEntier list){
        int max = list.entier;
        while (list.suivant != null){
            if (list.suivant.entier >max){
                max = list.suivant.entier;
            }
            list = list.suivant;
        }
        return max;
    }

	public static ListeEntier FusionListe(ListeEntier listA, ListeEntier listB) {
		ListeEntier courantA = listA;
		ListeEntier courantB = listB;
		while (courantB != null) {
			courantB = courantB.suivant;
			AjouterFin(courantB.entier, courantA);
		}
		return courantA;
	}

	public static int Longueur(ListeEntier list) {
		int longueur = 0;
		ListeEntier courant = list;
		while (courant != null) {
			courant = courant.suivant;
			longueur += 1;
		}
		return longueur;
	}

	public static void Afficher(ListeEntier list) {
		ListeEntier courant = list;
		while (courant != null) {
			System.out.println(courant.entier);
			courant = courant.suivant;
		}
	}

	public static ListeEntier Ajouter(ListeEntier list, int pos, int val) {
		if (pos > Longueur(list)) {
			AjouterFin(val, list);
			return list;
		} else {
			ListeEntier courant = list;
			int i = 0;
			while (courant.suivant != null && i != pos) {
				courant = courant.suivant;
				i++;
			}
			ListeEntier FinListe = courant.suivant;
			courant.suivant = new ListeEntier(val);
			courant.suivant.suivant = FinListe;
			return list;
		}

	}

	public static ListeEntier AjouterFin(int entier, ListeEntier list) {
		ListeEntier courant = list;
		while (courant.suivant != null) {
			courant = courant.suivant;
		}
		courant.suivant = new ListeEntier(entier);
		return list;
	}

	public static ListeEntier AjouterDebut(int entier, ListeEntier list) {
		@SuppressWarnings("unused")
		ListeEntier ancien = list;
		ListeEntier nouvelleListe = new ListeEntier(entier);
		nouvelleListe.suivant = list;
		return nouvelleListe;
	}
}
