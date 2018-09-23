package isn.exos;

public class Exo1_Extension {
	
	public static void main(String[] args) {
		int[] tab = {1, 6, 7, 15, 3};
		
		System.out.println("Table de base:");
		for (int c = 0; c < tab.length; c++) {
			System.out.print(tab[c]);
			if (c + 1 < tab.length) System.out.print(", ");
		}
		
		for (int i = 0; i < 4; i++) {
			int[] tab2 = {0, 0, 0 , 0, 0};
			
			tab2[0] = tab[tab.length - 1];
			for (int a = 0; a < tab.length - 1; a++) {
				tab2[a + 1] = tab[a];
			}
			
			System.out.println("\n\nLoop " + i + ":");
			for (int b = 0; b < tab.length; b++) {
				System.out.print(tab2[b]);
				if (b + 1 < tab.length) System.out.print(", ");
			}
			tab = tab2;
		}
		
	}
}
