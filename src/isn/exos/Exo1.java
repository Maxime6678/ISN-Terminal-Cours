package isn.exos;

public class Exo1 {
	
	public static void main(String[] args) {
		int[] tab = {1, 6, 7, 15, 3};
		int[] tab2 = {0, 0, 0 , 0, 0};
		
		System.out.println("Table de base: ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
			if (i + 1 < tab.length) System.out.print(", ");
		}
		
		tab2[0] = tab[tab.length - 1];
		for (int a = 0; a < tab.length - 1; a++) {
			tab2[a + 1] = tab[a];
		}
		
		System.out.println("\n\nRésultat: ");
		for (int b = 0; b < tab.length; b++) {
			System.out.print(tab2[b]);
			if (b + 1 < tab.length) System.out.print(", ");
		}
		
	}
}
