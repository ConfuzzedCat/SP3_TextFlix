import java.sql.*;

public class Searcher {
    public boolean checkForDatabase(IO ioMethod){
        if(ioMethod.getClass() == DatabaseIO.class){
            return true;
        }
        return false;
    }

    public Media searchMedia(String prompt){
        
    }
}
