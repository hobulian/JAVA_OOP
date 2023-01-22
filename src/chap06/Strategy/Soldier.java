package chap06.Strategy;

public class Soldier {
    public void runContext(Strategy strategy) {
        System.out.println("전투 시작!");
        strategy.runStrategy();
        System.out.println("전투 종료!");
    }
}
