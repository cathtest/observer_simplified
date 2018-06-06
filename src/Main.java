public class Main {

    public static void main(String[] args) {
        Server server1 = new ServerImplOne();
        Server server2 = new ServerImplTwo();
        Client client1 = new ClientOne();
        Client client2 = new ClientTwo();
        Client client3 = new ClientThree();
        Client client4 = new ClientFour();
        server1.register(client1);
        server1.register(client2);
        server1.register(client3);
        server2.register(client2);
        server2.register(client4);
        client1.print();
        client2.print();
        client3.print();
        client4.print();
        for (int i = 0; i < 10; i++) {

            server1.process();
            server2.process();


            try {
                Thread. sleep (2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}