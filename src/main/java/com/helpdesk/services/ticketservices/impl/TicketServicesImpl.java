package com.helpdesk.services.ticketservices.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helpdesk.entity.tickets.TicketCatagory;
import com.helpdesk.entity.tickets.TicketGenerator;
import com.helpdesk.entity.user.User;
import com.helpdesk.repositories.UserRepositiory;
import com.helpdesk.repositories.ticket.TicketCatagoryRepo;
import com.helpdesk.repositories.ticket.TicketRepo;
import com.helpdesk.services.ticketservices.TicketServices;

@Service
public class TicketServicesImpl implements TicketServices {

    @Autowired
    private UserRepositiory userRepositiory;

    @Autowired
    private TicketCatagoryRepo ticketCatagoryRepo;

    @Autowired
    private TicketRepo ticketRepo;

    @Override
    public TicketGenerator createTicket(String useruniqId, String catId, TicketGenerator ticketGenerator) {

        User user = this.userRepositiory.findByUserUniqueId(useruniqId);
        TicketCatagory ticketCatagory = this.ticketCatagoryRepo.findByCatagory_unique_id(catId);
        ticketGenerator.setTicketCatagory(ticketCatagory);
        ticketGenerator.setUser(user);
        return this.ticketRepo.save(ticketGenerator);

    }

    @Override
    public List<TicketGenerator> getAllTickets(String userid) {
        return this.ticketRepo.findAll();
    }

}
