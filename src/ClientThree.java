public class ClientThree implements Client {

    @Override
    public void print() {
        System.out.println(this + " " + "is registered");
    }
}
