package isn.exos;

import java.util.Scanner;

public class Exo {
  
  public static void main(String[] args) throws InterruptedException {
  	Scanner scan = new Scanner(System.in);
    char restart = ' ';
    char response = ' ';
    char pl = ' ';

    do {
        System.out.println("Lancer le compte a rebours ? (O/N)");
        response = scan.next().charAt(0);
        
        for (int i = 5; (i > 0 && (response == 'O' || response == 'o')); i--) {
            pl = i == 1 ? ' ' : 's';
            System.out.println("Il reste " + i + " seconde" + pl);
            Thread.sleep(1000);
            if (i == 1) System.out.println("0.... C'est fini !");
        }
        
        System.out.println("Voulez-vous recommencer ? (O/N)");
        restart = scan.next().charAt(0);
        
    } while (restart == 'O' || restart == 'o');
    
    System.out.println("Au revoir !");
  
  }
  
}
