package exporter;

import model.Employee;
import model.Employees;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class XmlExporter implements Exporter {

    public void export(List<Employee> employees) {
        try {
            // create an instance of `JAXBContext`
            JAXBContext context = JAXBContext.newInstance(Employees.class);

            // create an instance of `Marshaller`
            Marshaller marshaller = context.createMarshaller();

            // enable pretty-print XML output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // create XML file
            File file = new File("role.xml");

            // create  object
            Employees wrapperEmployee = new Employees();
            wrapperEmployee.setEmployees(employees);

            // convert book object to XML file
            marshaller.marshal(wrapperEmployee, file);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }

    }
}
