import java.sql.*;
import java.util.ArrayList;

public class Searcher {
    public boolean checkForDatabase(IO ioMethod){
        if(ioMethod.getClass() == DatabaseIO.class){
            return true;
        }
        return false;
    }

    public ArrayList<Media> searchMedia(String prompt, IO io){
        ArrayList<Media> result = new ArrayList<>();
        if(false){ //checkForDatabase(io)){

            //TODO: spørg om det skal være film, serie eller begge.
            String data = "%"+ prompt + "%";
            try {
                ResultSet resultSet = DatabaseIO.sendQuery("SELECT * FROM textflix.series WHERE NAME LIKE ?",  data);
                return Parser.parseSerieDataFromResultSet(resultSet);
            } catch (SQLException e){
                e.printStackTrace();
            }
        }

        //bruge fileIO
        //parse prompt
        prompt = "(?i).*" + prompt +".*";
        for (Media m : Catalogue.allMedia) {
          if(m.name.matches(prompt)){
              result.add(m);
          }
        }
        return result;
    }
}
