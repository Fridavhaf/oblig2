package spring.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TicketController {

    private final List<Ticket> allTickets = new ArrayList<>();

    @PostMapping("/saveTicket")
    public void saveTicket(Ticket inTicket){ allTickets.add(inTicket);}

    @GetMapping("/showTickets")
    public List<Ticket> showTickets (){
        return allTickets;
    }

    @GetMapping("/deleteAll")
    public void deleteTickets (){
        allTickets.clear();
    }

}
