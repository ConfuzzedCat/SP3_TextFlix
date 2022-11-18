import java.util.ArrayList;


public class Serie extends Media {

    ArrayList<Season> Seasons;
    int endYear;
    public Serie(String name, int releaseYear, ArrayList<Category> category, double rating, int endYear, ArrayList<Season> seasons) {
        super(name, releaseYear, category, rating);
        this.endYear = endYear;
        Seasons = seasons;
    }

    //Det "visuelle" i terminalen når det køres. Vigtigt for brugeren at det står pænt og overskueligt.
    //Forskel fra movies til series, er at serier har sæsoner som kører over flere år, og derfor også har et - muligt - endYear.

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
        TextUI.sendMessage("You are now watching serie: "+ name);
    }
}
