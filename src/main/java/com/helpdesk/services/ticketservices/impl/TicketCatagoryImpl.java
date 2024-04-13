package com.helpdesk.services.ticketservices.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helpdesk.entity.tickets.TicketCatagory;
import com.helpdesk.entity.user.User;
import com.helpdesk.repositories.UserRepositiory;
import com.helpdesk.repositories.ticket.TicketCatagoryRepo;
import com.helpdesk.services.ticketservices.TicketCatagoryServices;

@Service
public class TicketCatagoryImpl implements TicketCatagoryServices {

    @Autowired
    private UserRepositiory userRepositiory;

    @Autowired
    private TicketCatagoryRepo ticketCatagoryRepo;

    @Override
    public TicketCatagory createTicketCatagory(String userid, TicketCatagory ticketCatagory) {
        User user = this.userRepositiory.findByUserUniqueId(userid);
        ticketCatagory.setCatagory_created_by_user(user);
        return this.ticketCatagoryRepo.save(ticketCatagory);
    }

}
