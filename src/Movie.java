import java.util.ArrayList;

//fix
// fix

public class Movie extends Media {

    public Movie(int releaseYear, String name, ArrayList<Category> category, double rating) {
        super(releaseYear, name, category, rating);
    }

    //TODO Gøres pænt senere
    @Override
    public String toString() {
        return "Movie " +
                ", " + name + '\'' +
                ", " + categories +
                ", rating: " + rating +
                "Year of release: " + releaseYear +
                '}';
    }

    @Override
    public void watch() {

    }
}
