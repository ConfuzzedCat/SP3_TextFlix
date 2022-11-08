import java.util.ArrayList;
import java.util.Arrays;

//fix
// fix

public class MainMenu implements Menu {
    public MainMenu() {
        this.showMenu();
    }

    @Override
    public void goBack() {
        Main.setCurrentMenu(new StartMenu());
    }

    public void showMenu(){
       TextUI.sendMessage("\nWelcome To TextFlix!\n");

       //Choose user currentAccount
        Account a = Main.getCurrentAccount();

        ArrayList<String> list = new ArrayList<>(Arrays.asList("For user Management", "LibraryMenu", "Account", "Log out!"));

        boolean tryAgain = true;

        while(tryAgain) {
            int choice = TextUI.getUserInput("Please choose one is the option:", list);
            switch (choice) {
                case 1:
                    TextUI.sendMessage("User-settings");
                    tryAgain = false;
                    break;
                case 2:
                    new LibraryMenu();
                    tryAgain = false;
                    break;
                case 3:
                    TextUI.sendMessage("Account");
                    tryAgain = false;
                    break;
                case 4:
                    TextUI.sendMessage("Log out!");
                    tryAgain = false;
                    break;
                default:
                    TextUI.sendMessage("Invalid choice");
                    break;

            }
        }
    }


}
