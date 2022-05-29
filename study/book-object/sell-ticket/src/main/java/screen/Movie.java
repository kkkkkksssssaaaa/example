package screen;

import java.time.Duration;

/**
 * ### 2.3 할인 요금 구하기
 *
 * - `영화` 를 구현하는 클래스
 * */
public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title,
                 Duration runningTime,
                 Money fee,
                 DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return this.fee;
    }

    /**
     * ### 2-3 할인 요금 구하기
     *
     * - 영화의 예매 금액 계산
     * - 예매 금액을 구할 때 영화 클래스에서 직접 제어하는 것이 아닌,
     *   할인 정책이라는 객체에게 메세지를 보내는 것으로 처리한것이 포인트
     * */
    public Money calculateMovieFee(Screening screening) {
        return this.fee
                .minus(discountPolicy.calculateDiscountAmount(screening));
    }

    /**
     * ### 2.5 추상화와 유연성
     *
     * - 할인 정책을 변경하기 위한 메서드
     * */
    public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

}
