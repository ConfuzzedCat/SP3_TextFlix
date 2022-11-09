import java.util.ArrayList;


public class Movie extends Media {

    public Movie(int releaseYear, String name, ArrayList<Category> category, double rating) {
        super(releaseYear, name, category, rating);
    }

//Det "visuelle" i terminalen når det køres. Vigtigt for brugeren at det står pænt og overskueligt.

    @Override
    public String toString() {
        return "Movie" +
                ", " + name + ',' +
                " " + categories +
                ", rating: " + rating +
                ", release: " + releaseYear +
                '.';
    }

    @Override
    public void watch() {
    TextUI.sendMessage("You are now watching: "+ name);
    }
}
