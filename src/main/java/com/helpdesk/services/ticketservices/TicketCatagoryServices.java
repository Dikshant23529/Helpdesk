package com.helpdesk.services.ticketservices;

import com.helpdesk.entity.tickets.TicketCatagory;

public interface TicketCatagoryServices {
    
    TicketCatagory createTicketCatagory(String userid, TicketCatagory ticketCatagory);

}
