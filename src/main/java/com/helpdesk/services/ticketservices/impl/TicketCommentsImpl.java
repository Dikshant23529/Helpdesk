package com.helpdesk.services.ticketservices.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helpdesk.entity.tickets.TicketComment;
import com.helpdesk.entity.tickets.TicketGenerator;
import com.helpdesk.entity.user.User;
import com.helpdesk.repositories.UserRepositiory;
import com.helpdesk.repositories.ticket.TicketCommentRepo;
import com.helpdesk.repositories.ticket.TicketRepo;
import com.helpdesk.services.ticketservices.TicketCommentServices;

@Service
public class TicketCommentsImpl implements TicketCommentServices {

    @Autowired
    private TicketCommentRepo ticketCommentRepo;

    @Autowired
    private TicketRepo ticketRepo;

    @Autowired
    private UserRepositiory userRepositiory;

    @Override
    public TicketComment create_ticket_comment(String userid, String ticketid, TicketComment ticketComment) {
        User user = this.userRepositiory.findByUserUniqueId(userid);
        TicketGenerator ticketGenerator = this.ticketRepo.findByTicket_unique_id(ticketid);
        ticketComment.setUser(user);
        ticketComment.setTicketGenerator(ticketGenerator);
        return this.ticketCommentRepo.save(ticketComment);

    }

    @Override
    public List<TicketComment> one_Ticket_comment(String ticketid) {
        return this.ticketCommentRepo.findByTicket_unique_id(ticketid);
    }

}
