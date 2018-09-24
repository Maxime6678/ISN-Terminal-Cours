
public class Exo1 {
	
	public static void main(String[] args) {
		int[] tab = {1, 6, 7, 15, 3};
		int memo;
		
		System.out.println("Table de base: ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
			if (i + 1 < tab.length) System.out.print(", ");
		}
		
		memo = tab[tab.length - 1];
		for (int a = tab.length - 2; a >= 0; a--) {
			tab[a + 1] = tab[a];
		}
		tab[0] = memo;
		
		System.out.println("\n\nRésultat: ");
		for (int b = 0; b < tab.length; b++) {
			System.out.print(tab[b]);
			if (b + 1 < tab.length) System.out.print(", ");
		}
		
	}
	
}
