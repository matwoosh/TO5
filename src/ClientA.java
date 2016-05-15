/**
 * Created by Jan on 2016-05-15.
 */
public class ClientA implements Client {
    private String phoneNumber;

    public ClientA(String number){
        phoneNumber = number;
    }

    @Override
    public void notifyClient(String productName) {
        System.out.println("Sending SMS about " + productName + " to " + phoneNumber);
    }
}
