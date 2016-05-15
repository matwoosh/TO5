import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jan on 2016-05-15.
 */
public class ProductB implements Product {
    private final String productName;
    private List<Client> clients = new ArrayList<>();

    public ProductB(String name) {
        productName = name;
    }

    @Override
    public boolean addClient(Client k) {
        if (!clients.contains(k)) {
            clients.add(k);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteClient(Client k) {
        int index = clients.indexOf(k);
        if (index != -1) {
            clients.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public void notifyAllClients() {
        for (Client c : clients) {
            c.notifyClient(productName);
        }
    }
}
