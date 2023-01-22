package chap06.Singleton;

public class Client {
    public static void main(String[] args) {
        // private 생성자이므로 new를 통해 인스턴스를 생성할 수 없다.
        // Singleton s = new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        // 세 라인이 동일한 해쉬코드를 반환함. 참조변수 s1~s3이 모두 동일한 객체를 참조하고 있음

        s1 = null;
        s2 = null;
        s3 = null;
    }
}
