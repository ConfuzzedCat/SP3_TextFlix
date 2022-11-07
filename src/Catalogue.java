
import java.util.ArrayList;

public class Catalogue {
public static ArrayList<Media> searchMedia(Category c) {
    ArrayList<Media> returnMedia = new ArrayList<>();
    for(Media m : allMedia){
        for (Category category: m.category) {
            if(category == c){

            returnMedia.add(m);
            }
        }
    }

    return returnMedia;

}

public static ArrayList<Media> allMedia;
public static void setupAllMedia(){
//TODO Husk at rette til den rigtige path ift movies & series
    ArrayList<String> data = FileIO.readDataLines("Movies.csv");
    ArrayList<String> dataSeries = FileIO.readDataLines("Series.csv");
    data.addAll(dataSeries); // Adder alt fra dataSeries over i data, så begge ting bliver gemt under data.

    allMedia = Parser.parseDataFromCsvMedia(data);
}
}

