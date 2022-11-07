//fix
//



public class LibraryMenu implements Menu {

    @Override
    public void goBack() {
    Main.setCurrentMenu(new MainMenu());

    }

    public LibraryMenu() {
        this.showMenu();
    }

    @Override
    public void showMenu() {
        //TODO: udfyld method krop
    }
}

