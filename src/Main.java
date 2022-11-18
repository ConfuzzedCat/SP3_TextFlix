public class Main {
    public static void main(String[] args) {
        io = new DatabaseIO(); // styrer om det skal være fra SQL server eller csv filer. DatabaseIO er sql/FileIO er csv.

        io.setup();
        Searcher searcher = new Searcher();



        new LibraryMenu();
        //Account.saveAccountData();
    }

    private static Account currentAccount;

    public static IO getIo() {
        return io;
    }

    private static IO io;

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