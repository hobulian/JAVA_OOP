package chap06.Proxy;

/* Proxy
    제어 흐름을 조정하기 위한 목적으로 중간에 대리자를 두는 패턴
 */
public class ClientWithProxy {
    public static void main(String[] args) {
        IService proxy = new Proxy();
        System.out.println(proxy.runSometing());
    }
}
