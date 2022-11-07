//fix
// fix
public class Main {
    public static void main(String[] args) {
        Catalogue.setupAllMedia();
        for(Media m : Catalogue.searchMedia(Category.CRIME)){
        m.showInfo();
        }
        /*StartMenu sm = new StartMenu();
        sm.menu();*/

    }
    private static Account currentAccount;

    public static Account getCurrentAccount() {
        return currentAccount;
    }

    public static void setCurrentAccount(Account currentAccount) {
        Main.currentAccount = currentAccount;
    }
}