/**
 * Created by Jan on 2016-05-15.
 */
public interface Product {

    boolean addClient(Client k);

    boolean deleteClient(Client k);

    void notifyAllClients();

}
