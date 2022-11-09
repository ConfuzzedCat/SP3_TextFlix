
import java.util.ArrayList;
import java.util.Arrays;



public class Account {
    private static ArrayList<Account> accounts;

    public ArrayList<User> getUsers() {
        return users;
    }

    private ArrayList<User> users;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;


    public ArrayList<Serie> getCurrentlyWatchingSeries() {
        return currentlyWatchingSeries;
    }

    public void setCurrentlyWatchingSeries(ArrayList<Serie> currentlyWatchingSeries) {
        this.currentlyWatchingSeries = currentlyWatchingSeries;
    }

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

    }
    public static Account login(){
        String username = TextUI.getUserInput("Please type your username.");
        String password = TextUI.getUserInput("Please type your password.");
        for (Account a:accounts){
            if(a.tryLogin(username, password)){
                return a;
            }
        }
        TextUI.sendMessage("No account found. Will start register you now.");
        return register(username, password);
    }
    private boolean tryLogin(String username, String password){


        // TODO Victor fix this
        String input = TextUI.getUserInput("Please type your username.");

        if(input.equalsIgnoreCase(username)){

            while (!input.equals(password)){

                TextUI.sendMessage("\nCredentials is correct!");

                return true;
            }
            TextUI.sendMessage( "Password was incorrect, please try again!" );
            return false;
        }
        return false;

    }
    public void addUser(String nickname, boolean isAdult){
        users.add(new User(nickname, isAdult));
    }
}
