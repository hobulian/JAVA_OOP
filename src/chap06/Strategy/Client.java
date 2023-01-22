package chap06.Strategy;

/* Strategy
    클라이언트가 전략을 생성해 전략을 실행할 컨텍스트에 주입하는 패턴
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        // 총을 람보에게 전달해 전투를 하게 한다.
        strategy = new StrategyGun();
        rambo.runContext(strategy);
        System.out.println();

        // 검을 람보에게 전달해 전투를 하게 한다.
        strategy = new StrategySword();
        rambo.runContext(strategy);
        System.out.println();
    }
}
