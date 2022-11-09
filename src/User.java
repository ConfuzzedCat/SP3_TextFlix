//fix
// fix



import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String nickname;
    private boolean isAdult;
    private ArrayList<Serie> currentlyWatchingSeries;
    public ArrayList<Media> prevWatchedMedia;

    public ArrayList<Media> getPrevWatchedMedia() {
        return prevWatchedMedia;
    }

    public void setPrevWatchedMedia(ArrayList prevWatchedMedia) {
        this.prevWatchedMedia = prevWatchedMedia;
    }

    public User(String nickname, boolean isAdult) {
        this.nickname = nickname;
        this.isAdult = isAdult;
        this.prevWatchedMedia = new ArrayList<>();
    }
    public User(boolean a) {
        askForNickname();
        askIfAdult();
        this.prevWatchedMedia = new ArrayList<>();

    }
    public User(){

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

        public void addToWatchedMedia(Media watchedMedia) {
        if(!prevWatchedMedia.contains(watchedMedia)){
        prevWatchedMedia.add(watchedMedia);
    }

    }
    public void showPreWatchedMedia(){
    for(Media m: prevWatchedMedia){

        m.showInfo();
    }
    }


    //TODO Færdiggør så den gemmer de serier man ser
    public ArrayList<Serie> getCurrentlyWatchingSeries() {
        return currentlyWatchingSeries;
    }

    public void setCurrentlyWatchingSeries(ArrayList<Serie> currentlyWatchingSeries) {
        this.currentlyWatchingSeries = currentlyWatchingSeries;
    }

//TODO Fix til SP3+
    public void addSeriesToCurrentlyWatchingSeries(Serie currentSerie, Season currentSeason, int currentEpisode){
        for(int i = 0; i < currentlyWatchingSeries.size(); i++){
            if(currentlyWatchingSeries.get(i).name.equalsIgnoreCase(currentSerie.name)){

            }
        }
        currentlyWatchingSeries.add(new Serie(currentSerie.releaseYear,currentSerie.name,
                currentSerie.categories,currentSerie.rating,currentSerie.endYear,new ArrayList<>(Arrays.asList(currentSeason))));
    }
}
