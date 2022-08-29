package siit.homework09;

public class FestivalAtendeeThread extends Thread {
    public TicketType ticketType;
    public FestivalGate gate;

    public FestivalAtendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        this.gate = gate;
    }

    @Override
    public void run() {
        try {
            sleep(5000);
        } catch (InterruptedException exception) {
            throw new RuntimeException(exception);
        }
        gate.add(ticketType);
    }
}
