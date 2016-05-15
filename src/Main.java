public class Main {

    public static void main(String[] args) {

        ClientA[] clients = new ClientA[10];
        ProductA productA = new ProductA("Product1");
        ProductB productB = new ProductB("Product2");
        Integer k = 501510666;
        for (int i = 0; i < 10; i++) {
            clients[i] = new ClientA(k.toString());
            if (k % 2 == 0) {
                productA.addClient(clients[i]);
            } else {
                productB.addClient(clients[i]);
            }
            k += 101;
            do{
                k *= 9;
            } while(k < 1000000000);

            k = k % 1000000000;
            k = Math.abs(k);
        }
        productA.notifyAllClients();
        productB.notifyAllClients();

    }
}
