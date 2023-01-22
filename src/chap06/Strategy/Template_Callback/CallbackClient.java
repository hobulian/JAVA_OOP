package chap06.Strategy.Template_Callback;

import chap06.Strategy.SoldierWithTemplate;

/* Template Callback
    전략을 익명 내부 클래스로 구현한 전략 패턴
 */
public class CallbackClient {
    public static void main(String[] args) {
        SoldierWithTemplate rambo = new SoldierWithTemplate();
/*         Soldier rambo = new Soldier();

       rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("총! 초초총! 총!");
            }
        });

        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("칼! 카카칼! 카알!");
            }
        });*/

        rambo.runContext("총! 초초초초총! 총!");
        System.out.println();

        rambo.runContext("칼! 카칼!!");
        System.out.println();

        rambo.runContext("쾅 콰쾅! 쾅!!");
    }
}
