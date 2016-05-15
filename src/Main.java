import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ProductA productA = new ProductA("Product1");
        ProductB productB = new ProductB("Product2");

        ClientA[] clients = new ClientA[10];

        Integer k;
        Random r = new Random(System.currentTimeMillis());

        for (int i = 0; i < 10; i++) {
            k = ((1 + r.nextInt(9)) * 100000000 + r.nextInt(100000000));
            clients[i] = new ClientA(k.toString());
            if (k % 2 == 0) {
                productA.addClient(clients[i]);
            } else {
                productB.addClient(clients[i]);
            }
        }

        productA.notifyAllClients();
        productB.notifyAllClients();

    }
}
