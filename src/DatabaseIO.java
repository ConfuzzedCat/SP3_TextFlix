import java.sql.*;
import java.util.ArrayList;

public class DatabaseIO implements IO {
    private static String hostname;
    private static String username = "root";
    private static String password;
    private static Connection connection;

    public static Account login(String username, String password) {
        return null;
    }

    public void setup(){
        hostname = "jdbc:mysql://localhost/textflix?" + "autoReconnect=true&useSSL=false";
        establishConnection();
        ArrayList<Media> movies = loadMovieData();
        ArrayList<Media> series = loadSerieData();
        movies.addAll(series);
        Catalogue.allMedia = movies;

        Account.setAccounts(loadAccountData());

    }

    @Override
    public void saveAccountData() {
        Account a = Main.getCurrentAccount();
        String query = "INSERT INTO textflix.acccounts (users, firstName, lastName, userName, password, email) VALUES ('" + Parser.serializeData(a.users, false) + "','" + a.firstName+ "','" +a.lastName+ "','" +a.userName+ "','"+a.password+"','"+a.email +"');";
        if(a.getSQLID() < 1) {
            query = "UPDATE textflix.accounts SET users='" + Parser.serializeData(a.users, false) + "' WHERE AccountID=" + a.getSQLID();
        }
        try{
            sendQuery(query);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void establishConnection() {
        // connection
        password = TextUI.getUserInput("Skriv dit MySQL server password.");
        try {
            connection = DriverManager.getConnection(hostname, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private ArrayList<Account> loadAccountData(){
        ArrayList<Account> results = new ArrayList<>();
        // statement
        String query = "SELECT * FROM textflix.accounts;";
        try {
            ResultSet resultSet = sendQuery(query);
            return Parser.parseAccountDataFromResultSet(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

    private ArrayList<Media> loadMovieData(){
        ArrayList<Media> results = new ArrayList<>();
        // statement
        String query = "SELECT * FROM textflix.movies;";
        try {
            ResultSet resultSet = sendQuery(query);
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

    private ArrayList<Media> loadSerieData(){
        ArrayList<Media> results = new ArrayList<>();
        // statement
        String query = "SELECT * FROM textflix.series;";
        try {
            ResultSet resultSet = sendQuery(query);
            return Parser.parseSerieDataFromResultSet(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

    public static ResultSet sendQuery(String query) throws SQLException {
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            // resultset
            return statement.executeQuery();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        throw new SQLException("No results found. :(");
    }

    public static ResultSet sendQuery(String query, String data) throws SQLException {
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, data);

            // resultset
            return statement.executeQuery();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        throw new SQLException("No results found. :(");
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