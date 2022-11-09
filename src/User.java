//fix
// fix

import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String nickname;
    private boolean isAdult;
    private ArrayList<Serie> currentlyWatchingSeries;

    public User(String nickname, boolean isAdult) {
        this.nickname = nickname;
        this.isAdult = isAdult;
    }
    public User() {
        askForNickname();
        askIfAdult();
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isAdult() {
        return isAdult;
    }
    public void askForNickname(){
        this.nickname =  TextUI.getUserInput("Choose your nickname.");
    }
    public void askIfAdult(){
        boolean tryAgain = false;
        do {
            String input = TextUI.getUserInput("Are you over 18? (Y)es / (N)o.");
            switch (input.toLowerCase()){
                case "y":
                case "yes":
                    this.isAdult = true;
                    break;
                case "n":
                case "no":
                    this.isAdult = false;
                    break;
                default:
                tryAgain = true;
            }

        } while (tryAgain);
    }
    public ArrayList<Media> prevWatchedMedia() {
    if(){

    }

        return null;
    }


    //TODO Færdiggør så den gemmer de serier man ser
    public ArrayList<Serie> getCurrentlyWatchingSeries() {
        return currentlyWatchingSeries;
    }

    public void setCurrentlyWatchingSeries(ArrayList<Serie> currentlyWatchingSeries) {
        this.currentlyWatchingSeries = currentlyWatchingSeries;
    }

    public void addSeriesToCurrentlyWatchingSeries(Serie currentSerie, Season currentSeason, int currentEpisode){
        for(int i = 0; i < currentlyWatchingSeries.size(); i++){
            if(currentlyWatchingSeries.get(i).name.equalsIgnoreCase(currentSerie.name)){

            }
        }
        currentlyWatchingSeries.add(new Serie(currentSerie.releaseYear,currentSerie.name,currentSerie.categories,currentSerie.rating,currentSerie.endYear,new ArrayList<>(Arrays.asList(currentSeason))));
    }
}
