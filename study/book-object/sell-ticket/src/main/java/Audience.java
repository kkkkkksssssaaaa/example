/**
 * ### 1.1 티켓 판매 어플리케이션 구현하기
 *
 * - 관람객이라는 개념을 구현하는 클래스
 * */
public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
