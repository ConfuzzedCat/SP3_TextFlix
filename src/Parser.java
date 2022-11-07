import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//comment

import java.util.ArrayList;

/*
 * public ArrayList<Media> parseDataFromJsonMedia(string data);
 * public ArrayList<Media> parseDataMedia(string[] data);
 * public Account parseDataFromJsonAccount(string data);
 - public Account parseDataAccount(string[] data); //TODO: overvej om vi skal bruge denne.
 * public String serializeData(ArrayList<Media> data);
 * public String serializeData(Account data);
*/

public class Parser {

    /// CSV
    // CSV -> Object
    public static ArrayList<Media> parseDataFromCsvMedia(ArrayList<String> data) {
        ArrayList<Media> media = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            String s = data.get(i);
            String[] values = s.split(";");
            String mediaName = values[0];
            String[] years = values[1].split("-");
            int releaseYear = Integer.parseInt(years[0]);
            int endYear = -1;
            if(years.length > 1){
                endYear = Integer.parseInt(years[1]);
            }
            //TODO: får de rigtige category
            String[] categoreis = values[2].split(",");

            double rating = Double.parseDouble(values[3]);
            Media m;
            //TODO: fix at den ikke bare laver en tom arraylist for category
            if(values.length > 4){
                ArrayList<Season> seasons = parseSeasonDataFromCsv(values[4]);
                m = new Serie(releaseYear, mediaName, new ArrayList<>(), rating, endYear, seasons);
            }
            else {
                m = new Movie(releaseYear, mediaName, new ArrayList<>(), rating);
            }
            media.add(m);
        }
        return media;
    }

    /// Json
    // Json -> Object
    public static ArrayList<Media> parseDataFromJsonMedia(String data){
        return stringToJson(data, ArrayList.class);
    }
    public static Account parseDataFromJsonAccount(String data){
        return stringToJson(data, Account.class);
    }
    private static <T> T stringToJson(String data, Class<T> type){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        return gson.fromJson(data, type);
    }

    // Object -> Json
    public static String serializeMediaData(ArrayList<Media> data){
        return serializeData(data);
    }
    public static String serializeAccountData(Account data){
        return serializeData(data);
    }
    private static String serializeData(Object obj){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();

        return gson.toJson(obj);
    }

    /// Misc parser
    private static ArrayList<Season> parseSeasonDataFromCsv(String data) {
        ArrayList<Season> returnData = new ArrayList<>();
        String[] values = data.split(",");
        for(int i = 0; i < values.length; i++){
            String[] seasonAndEpisode = values[i].split("-");
            returnData.add(new Season(Integer.parseInt(seasonAndEpisode[0]), Integer.parseInt(seasonAndEpisode[1])));
        }
        return returnData;
    }
}