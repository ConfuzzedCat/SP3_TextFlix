import java.util.ArrayList;


public abstract class Media {

    int releaseYear;

    String name;

    //HOW TO ENUM?
    ArrayList<Category> categories;

    double rating;

public Media(int releaseYear, String name, ArrayList<Category> categories, double rating){

    this.releaseYear = releaseYear;
    this.name = name;
    this.categories = categories;
    this.rating = rating;

}


    public abstract void watch();



// Metoderne bliver brugt i SP3+
    public void watchLater(User user) {

    }

    public void removeFromWatchLater(User user){

    }

    public void addToPrevWatched(User user){

    }


    // Her viser vi information omkring filmen/serien når den bliver valgt.
    // Hvis vi vil ændre på hvordan informationen skrives ud, skal series og movies toString() ændres.
    public void showInfo(){
    TextUI.sendMessage(toString());

    }

}