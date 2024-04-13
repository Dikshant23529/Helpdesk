package com.helpdesk.repositories.ticket;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpdesk.entity.tickets.TicketComment;

public interface TicketCommentRepo extends JpaRepository<TicketComment, Integer>{

    public List<TicketComment> findByTicket_unique_id(String ticket_unique_id);
    
}
