//fix
// fix
public class Main {
    public static void main(String[] args) {
        setCurrentAccount(Account.register());
        Catalogue.setupAllMedia();

        new LibraryMenu();
/*
        for(Media m : Catalogue.searchMedia(Category.CRIME)){
        m.showInfo();
        }
        currentMenu = new StartMenu();
        StartMenu sm = new StartMenu();
        sm.menu();*/

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