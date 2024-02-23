import java.util.Scanner;

public class Character {
    String name;
    final int maxName = 25;
    int job;

    public void displayOptions (){
        System.out.println("[1] Input name");
        System.out.println("[2] Select Jobclass");
        System.out.println("[3] Confirm");
        System.out.println("[4] Back");
    }

    public String inputName (String name, int maxName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        sc.close();

        return name;
    }

    public int inputJobclass (int job){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Jobclass: ");
        job = sc.nextInt();
        sc.close();

        return job;
    }

    public void chooseOptions(String name, int job) {
        String charName = "";
        int jobClass = 0;
        int option;

        while (charName.isBlank() && jobClass<0){
            System.out.println("[1] Input name");
            System.out.println("[2] Select Jobclass");
            System.out.println("[3] Confirm");
            System.out.println("[4] Back");
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Input: ");
            option = sc.nextInt();
            sc.nextLine();
            sc.close();
            switch (option) {
                case 1:
                    charName = inputName(name, maxName);
                    
                    break;
                case 2:
                    jobClass = inputJobclass(jobClass);

                    break;
                case 3:

                    break;
                case 4:
                    StartMenu menu = new StartMenu();
                    menu.startScreen();

                    break;
            
                default:
                    break;
            }


        }

    }


}
// Scanner sc = new Scanner(System.in);
        // while (true) {
        //     try {
        //         System.out.println("Input Name: ");
        //         name = sc.nextLine();
        //         if (name.length()<maxName){
        //             break;
        //         }
        //         else
        //             System.out.println
        //     }catch
        // }

        // System.out.println("Character Name: " +name);
        // //Jobclass jobClass = new Jobclass();
        // //System.out.println(jobClass.);
        // System.out.println("Select Job Class: ");


        //sc.close();