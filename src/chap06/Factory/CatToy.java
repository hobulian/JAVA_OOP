package chap06.Factory;

// 팩토리 메소드가 생성할 객체
public class CatToy extends AnimalToy {
    public void identify() {
        System.out.println("나는 캣타워! 고양이의 친구!");
    }
}
