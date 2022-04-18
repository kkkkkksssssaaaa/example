import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ### 1.3 설계 개선하기
 *
 * - 매표소를 구현하는 클래스
 * - 판매하거나 교환해 줄 티켓의 목록과 판매 금액을 필드로 가짐
 * */
public class TicketOffice {

    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

}
