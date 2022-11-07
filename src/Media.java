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




    public void watchLater(User user) {
        return;

    }

    public void removeFromWatchLater(User user){
        return;

    }

    public void addToPrevWatched(User user){
        return;

    }


    // Her viser vi information omkring fimen/serien når den bliver valgt.
    // Hvis vi vil ændre på hvordan informationen skrives ud, skal series og movies toString() ændres.
    public void showInfo(){
    TextUI.sendMessage(toString());

    }

}