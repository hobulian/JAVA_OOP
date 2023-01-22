package chap06.Strategy;

public class StrategyGun implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("탕! 타당! 타당!탕!");
    }
}
