
import java.util.Scanner;

public class tp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int choix = 0;

		System.out.println("Que voulez vous faire ?");
		System.out.println("1. afficher une régle graduer");
		System.out.println("2. faire un calcul de puissance");
		System.out.println("3. Verifier si le nombre est un nombre premier");
		System.out.println("4. Afficher la table de multiplication de 0 à 10");
		System.out.println("5. Afficher la table de multiplication du chiffre jusqu'au maximum");
		System.out.println("6. Afficher les exemples de recherche de tableaux");
		choix = scan.nextInt();
		
		switch (choix) {
		case 1:
			int longueur = 0;
			int intervalle = 0;
			System.out.println("Entrer la longueur");
			longueur = scan.nextInt();
			System.out.println("Entrer l'intervalle");
			intervalle = scan.nextInt();
			regle(longueur, intervalle);
			break;

		case 2:
			float a = 0;
			float n = 0;
			System.out.println("Entrer le nombre");
			a = scan.nextFloat();
			System.out.println("Entrer la puissance");
			n = scan.nextFloat();
			puissance(a, n);
			break;

		case 3:
			int nombre = 0;
			System.out.println("Entrer le nombre");
			nombre = scan.nextInt();
			if (nombrePremier(nombre) == true) {
				System.out.println("oui c'est un nombre premier");
			} else {
				System.out.println("non ce n'est pas un nombre premier");

			}
			break;

		case 4:
			tablemulti();
			break;
		case 5:
			int nb = 0;
			int max = 0;
			System.out.println("Entrer le nombre");
			nb = scan.nextInt();
			System.out.println("Entrer le max");
			max = scan.nextInt();
			int table[] = tablemulti2(nb, max);
			for (int i = 0; i <= (max / nb); i++) {
				System.out.println(table[i]);
			}
			break;
		case 6:
			int[] tab1 = { 1, 2, 3, 4, 5 };
			System.out.println(recherche(55, tab1));
			int[] tab2 = { 1, 2, 3, 4, 5 };
			System.out.println(recherche(5, tab2));
			int[] tab3 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
			System.out.println(recherche(9, tab3));
			int[] tab4 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
			System.out.println(recherche(5, tab4));
			break;
			default :
				System.out.println("Erreur, merci de ressayer");
				break;

		}


		scan.close();
	}

	private static void regle(int longueur, int intervalle) {
		for (int i = 0; i <= longueur; i++) {
			if (i % intervalle == 0) {
				System.out.print("|");
			} else {
				System.out.print("-");
			}
		}
	}

	private static void puissance(float a, float n) {
		float resultat = a;
		// si la puissance = 0
		if (n == 0) {
			resultat = 1;
		}
		// Si la puissance est négative
		else if (n < 0) {
			resultat = 1 / a;
			a = 1 / a;
			for (int i = -1; i > n; i--) {
				resultat = resultat * a;
			}
		} else {
			for (int i = 1; i < n; i++) {
				resultat = resultat * a;
			}
		}
		System.out.println(resultat);
	}

	private static void tablemulti() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (i * j > 10) {
					System.out.print(i * j + "  ");
				} else {
					System.out.print(i * j + "   ");
				}
			}
			System.out.print("\n");
		}
	}

	private static int[] tablemulti2(int nb, int max) {
		int result = 0;
		int[] table = new int[(max / nb) + 1];
		int i = 0;
		for (i = 0; i <= max / nb; i++) {
			result = nb * i;
			table[i] = result;
		}
		return table;
	}

	private static int recherche(int val, int[] tab) {
		int position = -1;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == val) {
				position = tab[i];
			}
		}
		return position;
	}

	private static boolean nombrePremier(int nombre) {
		double limite = Math.sqrt(nombre) + 1;
		boolean verif = false;
		// Si le chiffre est pair
		if (nombre % 2 == 0) {
			verif = true;
		} else {
			// Verification des diviseurs possible
			for (int i = 3; i < limite; i += 2) {
				if (nombre % i == 0) {
					verif = true;
				}
			}
		}
		// Exeption pour nombre = 2
		if (nombre == 2) {
			verif = false;
		}
		if (!verif) {
			return true;
		} else {
			return false;
		}

	}

}