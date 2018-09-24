
public class Exo1_Extension {

	public static void main(String[] args) {
		int[] tab = {1,6,7,15,3};
		int memo;
		
		System.out.println("Table de base: ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
			if (i + 1 < tab.length) System.out.print(", ");
		}
		
		for (int a = 1 ; a < tab.length; a++) {
			memo = tab[tab.length-1];
			for(int i = tab.length-1; i >= 1; i--) { 
				tab[i] = tab[i - 1];
			}
			tab[0] = memo;
			
			System.out.println("\n\nTable " + a + ": ");
			for (int b = 0; b < tab.length; b++) {
				System.out.print(tab[b]);
				if (b + 1 < tab.length) System.out.print(", ");
			}
		}	
	}
	
}
