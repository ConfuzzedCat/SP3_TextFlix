import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {


    public ArrayList<String> readDataLines(String path) {

        File file = new File(path);

        ArrayList<String> data = new ArrayList<>();

        try {
            Scanner input = new Scanner(file);
            input.nextLine();

            while (input.hasNextLine()) {
                data.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            data = null;
        }
        return data;
    }

    public String readData(String path) {

        File file = new File(path);

        String data = "";

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();
            while (scan.hasNextLine()) {
               data = data.concat(scan.nextLine()+ "/n");
            }
        } catch (FileNotFoundException e) {
            data = null;
        }
        return data;
    }





}

