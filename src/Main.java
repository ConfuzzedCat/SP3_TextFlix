public class Main {
    private static Account currentAccount;
    public static void main(String[] args) {
        StartMenu sm = new StartMenu();
        sm.menu();
    }


    public static Account getCurrentAccount() {
        return currentAccount;
    }

    public static void setCurrentAccount(Account account) {
        currentAccount = account;
    }
}