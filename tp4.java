
public class tp4 {

	public static void main(String[] args) {
		int tab[] = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int tab1[] = { 9, 2, 3, 4, 5, 6, 7, 15, 1, 10, 11, 12, 13, 14, 8 };
		int tab2[] = { 3, 4, 1, 2, 5, 6, 7, 8, 9, 10, 11, 13, 12, 15, 14 };
		int tab3[] = { 6, 14, 10, 5, 11, 3, 4, 2, 15, 1, 13, 8, 12, 9, 7 };
		int tab4[] = { 6, 8, 10, 5, 10, 3, 4, 2, 1, 1, 10, 8, 1, 9, 7 };
		PrintTab(tab);
		PrintTab(tab1);
		PrintTab(tab2);
		PrintTab(tab3);
		PrintTab(tab4);
		System.out.println("Tri par Selection");
		PrintTab(TriSelection(tab));
		PrintTab(TriSelection(tab1)); 
		PrintTab(TriSelection(tab2));
		PrintTab(TriSelection(tab3)); 
		PrintTab(TriSelection(tab4));
		System.out.println("Tri par Bulles");
		PrintTab(TriABulles(tab));
		PrintTab(TriABulles(tab1));
		PrintTab(TriABulles(tab2));
		PrintTab(TriABulles(tab3));
		PrintTab(TriABulles(tab4));
		System.out.println("Tri par QuickSort");
		quickSort(tab,0,tab.length-1);
		quickSort(tab1,0,tab.length-1);
		quickSort(tab2,0,tab.length-1);
		quickSort(tab3,0,tab.length-1);
		quickSort(tab4,0,tab.length-1);
		PrintTab(tab);
		PrintTab(tab1);
		PrintTab(tab2);
		PrintTab(tab3);
		PrintTab(tab4);


	}

	public static void PrintTab(int tab[]) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

	public static int IndiceMin(int tab[], int rang) {
		int indice = rang;
		for (int i = rang + 1; i < tab.length; i++) {
			if (tab[i] < tab[indice]) {
				indice = i;
			}
		}
		return indice;
	}

	public static int[] Permuter(int tab[], int i, int indice) {
		int save = tab[i];
		tab[i] = tab[indice];
		tab[indice] = save;
		return tab;
	}

	/**
	 * @param tab
	 * @return tableau trier
	 */
	public static int[] TriSelection(int tab[]) {
		int indice = 0;
		for (int i = 0; i <= tab.length; i++) {
			indice = IndiceMin(tab, i);
			if (i != indice) {
				tab = Permuter(tab, i, indice);
			//	PrintTab(tab);
			}
		}
		return tab;
	}

	public static int[] TriABulles(int tab[]) {
		for (int i = 0; i < tab.length - 1; i++) {
			for (int j = 0; j < tab.length - i; j++) {
				if (j == tab.length - 1) {
					tab = Permuter(tab, j, j);
					//PrintTab(tab);
				} else if (tab[j] > tab[j + 1]) {
					tab = Permuter(tab, j, j + 1);
					//PrintTab(tab);
				}
			}
		}
		return tab;
	}
	
	public static void quickSort(int tab[], int d, int f) {
		int gauche = d - 1;
		int droite = f+1;
		
		int pivot = tab[d];
		if(d >= f) {
			return;
		}
			while(true) {
				do droite--; while(tab[droite] > pivot);
		        do gauche++; while(tab[gauche] < pivot);

		        if(gauche < droite) {
		            Permuter(tab, gauche, droite);
		           // PrintTab(tab);
		        }
		        else break;
			}
			
			quickSort(tab,d,droite);
			quickSort(tab,droite+1,f);
		}
	
}
