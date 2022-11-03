import java.util.ArrayList;

public abstract class Media {

    int releaseYear;

    String name;

    //HOW TO ENUM?
    ArrayList<Category> category;

    double rating;

public Media(int releaseYear, String name, ArrayList<Category> category, double rating){

    this.releaseYear = releaseYear;
    this.name = name;
    this.category = category;
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
}