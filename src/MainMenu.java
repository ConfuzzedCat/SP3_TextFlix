import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainMenu implements menu {
    public static void temp(){
       TextUI.sendMessage("\nWelcome To TextFlix!\n");

        ArrayList<String> list = new ArrayList<>(Arrays.asList("For user Management", "LibraryMenu", "Account", "Log out!"));

        boolean tryAgain =true;

        while(tryAgain) {
            int choice = TextUI.getUserInput("Please choose one is the option:", list);
            switch (choice) {
                case 1:
                    System.out.println("For user Management");
                    tryAgain = false;
                    break;
                case 2:
                    System.out.println("LibraryMenu");
                    tryAgain = false;
                    break;
                case 3:
                    System.out.println("Account");
                    tryAgain = false;
                    break;
                case 4:
                    System.out.println("Log out!");
                    tryAgain = false;
                    break;
                default:
                    System.out.println(" Invalid choice");
                    break;

            }
        }
    }
}
