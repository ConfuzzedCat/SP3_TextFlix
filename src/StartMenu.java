import java.util.Scanner;

public class StartMenu implements Menu {

    public void menu(){

        System.out.println("Welcome to TextFlix!");
        System.out.println("Please Login or Register.");
        System.out.println("If you want to Login type: Login\nIf you want to register type: Register");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch(choice.toLowerCase()){
            case "login":
            System.out.println("Type username");
            scanner.nextLine();
                System.out.println("Type password");
                scanner.nextLine();

                //TODO
                /*
                if(username&&password == correct){
                    grant access lol
                }
                */
                break;
            case "register":
                System.out.println("To register please type a username");
                scanner.nextLine();
                System.out.println("Please type a password");
                scanner.nextLine();

                //TODO
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



