
//import java.util.InputMismatchException;
import java.util.Scanner;

public class StartMenu {
    final String TITLE = "Elden Rogue";

    public void displayTitle (){
        System.out.println(TITLE);
        System.out.println();
    }

    public static void clearScreen() {     
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public void startScreen () {
        int game = 0;

        displayTitle();
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Start");
        System.out.println("[0] Exit");
        game = sc.nextInt();
        sc.nextLine();
        sc.close();
        switch (game) {
            case 1:
                clearScreen();
                Character charCreation = new Character();

                displayTitle();
                charCreation.displayOptions();
                
                break;
            case 0:
                System.out.println("Exiting Game");
                break;
            } 
       
    }
}
