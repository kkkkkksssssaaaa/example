package screen;

/**
 * ### 2.3 할인 요금 구하기
 *
 * - 할인 여부를 판단하기 위해 사용할 순번을 인스턴스 변수로 포함하는 클래스
 * */
public class SequenceCondition implements DiscountCondition {

    private int sequeuce;

    public SequenceCondition(int sequeuce) {
        this.sequeuce = sequeuce;
    }

    @Override
    public boolean isSatisfiedBy(Screening  screening) {
        return screening.isSequence(sequeuce);
    }

}
