import java.util.ArrayList;


public class Serie extends Media {

    ArrayList<Season> Seasons;
    int endYear;
    public Serie(int releaseYear, String name, ArrayList<Category> category, double rating, int endYear, ArrayList<Season> seasons) {
        super(releaseYear, name, category, rating);
        this.endYear = endYear;
        Seasons = seasons;
    }


    @Override
    public String toString() {
        if (endYear == -1) {
            return "Series" +
                    ", " + name + ',' +
                    " " + categories +
                    ", rating: " + rating +
                    ", release: " + releaseYear + '-' ;
        }
        return  "Series" +
                ", " + name + ',' +
                " " + categories +
                ", rating: " + rating +
                ", release: " + releaseYear + '-' + endYear +
                ". ";
    }

    @Override
    public void watch() {
        TextUI.sendMessage("You are now watching: "+ name);
    }
}
