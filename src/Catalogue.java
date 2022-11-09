
import java.util.ArrayList;

public class Catalogue {
public static ArrayList<Media> searchMedia(Category c) {

    ArrayList<Media> returnMedia = new ArrayList<>();
    for(Media m : allMedia){
        for (Category category: m.categories) {
            if(category == c){

            returnMedia.add(m);
            }
        }
    }

    return returnMedia;

}

public static ArrayList<Media> allMedia;
public static void setupAllMedia(){
    ArrayList<String> data = FileIO.readDataLines("Data/Movies.csv");
    ArrayList<String> dataSeries = FileIO.readDataLines("Data/Series.csv");
    data.addAll(dataSeries); // Adder alt fra dataSeries over i data, så begge ting bliver gemt under data.

    allMedia = Parser.parseDataFromCsvMedia(data);
}
}

