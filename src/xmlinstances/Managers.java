package xmlinstances;

import model.Manager;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "managers")
@XmlAccessorType (XmlAccessType.FIELD)
public class Managers {

    @XmlElement(name = "manager")
    List<Manager> managers = new ArrayList<>();

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }
}
