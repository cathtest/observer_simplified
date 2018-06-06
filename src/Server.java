public interface Server {
    void process();
    void register(Client client);
}
