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

    //TODO Rasmus gør den her toString pænt. Hvis "endYear" er "-1" så er serien ikke færdig.
    //
    @Override
    public String toString() {
        // if.....
        return "Series" +
                ", " + name + ',' +
                " " + categories +
                ", rating: " + rating +
                ", Year of release: " + releaseYear +
                '}';
    }

    @Override
    public void watch() {
        TextUI.sendMessage("You are now watching: "+ name);
    }
}
