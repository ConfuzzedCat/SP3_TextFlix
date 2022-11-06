import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

/*
 * public ArrayList<Media> parseDataFromJsonMedia(string data);
 - public ArrayList<Media> parseDataMedia(string[] data);
 * public Account parseDataFromJsonAccount(string data);
 - public Account parseDataAccount(string[] data);
 * public String serializeData(ArrayList<Media> data);
 * public String serializeData(Account data);
*/

public class Parser {
    public static ArrayList<Media> parseDataFromJsonMedia(String data){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        return gson.fromJson(data, ArrayList.class);
    }
    public static Account parseDataFromJsonAccount(String data){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        return gson.fromJson(data, Account.class);
    }
    public static String serializeData(ArrayList<Media> data){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();

        return gson.toJson(data);
    }
    public static String serializeData(Account data){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();

        return gson.toJson(data);
    }
}
