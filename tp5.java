import java.util.Scanner;

/**
 * @author Pierre Goffic
 *
 */
public class tp5 {

	public static void main(String[] args) {
		/*
		 * int tab[] = new int[4]; int tab2[][] = new int[3][4]; SetTab2(tab2);
		 * PrintTab2(tab2);
		 */
		// CribleEratosthene(100);
		int tab[] = { 31, -41, 59, 26, -53, 58, 97, -93, -23, 84 };
		PrintTab(Ssm(tab));
	}

	// Set tableau 4
	public static int[] SetTab(int tab[]) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("Entrer une valeur :");
			tab[i] = scan.nextInt();
		}
		scan.close();
		return tab;
	}

	// Set tableau 3 4
	public static int[][] SetTab2(int tab[][]) {
		Scanner scan = new Scanner(System.in);
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.println("Entrer une valeur :");
				tab[j][i] = scan.nextInt();
			}
		}
		scan.close();
		return tab;
	}

	public static void PrintTab(int tab[]) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

	public static void PrintTab2(int tab[][]) {
		for (int j = 0; j < tab.length; j++) {
			for (int i = 0; i < tab[0].length; i++) {
				System.out.print(tab[j][i] + " ");
			}
			System.out.println("");
		}
		System.out.println();
	}

	// Complexité n²
	public static void nombrePremier(int n) {
		for (int i = 2; i <= n; i++) {
			int cpt = 0;
			long racine = Math.round(Math.sqrt(i));
			for (long j = 0; j < racine; j++) {
				if (i % (j + 1) == 0) {
					cpt += 1;
				}
			}
			if (cpt == 1) {
				System.out.print(i + " ");
			}

		}
	}

	// Complexité n²
	public static void CribleEratosthene(int n) {
		// Check
		boolean[] tab = new boolean[n];
		for (int i = 2; i < n; i++) {
			if (!tab[i]) {
				int j = i + i;
				while (j < n) {
					tab[j] = true;
					j += i;
				}
			}
			// Print
			if (!tab[i]) {
				System.out.println(i);
			}
		}
	}

	public static int Spartielle(int[] tab, int i, int j) {
		int r = 0;
		for (int a = i; a <= j; a++) {
			r += tab[a];
		}
		return r;
	}

	// Version naïve complexité n3
	public static int[] Ssm(int[] tab) {
		int best = 0;
		int debut = -1;
		int fin = -1;
		for (int i = 0; i < tab.length; i++) {
			for (int j = i; j < tab.length; j++) {
				int s = Spartielle(tab, i, j);
				if (s > best) {
					best = s;
					debut = i;
					fin = j + 1;
				}
			}
		}
		int tab2[] = new int[fin - debut];
		for (int i = 0; i < tab2.length; i++) {
			tab2[i] = tab[debut];
			debut++;
		}
		return tab2;
	}

	// Version plus rapide
	// Complexité n²
	public static int[] Ssm2(int[] tab) {
		int best = 0;
		int debut = -1;
		int fin = -1;
		for (int i = 0; i < tab.length; i++) {
			int s = 0;
			for (int j = i; j < tab.length; j++) {
				s += tab[j];
				if (s > best) {
					best = s;
					debut = i;
					fin = j + 1;
				}
			}
		}
		int tab2[] = new int[fin - debut];
		for (int i = 0; i < tab2.length; i++) {
			tab2[i] = tab[debut];
			debut++;
		}
		return tab2;
	}

	
	public static void MergeSort(int tableau[]) {
		int longueur = tableau.length;
		if (longueur > 0) {
			MergeSort(tableau, 0, longueur - 1);
		}
	}

	public static int[] Duplicate(int tab[]) {
		int tab2[] = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			tab2[i] = tab[i];
		}
		return tab2;
	}

	private static void MergeSort(int tableau[], int deb, int fin) {
		if (deb != fin) {
			int milieu = (fin + deb) / 2;
			MergeSort(tableau, deb, milieu);
			MergeSort(tableau, milieu + 1, fin);
			Merge(tableau, deb, milieu, fin);
		}
	}

	private static void Merge(int tableau[], int deb1, int fin1, int fin2) {
		int deb2 = fin1 + 1;
		int table1[] = new int[fin1 - deb1 + 1];
		for (int i = deb1; i <= fin1; i++) {
			table1[i - deb1] = tableau[i];
		}
		int compt1 = deb1;
		int compt2 = deb2;

		for (int i = deb1; i <= fin2; i++) {
			if (compt1 == deb2) {
				break;
			} else if (compt2 == (fin2 + 1)) {
				tableau[i] = table1[compt1 - deb1];
				compt1++;
			} else if (table1[compt1 - deb1] < tableau[compt2]) {
				tableau[i] = table1[compt1 - deb1];
				compt1++;
			} else {
				tableau[i] = tableau[compt2];
				compt2++;
			}
		}
	}
}