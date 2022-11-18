
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

//Data'en som programmet indlæser og brugeren kan vælge fra. Movies & series.
// Dataen bliver parset fra csv filen og til 'data'.

public static ArrayList<Media> allMedia;
public static void setupAllMedia(){

}
}

