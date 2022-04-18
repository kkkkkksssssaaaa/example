/**
 * ### 1.3 설계 개선하기
 *
 * - 관람객이라는 개념을 구현하는 클래스
 * */
public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }

}
