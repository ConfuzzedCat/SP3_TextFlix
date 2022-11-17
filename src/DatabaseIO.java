import java.sql.*;
import java.util.ArrayList;

public class DatabaseIO {
    private static String hostname;
    private static String username = "root";
    private static String password;
    private static Connection connection;

    public static void setup(){
        hostname = "jdbc:mysql://localhost/textflix?" + "autoReconnect=true&useSSL=false";
        establishConnection();
        for (Media m : loadMovieData()){
            m.watch();
        }
    }
    private static void establishConnection() {
        // connection
        password = TextUI.getUserInput("Skriv dit MySQL server password.");
        try {
            connection = DriverManager.getConnection(hostname, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Media> loadMovieData(){
        ArrayList<Media> results = new ArrayList<>();
        // statement
        String query = "SELECT * FROM textflix.?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,"moVies");

            // resultset
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                String Name = resultSet.getString("Name");
                int Years = resultSet.getInt("ReleaseYear");
                String stringCategory = resultSet.getString("Category");
                double Rating = resultSet.getDouble("Rating");
                //String Seasons = resultSet.getString("Seasons");
                ArrayList<Category> categories = Parser.getCategories(stringCategory);

                //Arrayliste af vores media
                Media m = new Movie(Name, Years, categories, Rating);
                results.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

}


/*
import javax.xml.catalog.CatalogResolver;
import java.awt.image.AreaAveragingScaleFilter;
import java.sql.*;
import java.util.ArrayList;


public class WorldDB {
    // Load 10 cities from DB. (database)
    Connection connection;
    String url = "jdbc:mysql://localhost/textflix?" + "autoReconnect=true&useSSL=false";
    String username = "root";
    String password = "mysql123";
    private ArrayList<Movie> movies = new ArrayList<>();

    public void run() {
        // connection
        establishConnection();
        // statement
        String query = "SELECT * FROM movies";
        try {
            Statement statement = this.connection.createStatement();
            statement.execute(query);

            // resultset
            ResultSet resultSet = statement.getResultSet();

            while(resultSet.next()) {
                String Name = resultSet.getString("Name");
                int Years = resultSet.getInt("ReleaseYear");
                String Category = resultSet.getString("Category");
                double Rating = resultSet.getDouble("Rating");
                //String Seasons = resultSet.getString("Seasons");


                //Arrayliste af vores byer
                Movie movie = new Movie(Name, Years, Category, Rating);
                this.movies.add(movie);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
// verify via sout
        printSeries();
    }
private void printSeries(){
        for(Movie s : this.movies){
            s.watch();
        }
}

    private void establishConnection() {
        // connection
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
*/