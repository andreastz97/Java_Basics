package exporter;

import model.Employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Exporter {

    void export(List<Employee> employees) throws FileNotFoundException, IOException;
}
