package exporter;

import model.*;
import xmlinstances.Managers;
import xmlinstances.Sellers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

import java.util.ArrayList;
import java.util.List;

public class XmlExporter implements Exporter {
    private static final String FILE_PATH = "role.xml";

    public void export(List<Employee> employees) {
        List<Manager> managers = new ArrayList<>();
        List<Seller> sellers = new ArrayList<>();
        if (!employees.isEmpty() && employees.get(0) instanceof Manager) {
            for (Employee employee : employees
            ) {
                managers.add((Manager) employee);
            }
        }
        try {
            JAXBContext context = JAXBContext.newInstance(Managers.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            File file = new File(FILE_PATH);
            Managers wrapperManager = new Managers();
            wrapperManager.setManagers(managers);
            marshaller.marshal(wrapperManager, file);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
        if (!employees.isEmpty() && employees.get(0) instanceof Seller) {
            for (Employee employee :
                    employees) {
                sellers.add((Seller) employee);
            }
            try {
                JAXBContext context = JAXBContext.newInstance(Sellers.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

                File file = new File(FILE_PATH);
                // create  object
                Sellers wrapperSeller = new Sellers();
                wrapperSeller.setSellers(sellers);
                // convert book object to XML file
                marshaller.marshal(wrapperSeller, file);

            } catch (JAXBException ex) {
                ex.printStackTrace();
            }
        }
    }
}
