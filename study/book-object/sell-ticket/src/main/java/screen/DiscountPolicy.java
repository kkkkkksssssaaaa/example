package screen;

/**
 * ### 2.3 할인 요금 구하기
 *
 * - `영화의 할인 정책` 을 구현하는 클래스
 * */
public class DiscountPolicy {

    // TODO 상영 정보를 통해 할인된 금액을 반환
    public Money calculateDiscountAmount(Screening screening) {
        return screening.getMovieFee();
    }

}
