import java.util.Scanner;

public class TP1_GOFFIC {

	/**
	 * Suite de Fibonacci : 1 Suite de Syracuse : 2 Calcul du volume : 3 
	 * Auteur : Pierre Goffic
	 * 
	 */
	public static void main(String[] args) {
		int choix = 0;
		System.out.println("Taper 1 pour Fibonacci, 2 pour Syracuse ou 3 pour calculer le volume du pave :");
		Scanner scan = new Scanner(System.in);
		choix = scan.nextInt();
		switch (choix) {
		case 1:
			fibonacci();
			break;
		case 2:
			int a = 0;
			do {
				System.out.println("Premier terme (doit etre inferieur a 14): ");
				a = scan.nextInt();
			} while (a > 14);
			syracuse(a);
			break;
		case 3:
			int hauteur = 0;
			int largeur = 0;
			int longueur = 0;
			while (longueur <= 0) {
				System.out.println("Entrer la longueur :");
				longueur = scan.nextInt();
			}

			while (largeur <= 0) {
				System.out.println("\nEntrer la largueur :");
				largeur = scan.nextInt();
			}

			while (hauteur <= 0) {
				System.out.println("\nEntrer la hauteur :");
				hauteur = scan.nextInt();
			}
			System.out.println("J'ai lu : " + longueur + " et " + largeur + " et " + hauteur + "  Le volume est de : "
					+ volume(longueur, largeur, hauteur));
			break;
		default:
			System.out.println("Erreur dans le choix merci de relancer le programme");
			break;
		}
		scan.close();
	}

	public static int volume(int longueur, int largeur, int hauteur) {
		int volume;
		//formule du volume pour le pave droit
		volume = longueur * largeur * hauteur;
		return volume;
	}

	public static void fibonacci() {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println("terme 0 : " + a);
		System.out.println("terme 1 : " + b);
		//On utilise une bloucle for
		for (int i = 2; i < 20; i++) {
			a = b + c;
			c = b;
			b = a;
			System.out.println("Terme " + i + ": " + a);
		}
	}

	public static void syracuse(int a) {
		int i = 1;
		System.out.println("terme 0 : " + a);
		//On utilise une boucle while
		while (a != 1) {
			// Si le chiffre est pair
			if (a % 2 == 0) {
				a = a / 2;
			}
			// Sinon le chiffre est impair
			else {
				a = 3 * a + 1;
			}
			System.out.println("terme " + i + ": " + a);
			i++;
		}
	}

}
