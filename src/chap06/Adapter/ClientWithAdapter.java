package chap06.Adapter;

/* Adapter
    호출당하는 쪽의 메소드를 호출하는 쪽의 코드에 대응하도록 중간에 변환기를 통해 호출하는 패턴
 */
public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA sa1 = new AdapterServiceA();
        AdapterServiceB sb1 = new AdapterServiceB();

        sa1.runService();
        sb1.runService();
    }
}
