public class Main {
    public static void main(String[] args) {
        DatabaseIO.setup();

        setup();
        new StartMenu();
        Account.saveAccountData();
    }
    public static void setup(){
        Account.loadAccounts();
        Catalogue.setupAllMedia();
    }
    private static Account currentAccount;

    public static Account getCurrentAccount() {
        return currentAccount;
    }

    private static Menu currentMenu;

    public static Menu getCurrentMenu() {
        return currentMenu;
    }

    public static void setCurrentMenu(Menu currentMenu) {
        Main.currentMenu = currentMenu;
    }

    public static void setCurrentAccount(Account currentAccount) {
        Main.currentAccount = currentAccount;
    }
}