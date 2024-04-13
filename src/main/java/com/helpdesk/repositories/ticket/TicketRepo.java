package com.helpdesk.repositories.ticket;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpdesk.entity.tickets.TicketGenerator;

public interface TicketRepo extends JpaRepository<TicketGenerator, Integer>{

    public TicketGenerator findByTicket_unique_id(String ticket_unique_id);
    
}
