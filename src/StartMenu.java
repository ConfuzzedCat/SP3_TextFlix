import java.util.Scanner;

//fix
// fix

public class StartMenu implements Menu {

    public void menu(){
        //TODO: use Text

        System.out.println("Welcome to TextFlix!");
        System.out.println("Please Login or Register.");
        System.out.println("If you want to Login type: Login\nIf you want to register type: Register");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch(choice.toLowerCase()){
            case "login":
            System.out.println("Type username");
            String username = scanner.nextLine();
                System.out.println("Type password");
                String password = scanner.nextLine();
                Main.setCurrentAccount(Account.login(username, password));

                //TODO:
                /*
                if(username&&password == correct){
                    grant access lol
                }
                */
                break;
            case "register":
                Main.setCurrentAccount(Account.register());

                //TODO:
                // Giv adgang til brugeren

                break;

            default:
                System.out.println("Invalid number");
                break;

        }
    }

    @Override
    public void showMenu() {

    }
}



