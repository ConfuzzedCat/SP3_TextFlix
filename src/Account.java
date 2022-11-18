
import java.util.ArrayList;
import java.util.Arrays;



public class Account {
    public static ArrayList<Account> getAccounts() {
        return accounts;
    }

    public static void setAccounts(ArrayList<Account> accounts) {
        Account.accounts = accounts;
    }

    private static ArrayList<Account> accounts = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<User> users;
    public String firstName;
    public String lastName;
    public String userName;
    public String password;
    public String email;




    public Account(String firstName, String lastName, String userName, String password, String email, ArrayList<User> users) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.users = users;
    }
    private Account(){
    }
    private Account(String userName, String password){
        this.firstName = TextUI.getUserInput("Please enter your first name. ");
        this.lastName =  TextUI.getUserInput("Please enter your last name. ");
        this.userName =  userName;
        this.email =  TextUI.getUserInput("Please enter your email. ");
        this.password =  password;
        this.users = new ArrayList<>();
        this.users.add(new User(true));
        TextUI.sendMessage("Registration was successful!");
    }
    public static void AddAccountToList(Account a){
        accounts.add(a);
        saveAccountData();
    }
    public static void saveAccountData(IO  io){
        //FileIO.writeToFile("Data/Accounts.json", Parser.serializeAccountData(accounts));
        //TODO: Bruge io saveAccountData()
    }
    public static Account register(String username, String password){
        Account newAccount = new Account(username, password);
        AddAccountToList(newAccount);
        return newAccount;
    }
    public static Account register(){
        String username = TextUI.getUserInput("Please type your username.");
        String password = TextUI.getUserInput("Please type your password.");
        Account newAccount = new Account(username, password);
        AddAccountToList(newAccount);
        return newAccount;

    }
    public static Account login(){
        String username = TextUI.getUserInput("Please type your username.");
        String password = TextUI.getUserInput("Please type your password.");
        if( accounts == null || accounts.size() == 0){
            TextUI.sendMessage("No accounts in database, will start registering you now.");
            return register(username, password);
        }
        for (Account a:accounts){
            if(a.tryLogin(username, password)){
                return a;
            }
        }
        TextUI.sendMessage("No account found. Will start register you now.");
        return register(username, password);
    }
    private boolean tryLogin(String username, String password){
        if(this.userName.equalsIgnoreCase(username)){

            while (!this.password.equals(password)){

                TextUI.sendMessage( "Password was incorrect, please try again!" );
                password = TextUI.getUserInput("Please type your password again.");
            }
            TextUI.sendMessage("\nCredentials is correct!");
            return true;

        }
        return false;

    }
    public void addUser(String nickname, boolean isAdult){
        users.add(new User(nickname, isAdult));
    }
}
