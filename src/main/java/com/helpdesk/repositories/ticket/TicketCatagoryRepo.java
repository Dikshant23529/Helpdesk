package com.helpdesk.repositories.ticket;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpdesk.entity.tickets.TicketCatagory;

public interface TicketCatagoryRepo extends JpaRepository<TicketCatagory, Integer>{

    public TicketCatagory findByCatagory_unique_id(String catagory_unique_id);
    
}
