import java.util.Scanner;

public class tp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int tab[] = new int[4];
		int tab2[][] = new int[3][4];
		SetTab2(tab2);
		PrintTab2(tab2);
		*/
		//CribleEratosthene(100);
		int tab [] = {31,-41,59,26,-53,58,97,-93,-23,84};
		PrintTab(Ssm(tab));
	}

	public static int[] SetTab(int tab[]) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("Entrer une valeur :");
			tab[i] = scan.nextInt();
		}
		scan.close();
		return tab;
	}

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
	
	//Complexité n²
	public static void nombrePremier(int n) {
		for (int i = 2; i <= n; i++) {
			int cpt = 0;
			long racine = Math.round(Math.sqrt(i));
			for (long j = 0; j< racine;j++){
				if (i%(j+1)==0){
					cpt += 1;
				}
			}
			if(cpt == 1){
				System.out.print(i+" ");
			}
		
		}
	}
	//Complexité n²
	public static void CribleEratosthene(int n) {
		//Check 
		 boolean[] tab = new boolean[n];
		 //--//
		 for (int i = 2; i < n; i++) {
		   if (!tab[i]) {
		     int j = i + i;
		     while (j < n) {
		       tab[j] = true;
		       j += i;
		     }
		   }
		   //Print
		   if (!tab[i]) {
				System.out.println(i);
			}
		 } 
	}
	
	public static int[] Ssm(int [] tab) {
		int best = 0;
		int debut = -1;
		int fin = -1;
		for(int i =0;i<tab.length;i++) {
			int s = 0;
			for(int j = i;j<tab.length;j++) {
				s += tab[j];
				if(s>best) {
					best = s;
					debut = i;
					fin = j+1;
				}
			}
		}
		int tab2[] = new int[fin-debut]; 
		for(int i = 0;i<tab2.length;i++) {
			tab2[i] = tab[debut];
			debut++;
		}
		return tab2;
	}
}
