package tp2;

import java.util.Scanner;

public class tp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int longueur = 0;
		int intervalle = 0;
		int nombre = 0;
		float a = 0;
		float n = 0;
		int max = 0;
		/*
		 * System.out.println("Entrer la longueur"); longueur = scan.nextInt();
		 * System.out.println("Entrer l'intervalle"); intervalle =
		 * scan.nextInt(); System.out.println("Entrer le nombre"); a =
		 * scan.nextFloat(); System.out.println("Entrer la puissance"); n =
		 * scan.nextFloat(); puissance(a,n);
		 * System.out.println("Entrer le nombre"); nombre = scan.nextInt(); if
		 * (nombrePremier(nombre) == true) { System.out.println("oui");
		 * System.out.println(nombre); } else { System.out.println("non");
		 * 
		 * }
		 */
		System.out.println("Entrer la longueur");
		nombre = scan.nextInt();
		System.out.println("Entrer l'intervalle");
		max = scan.nextInt();
		// tablemulti();
		int[] tab = new int[max / nombre];
		tab = tablemulti2(nombre, max);
		for (int i = 0; i <= (max / nombre); i++) {
			System.out.println(tab[i]);
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
		int[] table = new int[(max/nb)+1];
		int i = 0;
		for(i=0;i<=max/nb;i++) {
			result = nb * i;
			table[i] = result;	
		}
		return table;
	}

	private static boolean nombrePremier(int nombre) {
		double limite = Math.sqrt(nombre) + 1;
		boolean verif = false;
		// Si le chiffre est pair
		if (nombre % 2 == 0) {
			verif = true;
		} else {
			//Verification des diviseurs possible
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
