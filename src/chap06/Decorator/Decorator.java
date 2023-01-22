package chap06.Decorator;

public class Decorator implements IService {
    IService service;

    public String runSometing() {
        System.out.println("호출에 대한 장식이 주목적, 클라이언트에게 반환 결과에 장식을 더해 전달함");

        service = new Service();
        return "정말 "+service.runSometing();
    }
}
