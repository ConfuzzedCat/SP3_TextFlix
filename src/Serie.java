import java.util.ArrayList;

//fix
// fix

public class Serie extends Media {

    //TODO: orden arraylist af seasons
    ArrayList<Season> Seasons;
    int endYear;
    public Serie(int releaseYear, String name, ArrayList<Category> category, double rating, int endYear, ArrayList<Season> seasons) {
        super(releaseYear, name, category, rating);
        this.endYear = endYear; //TODO: kan komme tilbage -1, hvis serien ikke er sluttet.
        Seasons = seasons;
    }

    //TODO: Gøres pænt senere
    @Override
    public String toString() {
        return "Series" +
                ", " + name + '\'' +
                ", " + category +
                ", rating: " + rating +
                "Year of release: " + releaseYear +
                '}';
    }

    @Override
    public void watch() {

    }
}
