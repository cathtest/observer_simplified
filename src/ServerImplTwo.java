import java.util.Date;

public class ServerImplTwo implements Server {

    @Override
    public void process() {

        Date currentDate = new Date();
        System.out.println(currentDate);

    }

    @Override
    public void register(Client client) {







    }
}
