//fix
// fix

public class User {
    private String nickname;
    private boolean isAdult;

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
        this.nickname =  TextUI.getUserInput("What would like to call this user?");
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
}