package siit.homework09;

import java.util.HashMap;
import java.util.Map;

public class FestivalStatisticsThread extends Thread {
    public FestivalGate gate;
    int numberOfAttendes = 0;
    public Map<TicketType, Integer> ticketStatistics = new HashMap<>();

}
