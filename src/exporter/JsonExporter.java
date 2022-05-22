package exporter;

import com.google.gson.Gson;
import model.Employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonExporter implements Exporter {
    private static final String FILEPATH = "JSONFILE.json";

    @Override
    public void export(List<Employee> employees) {
        String json = new Gson().toJson(employees);
        //todo try with resources

        try (FileWriter file = new FileWriter(FILEPATH);) {
            file.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("JSON file created: " + json);

    }
}



