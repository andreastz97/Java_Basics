package exporter;

import model.Employee;

import java.util.List;

public interface Exporter {

    void export(List<Employee> employees);

}
