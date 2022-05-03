package screen;

/**
 * ### 2.2 객체지향 프로그래밍을 향해
 *
 * - `예매 정보` 를 구현하는 클래스
 * */
public class Reservation {

    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer,
                       Screening screening,
                       Money fee,
                       int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

}
