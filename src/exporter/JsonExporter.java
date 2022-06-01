package exporter;

import com.google.gson.Gson;
import model.Employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonExporter implements Exporter {
    private static final String FILEPATH = "JSONFILE.json";
    @Override
    public void export(List<Employee> employees)  throws IOException {
        String json = new Gson().toJson(employees);
        try (FileWriter file = new FileWriter(FILEPATH)) {
            file.write(json);
        }
    }
}



