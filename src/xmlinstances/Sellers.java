package xmlinstances;

import model.Seller;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "sellers")
@XmlAccessorType (XmlAccessType.FIELD)
public class Sellers {

    @XmlElement(name = "seller")
    List<Seller> sellers = new ArrayList<>();

    public List<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }
}
