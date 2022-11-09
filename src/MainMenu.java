import java.util.ArrayList;
import java.util.Arrays;

// Main-menuen når man er videre fra at logge ind.
// Herinde præsenteres brugeren for diverse muligheder. Settings, media-biblioteket, account og log-out.
// Programmet er sat op således at det kun - for nu i SP3 - er media-biblioteket der kan tilgåes, og de 3 andre
// - vil være noget vi f.eks. kunne tilføje til en SP3+ opgave.
// Vi bruger, ligesom i StartMenu, switch-cases til at læse brugerens input og hvor de vil hen.

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

        ArrayList<String> list = new ArrayList<>(Arrays.asList("User-settings", "Library Menu", "Account", "Log out!"));

        boolean tryAgain = true;

        while(tryAgain) {
            int choice = TextUI.getUserInput("Please choose one option: ", list);
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
