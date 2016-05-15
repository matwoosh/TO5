import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jan on 2016-05-15.
 */
public class KlientA implements Klient {
    private String _numerTelefonu;
    public KlientA(String telefon){
        _numerTelefonu = telefon;
    }
    @Override
    public void powiadom() {
        System.out.println("Wysyłam SMSa do " + _numerTelefonu);
    }
}
