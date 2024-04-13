package com.helpdesk.controllers.ticketcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.helpdesk.entity.tickets.TicketCatagory;
import com.helpdesk.entity.tickets.TicketComment;
import com.helpdesk.entity.tickets.TicketGenerator;
import com.helpdesk.services.ticketservices.impl.TicketCatagoryImpl;
import com.helpdesk.services.ticketservices.impl.TicketCommentsImpl;
import com.helpdesk.services.ticketservices.impl.TicketServicesImpl;

@RestController
@RequestMapping("/api/v0/ticket")
public class TicketControllers {

    @Autowired
    private TicketCatagoryImpl ticketCatagoryImpl;

    @Autowired
    private TicketCommentsImpl ticketCommentsImpl;

    @Autowired
    private TicketServicesImpl ticketServicesImpl;

    @PostMapping("/comment")
    public ResponseEntity<TicketComment> saveComment(
            @RequestParam String userid,
            @RequestParam String ticketid,
            @RequestBody TicketComment ticketComment) {
        return new ResponseEntity<>(this.ticketCommentsImpl.create_ticket_comment(userid, ticketid, ticketComment),
                HttpStatus.CREATED);
    }

    @GetMapping("/comment/all")
    public ResponseEntity<List<TicketComment>> getAllTicketComments(@RequestParam String ticketid) {
        return new ResponseEntity<>(this.ticketCommentsImpl.one_Ticket_comment(ticketid), HttpStatus.OK);
    }

    @PostMapping("/generate/ticket")
    public ResponseEntity<TicketGenerator> createTicket(
            @RequestParam String userid,
            @RequestParam String catid,
            @RequestBody TicketGenerator ticketGenerator) {
        return new ResponseEntity<>(this.ticketServicesImpl.createTicket(userid, catid, ticketGenerator),
                HttpStatus.CREATED);
    }

    @GetMapping("/all/tickets")
    public ResponseEntity<List<TicketGenerator>> getALlTickets() {
        return new ResponseEntity<>(this.ticketServicesImpl.getAllTickets(null), HttpStatus.CREATED);
    }

    @PostMapping("/create/catagory")
    public ResponseEntity<TicketCatagory> createTicketCatagory(
            @RequestParam String userid, @RequestBody TicketCatagory ticketCatagory) {
        return new ResponseEntity<>(this.ticketCatagoryImpl.createTicketCatagory(userid, ticketCatagory),
                HttpStatus.CREATED);
    }

}
