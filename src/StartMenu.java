import java.util.Scanner;

//fix
// fix

public class StartMenu implements Menu {


    //Tekst menuen når man åbner Textflix. Flowet starter med at logge ind eller registrere sig. Vi bruger switchcase til at få user input,
    //så programmet går derhen hvor brugeren ønsker.
    public void showMenu(){

        TextUI.sendMessage("Welcome to TextFlix!");
        TextUI.sendMessage("Please Login or Register.");

        String choice = TextUI.getUserInput("If you want to Login type: Login\\nIf you want to register type: Register\"");

        switch(choice.toLowerCase()){
            case "login":
                Main.setCurrentAccount(Account.login());
                new MainMenu();

                break;

            case "register":
                Main.setCurrentAccount(Account.register());
                new MainMenu();

                break;

            default:
                TextUI.sendMessage("Invalid input.");
                break;

        }
    }

    public StartMenu() {
        this.showMenu();
    }

    @Override
    public void goBack() {
    System.exit(1);
    }


}



