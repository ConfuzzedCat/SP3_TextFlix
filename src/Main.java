//fix
// fix
public class Main {
    private static Account currentAccount;
    public static void main(String[] args) {
        String test = "1992-";
        String[] t = test.split("-");
        System.out.println(t.length);
        for (String s:t) {
            System.out.println(s);
        }
        /*
        StartMenu sm = new StartMenu();
        sm.menu();
        */
    }


    public static Account getCurrentAccount() {
        return currentAccount;
    }

    public static void setCurrentAccount(Account account) {
        currentAccount = account;
    }
}