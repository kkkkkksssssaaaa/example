import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ### 1.1 티켓 판매 어플리케이션 구현하기
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

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

}
