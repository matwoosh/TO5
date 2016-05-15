public class Main {

    public static void main(String[] args) {
        KlientA[] klient = new KlientA[10];
        ProduktA product = new ProduktA();
        Integer k = 501510666;
        for(int i = 0;i <10; i++){

            klient[i] = new KlientA(k.toString());
            product.dodajKlient(klient[i]);
            k+=101;
            k*=9;
            k=k%1000000000;
            k = Math.abs(k);
        }
        product.powiadomKlientow();

    }
}
