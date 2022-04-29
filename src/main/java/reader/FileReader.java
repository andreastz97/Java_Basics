package reader;

import model.Employee;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileReader {

    public void read(String filePath) {
        //List<String> myList = new ArrayList<String>();
        List<Employee> myList = new ArrayList();

        try {
            List<String> lines = Files.readAllLines( Path.of(filePath), StandardCharsets.UTF_8);
            lines.stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}