import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jan on 2016-05-15.
 */
public class ProductB implements Produkt {
    private List<Klient> _klient = new ArrayList<>();

    @Override
    public boolean dodajKlient(Klient k) {
        if (!_klient.contains(k)) {
            _klient.add(k);
            return true;
        }
        return false;
    }

    @Override
    public boolean usunKlienta(Klient k) {
        int index = _klient.indexOf(k);
        if (index != -1) {
            _klient.remove(index);
            return true;
        }
        return false;
    }
    @Override
    public void powiadomKlientow() {
        _klient.forEach((klient) -> klient.powiadom());
    }
}
