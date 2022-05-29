package screen;

/**
 * ### 2.3 할인 정책 구하기
 *
 * - 일정 비율에 따라 할인
 * */
public class PercentDefaultDiscountPolicy extends DefaultDiscountPolicy {

    private double percent;

    public PercentDefaultDiscountPolicy(double percent,
                                        DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }

}
