import java.util.Scanner;

//fix
// fix

public class StartMenu implements Menu {

    public void showMenu(){
        //TODO: use Text

        TextUI.sendMessage("Welcome to TextFlix!");
        TextUI.sendMessage("Please Login or Register.");

        String choice = TextUI.getUserInput("If you want to Login type: Login\\nIf you want to register type: Register\"");

        switch(choice.toLowerCase()){
            case "login":
                Main.setCurrentAccount(Account.login());

                break;
            case "register":
                Main.setCurrentAccount(Account.register());

                //TODO:
                // Giv adgang til brugeren

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



