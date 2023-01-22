package chap06.Template;

public class TemplatedDog extends Animal {
    @Override
    // 추상 메소드 오버라이딩
    void play() {
        System.out.println("멍! 멍!");
    }

    @Override
    // Hook 메소드 오버라이딩
    void runSometing() {
        System.out.println("멍! 멍!~ 꼬리 살랑 살랑~");
    }
}
