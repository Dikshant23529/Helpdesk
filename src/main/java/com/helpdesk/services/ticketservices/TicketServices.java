package com.helpdesk.services.ticketservices;

import java.util.List;

import com.helpdesk.entity.tickets.TicketGenerator;

public interface TicketServices {
    
    TicketGenerator createTicket(String useruniqId, String catId,TicketGenerator ticketGenerator);

    List<TicketGenerator> getAllTickets(String userid);


}
