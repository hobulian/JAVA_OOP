package chap06.Factory;

/* Factory
    오버라이드된 메소드가 객체를 반환하는 패턴
 */
public class Driver {
    public static void main(String[] args) {
        // 팩토리 메소드를 보유한 객체들 생성
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        // 팩토리 메소드가 반환하는 객체들
        AnimalToy boltBall = bolt.getToy();
        AnimalToy kittyTower = kitty.getToy();

        // 팩토리 메소드가 반환한 객체들 사용
        boltBall.identify();
        kittyTower.identify();
    }
}
