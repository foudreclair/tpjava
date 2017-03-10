
public class tp3 {
	public static void main(String[] args) {
		int tab[][] = { { 2, 4, 6 }, { 9, 10, 17 }, { 1, 6, 18 } };
		System.out.println(soustractionCroix(tab));

		float[] taba = { 1.3f, 2.2f, 5.0f, 1.4f, 1.4f };
		float[] tabb = { 2.2f, 1.3f, 3.1f };
		boolean a = wasSafe(taba, 3.1f);
		boolean b = wasSafe(tabb, 10.1f);
		boolean c = wasSafe2(taba, 3.1f);
		boolean d = wasSafe2(tabb, 10.1f);
		System.out.println(c);
		System.out.println(d);
		System.out.println(cantor(3, 1));
		long[] tab21 = new long[6];
		fibonacci2(tab21, 5);
		System.out.println(cantorBonus(0, 3));
	}

	/**
	 * Cette fonction calcul le factorielle d'un nombre Son expression
	 * mathématiques s'écrit : n!s
	 * 
	 * @param n
	 * 
	 */
	public static long factorielle(long n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorielle(n - 1);
		}
	}

	/**
	 * calcul pour trouver le PGCD
	 * 
	 * @param a
	 * @param b
	 * @return c (PGCD)
	 */
	public static int pgcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}

		if (a == b) {
			return a;
		} else {
			if (a > b) {
				return pgcd(a - b, b);

			} else {
				return pgcd(a, b - a);
			}
		}
	}

	public static int soustractionCroix(int[][] tab) {
		if (tab.length % 2 != 0 && tab[0].length % 2 != 0) {
			// Somme des termes de la ligne du milieu
			int milieu = (tab.length) / 2;
			int fin = tab[0].length;
			int somme = 0;
			for (int i = 0; i < fin; i++) {
				somme = somme + tab[milieu][i];
			}
			milieu = tab[0].length / 2;
			fin = tab.length;
			int soustraction = 0;
			for (int i = 0; i < fin; i++) {
				soustraction = soustraction + tab[i][milieu];
			}
			return somme - soustraction;
		} else {
			return 0;
		}
	}

	// Vérifie la présence d'une valeur inférieur à TempMax dans le tableau
	// temps
	public static boolean wasSafe(float[] temps, float tempMax) {
		return wasSafeR(temps, tempMax, temps.length - 1);
	}

	public static boolean wasSafeR(float[] temps, float tempMax, int pos) {
		boolean safe = tempMax < temps[pos];
		if (pos == 0 || safe) {
			return safe;
		}
		return wasSafeR(temps, tempMax, pos - 1);
	}

	/**
	 * wasSafe2 = wassafeR sans récursivité
	 * 
	 * @param temps
	 * @param tempMax
	 * @return
	 */
	public static boolean wasSafe2(float[] temps, float tempMax) {
		int pos = temps.length - 1;
		boolean result = false;
		while (pos != 0) {
			boolean safe = tempMax < temps[pos];
			if (safe == true) {
				result = safe;
			}
			pos = pos - 1;
		}
		return result;
	}

	/**
	 * Cantor
	 * 
	 * @param x
	 * @param y
	 * @return 1 + cantor(0,x-1) ou 1 + cantor(x+1,y-1)
	 */
	public static int cantor(int x, int y) {
		if (x == 0 && y == 0) {
			return 0;
		} else if (y == 0) {
			return 1 + cantor(0, x - 1);
		} else {
			return 1 + cantor(x + 1, y - 1);
		}

	}

	public static int cantorBonus(int x, int y) {
		int result = 0;
		if (x == 0 && y == 0) {
			return 0;
		} else {
			if (x > y) {
				for (int i = 0; i < x; i++) {
					result += i + 1;
				}
				return result = result + y;
			} else {
				for (int i = 0; i < y; i++) {
					result += i + 1;
				}
				return result = result + y;
			}

		}
	}

	// Pour n'importe quelle n la fonction fibonacci est appeler i fois
	// approximé par la fonction exponentielle
	/**
	 * Version naïve
	 * 
	 * @param n
	 * @return res
	 */
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int res = fibonacci(n - 1) + fibonacci(n - 2);
			System.out.println("Fib(" + n + ") :" + res);
			return res;

		}
	}

	// Cette version de fibonacci est la plus efficace car on ne recalcule pas
	// toutes les valeurs
	// On garde les valeurs dèja calculés dans un tableau
	// L'intêret de la récursivité est de pouvoir stocker dans un tableau.
	public static long fibonacci2(long[] tab, int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			if (tab[n] == 0) {
				long res = fibonacci2(tab, n - 1) + fibonacci2(tab, n - 2);
				tab[n] = (long) res;
				System.out.println("Fib(" + n + ") :" + tab[n]);
				return res;
			} else {
				System.out.println("Fib(" + n + ") :" + tab[n]);
				return tab[n];
			}
		}
	}

}
