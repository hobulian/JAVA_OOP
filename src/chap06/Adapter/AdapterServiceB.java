package chap06.Adapter;

public class AdapterServiceB {
    ServiceB sb1 = new ServiceB();
    void runService() {
        sb1.runServiceB();
    }
}
