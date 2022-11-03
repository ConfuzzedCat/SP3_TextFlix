import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private ArrayList<User> users;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;

    public Account(String firstName, String lastName, String userName, String password, String emailId, ArrayList<User> users) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.emailId = emailId;
        this.users = users;
    }

    public boolean login(String username, String password){

        //TODO: Brug TextUI.getUserInput istedet!
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if(input.equalsIgnoreCase(username)){
            input = scan.nextLine();
            while (!input.equals(password)){
                //TODO: brug TextUI sendMessage!
                System.out.println( "\nCredentials is correct!" );
                return true;
            }
            System.out.println( "Password was incorrect, please try again!" );
            return false;
        }
        return false;

        /* //TODO: Put ud i main eller en anden class
        while (!login) {
            System.out.print("Please Enter Your Name: ");
            username = scan.nextLine();

            System.out.print("Please Enter Your password: ");
            password = scan.nextLine();

            if (username.equals("De flotte drenge") && password.equals("As1234")) {
                System.out.println("\nAccess accepted!");
                System.out.println("Welcome To TextFlix!");
                login = true;

            } else {
                System.out.println("User name or Password is incorrect!");
                System.out.println("Please try again!");


            }
        }*/
    }
    public void addUser(String nickname, boolean isAdult){
        users.add(new User(nickname, isAdult));
    }
}
