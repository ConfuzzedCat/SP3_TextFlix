import java.util.ArrayList;
import java.util.Scanner;

//fix
// fix

public class TextUI {
    static Scanner scan = new Scanner(System.in);

    /*
 - public static void sendMessage(String text);
 - public static void sendMultipleMessages(String[] lines);
 - public static void sendObejctAsMessage(Obejct obj);
 - public static string getUserInput(String prompt);

     */

    /*recieves a message and displays it to the user
        prompts the user for one input value
        returns the input
    */
    public static String getUserInput(String text){
        sendMessage(text);
        String input = scan.nextLine();
        return input;
    }

    public static void sendMultipleMessages(ArrayList<String> multipleMessages){
    for(String s : multipleMessages){
        sendMessage(s);
    }
    }

    public static int getUserInput(String msg, ArrayList<String> options){

        System.out.println(msg);

        for(int i = 0; i<options.size(); i++){

            sendMessage(i+1+". "+options.get(i));
        }
        int choice = scan.nextInt();
        return choice;

    }

    public static void sendObejctAsMessage(Object obj){
        sendMessage(obj.toString());
    }

    public static void sendMessage(String msg) {
        System.out.println("*********************");
        System.out.println(msg);
        System.out.println("*********************");
    }
}
