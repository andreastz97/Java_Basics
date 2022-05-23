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
        private static final String FILEPATH = "role.xml";
    public void export(List<Employee> employees) {
        List<Manager> managers = new ArrayList<>();
        List<Seller> sellers = new ArrayList<>();

        if (!employees.isEmpty() && employees.get(0) instanceof Manager) {
            for (int i = 0; i < employees.size(); i++) {
                managers.add((Manager) employees.get(i));
            }
        }

        try {
            // create an instance of `JAXBContext`
            JAXBContext context = JAXBContext.newInstance(Managers.class);

            // create an instance of `Marshaller`
            Marshaller marshaller = context.createMarshaller();

            // enable pretty-print XML output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // create XML file
            //todo remove magic string
            File file = new File(FILEPATH);

            // create  object
            Managers wrapperManager = new Managers();
            wrapperManager.setManagers(managers);



            // convert book object to XML file
            marshaller.marshal(wrapperManager, file);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }

        if (!employees.isEmpty() && employees.get(0) instanceof Seller) {
            for (int i = 0; i < employees.size(); i++) {
                sellers.add((Seller) employees.get(i));
            }
            try {
                // create an instance of `JAXBContext`
                JAXBContext context = JAXBContext.newInstance(Sellers.class);

                // create an instance of `Marshaller`
                Marshaller marshaller = context.createMarshaller();

                // enable pretty-print XML output
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

                // create XML file
                //todo remove magic string
                File file = new File(FILEPATH);

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
