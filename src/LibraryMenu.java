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

    //Muligt mindre problem i forhold til at hoppe rundt i menu'er
    // - og vi mistænker det er en consume-line ting, som vi ikke kan finde ud af at fikse i denne omgang. Måske bliver bufferen opbrugt.

    @Override
    public void showMenu() {
        String inputChoice = TextUI.getUserInput("What's next?\nBrowse media? (1)\nRecently watched Media(2)\nBack to Main menu(3)");

        switch (inputChoice){
            case "1":
                break;
            case "2":
            Main.getCurrentAccount().getUsers().get(0).showPreWatchedMedia();
            new LibraryMenu();
            break;
            case "3":
                new MainMenu();
                break;

        }

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
        TextUI.consumeLine(); //Skal gerne fjerne "new line", men gør at vi skal dobbelt-trykke enter.

        Main.getCurrentAccount().getUsers().get(0).addToWatchedMedia(moviePickChoice); //Adder til vores prev watched
        new LibraryMenu();

    }
}

