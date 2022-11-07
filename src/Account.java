import java.util.ArrayList;
import java.util.Scanner;
//fix

public class Account {
    private static ArrayList<Account> accounts;
    private ArrayList<User> users;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;

    public Account(String firstName, String lastName, String userName, String password, String email, ArrayList<User> users) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.users = users;
    }
    private Account(){
        this.firstName = TextUI.getUserInput("Please enter your first name. ");
        this.lastName =  TextUI.getUserInput("Please enter your last name. ");
        this.userName =  TextUI.getUserInput("Please enter your user name. ");
        this.email =  TextUI.getUserInput("Please enter your email. ");
        this.password =  TextUI.getUserInput("Please enter your password. ");
        this.users = new ArrayList<>();
        this.users.add(new User());
        TextUI.sendMessage("Registration was successful!");
    }
    private Account(String userName, String password){
        this.firstName = TextUI.getUserInput("Please enter your first name. ");
        this.lastName =  TextUI.getUserInput("Please enter your last name. ");
        this.userName =  userName;
        this.email =  TextUI.getUserInput("Please enter your email. ");
        this.password =  password;
        this.users = new ArrayList<>();
        this.users.add(new User());
        TextUI.sendMessage("Registration was successful!");
    }
    public static void AddAccountToList(Account a){
        accounts.add(a);
    }
    public static Account register(String username, String password){
        Account newAccount = new Account(username, password);
        return newAccount;
    }
    public static Account register(){
        Account newAccount = new Account();
        return newAccount;
        /*
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter firstName => ");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.print(" Enter lastName => ");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

            System.out.print(" Enter userName => ");
            String userName = scanner.nextLine();
            register.setUserName(userName);

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.print(" Enter emailId => ");
            String emailId = scanner.nextLine();
            register.setEmailId(emailId);

            System.out.println("\n*****************************\n ");
            System.out.println("Registrations are successful!");
            System.out.println(register.toString());
        }
         */
    }
    public static Account login(String username, String password){
        for (Account a:accounts){
            if(a.tryLogin(username, password)){
                return a;
            }
        }
        TextUI.sendMessage("No account found. Will start register you now.");
        return register(username, password);
    }
    private boolean tryLogin(String username, String password){

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
