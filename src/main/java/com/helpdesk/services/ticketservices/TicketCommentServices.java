package com.helpdesk.services.ticketservices;

import java.util.List;

import com.helpdesk.entity.tickets.TicketComment;

public interface TicketCommentServices {

    TicketComment create_ticket_comment(String userid, String ticketid,TicketComment ticketComment);
    
    List<TicketComment> one_Ticket_comment(String ticketid);
}
