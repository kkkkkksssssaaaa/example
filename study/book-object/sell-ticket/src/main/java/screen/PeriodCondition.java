package screen;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * ### 2.3 할인 요금 구하기
 *
 * - 상영 시작 시간이 특정한 기간 안에 포함되는지 여부를 판단해 할인 여부를 결정
 * */
public class PeriodCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek,
                           LocalTime startTime,
                           LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek)
                && startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0
                && endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
    }

}