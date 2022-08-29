package siit.homework09;

import java.util.PriorityQueue;
import java.util.Queue;

public class FestivalGate {

    Queue<TicketType> q = new PriorityQueue<>();

    public void add(TicketType ticketType) {
        q.add(ticketType);
    }

    public Queue<TicketType> getQ() {
        return q;
    }
}
