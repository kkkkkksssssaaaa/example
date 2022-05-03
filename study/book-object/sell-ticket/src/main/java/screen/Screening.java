package screen;

import java.time.LocalDateTime;

/**
 * ### 2.2 객체지향 프로그래밍을 향해
 *
 * - `상영` 을 구현하는 클래스
 * */
public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie,
                     int sequence,
                     LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

}
