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

        String input = TextUI.getUserInput("Pick a category.");
        Category searchCategory = Category.findCategory(input);

        ArrayList<Media> searchResult = Catalogue.searchMedia(searchCategory);
        Media moviePickChoice = TextUI.sendMultipleChoicesMedia("Choose a movie.",searchResult);


        //TODO Gør så man har mulighed for enten at se filmen eller gemme den i favorit
        moviePickChoice.watch();
        TextUI.consumeLine();
        String inputChoice = TextUI.getUserInput("What's next?\nBrowse other movies? (1)\nBack to Main menu(2)");

        switch (inputChoice){
            case "1":
                new LibraryMenu();
                break;
            case "2":
                new MainMenu();
                break;

        }


    }
}

