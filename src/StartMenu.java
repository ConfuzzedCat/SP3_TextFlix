import java.util.Scanner;

//fix
// fix

public class StartMenu implements Menu {


    //Tekst menuen når man åbner TextFlix.
    //Flowet starter med at logge ind eller registrere sig. Vi bruger switch-cases til at få brugerens input,
    //- så programmet går derhen hvor brugeren ønsker.

    public void showMenu(){

        TextUI.sendMessage("Welcome to TextFlix!");
        TextUI.sendMessage("Please Login or Register.");

        String choice = TextUI.getUserInput("If you want to Login type: Login\nIf you want to register type: Register\nIf you want to close TextFlix type: Exit");

        switch(choice.toLowerCase()){
            case "login":
                Main.setCurrentAccount(Account.login());
                new MainMenu();

                break;

            case "register":
                Main.setCurrentAccount(Account.register());
                new MainMenu();

                break;
            case "exit":
                goBack();

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



