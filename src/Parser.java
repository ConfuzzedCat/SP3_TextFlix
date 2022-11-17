import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

//comment

import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;


//TODO Victor - comments til Parser

public class Parser {

    /// CSV
    // CSV -> Object
    public static ArrayList<Media> parseDataFromCsvMedia(ArrayList<String> data) {
        ArrayList<Media> media = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            String s = data.get(i);
            String[] values = s.split(";");
            String mediaName = values[0];
            int2 years = getYears(values[1]);
            int releaseYear = years.a;
            int endYear = years.b;
            ArrayList<Category> categories = getCategories(values[2]);

            double rating = Double.parseDouble(values[3].replace(",","."));
            Media m;

            if(values.length > 4){
                ArrayList<Season> seasons = parseSeasonDataFromCsv(values[4]);
                m = new Serie(mediaName, releaseYear, categories, rating, endYear, seasons);
            }
            else {
                m = new Movie(mediaName, releaseYear, categories, rating);
            }
            media.add(m);
        }
        return media;
    }

    // String -> Arraylist<Category>
    public static ArrayList<Category> getCategories(String data) {
        String[] categoriesData = data.split(",");
        ArrayList<Category> categories = new ArrayList<>();
        for(String s : categoriesData) {
            categories.add(Category.findCategory(s));
        }
        return categories;
    }
    public static int2 getYears(String data){
        String[] years = data.split("-");
        int releaseYear = Integer.parseInt(years[0].replace(" ",""));
        int endYear = -1;
        if(years.length > 1){
            String temp = years[1].replace(" ","");
            if(!temp.isEmpty()) {
                endYear = Integer.parseInt(temp);
            }
        }
        return new int2(releaseYear, endYear);
    }

    /// Json
    // Json -> Object
    public static ArrayList<Account> parseDataFromJsonAccount(String data){
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Account>>(){}.getType();

        ArrayList<Account> a = gson.fromJson(data, listType);
        if(a == null){
            return new ArrayList<>();
        }

        return a;
    }

    // Object -> Json
    public static String serializeMediaData(ArrayList<Media> data){
        return serializeData(data);
    }
    public static String serializeAccountData(ArrayList<Account> data){
        return serializeData(data);
    }
    private static String serializeData(Object obj){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();

        return gson.toJson(obj);
    }

    /// Misc parser
    public static ArrayList<Season> parseSeasonDataFromCsv(String data) {
        ArrayList<Season> returnData = new ArrayList<>();
        String[] values = data.split(",");
        for(int i = 0; i < values.length; i++){
            String[] seasonAndEpisode = values[i].split("-");
            returnData.add(new Season(Integer.parseInt(seasonAndEpisode[0].replace(" ","")), Integer.parseInt(seasonAndEpisode[1].replace(" ",""))));
        }
        return returnData;
    }
}
