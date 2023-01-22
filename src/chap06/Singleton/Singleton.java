package chap06.Singleton;

/* Singleton
    클래스의 인스턴스, 즉 객체를 하나만 만들어 사용하는 패턴
 */
public class Singleton {
    static Singleton singletonObject; // 정적 참조 변수

    private Singleton() {}; // private 생성자

    //객체 반환 정적 메서드
    public static Singleton getInstance() {
        if (singletonObject == null) {
            singletonObject = new Singleton();
        }

        return singletonObject;
    }
}
