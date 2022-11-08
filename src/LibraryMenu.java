//fix
//


import java.util.ArrayList;
import java.util.Arrays;

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
       ArrayList<Category> allCategories = new ArrayList<>(Arrays.asList(Category.values()));
       String buffer = "";
       for(Category c : allCategories){
           buffer += c.toString()+", ";
       }
       TextUI.sendMessage(buffer);

        String input = TextUI.getUserInput("Hvilken genre vil du gerne se?");
        Category searchCategory = Category.findCategory(input);

        ArrayList<Media> searchResult = Catalogue.searchMedia(searchCategory);
        Media moviePickChoice = TextUI.sendMultipleChoicesMedia("Hvilken af disse film vil du se?",searchResult);

        moviePickChoice.watch();
        TextUI.consumeLine();
        String inputChoice = TextUI.getUserInput("Hvad vil du nu?\nBrowse andre film? (1)\nGå tilbage til Main Menu (2)");

        switch (inputChoice){
            case "1":
                new LibraryMenu();
                break;
            case "2":
                new MainMenu();
                break;

        }
        //TODO: Gør så man kan vælge de film man sorter efter.

    }
}

