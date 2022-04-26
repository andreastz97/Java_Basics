package reader;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*;

public class FileReader {
    public static void read() {
        //List<String> myList = new ArrayList<String>();
        List<String> myList = new ArrayList<String>();


        try {
            File myObj = new File("C:\\Users\\andre\\IdeaProjects\\MyProject\\target\\classes\\sampleDemoJava.txt");
            Scanner myReader = new Scanner(myObj);


            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                myList.add(data);
                for (int i = 0; i < myList.size(); i++) {

                }




                System.out.println(data);
            }
            myReader.close();
            System.out.println(myList);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}