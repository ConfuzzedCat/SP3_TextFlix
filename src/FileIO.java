import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    //TODO: læs header fra csv filer
    public static ArrayList<String> readDataLines(String path) {

        File file = new File(path);

        ArrayList<String> data = new ArrayList<>();

        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                data.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            data = null;
        }
        return data;
    }

    public static String readData(String path) {

        File file = new File(path);

        String data = "";

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                data = data.concat(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            data = null;
        }
        return data;
    }

    public static boolean writeToFile(String path, String content) {

        try {
            FileWriter writer = new FileWriter(path);
            writer.write(content);

            writer.close();

        } catch (IOException e) {
            TextUI.sendMessage(e.toString());
        }

        return true;
    }
}
