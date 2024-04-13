package com.helpdesk.entity.tickets;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.helpdesk.entity.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TicketGenerator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticket_generator_id;

    @Column(nullable = false, unique = true)
    private String ticket_unique_id = UUID.randomUUID().toString();

    @Column(nullable = false)
    private String ticket_title;

    @Column(nullable = false)
    private String ticket_discription;

    @ManyToOne
    @JsonIgnore
    private TicketCatagory ticketCatagory;

    @ManyToOne
    @JsonIgnore
    private User user;

    public TicketGenerator() {
    }

    public TicketGenerator(int ticket_generator_id, String ticket_unique_id, String ticket_title,
            String ticket_discription, TicketCatagory ticketCatagory, User user) {
        this.ticket_generator_id = ticket_generator_id;
        this.ticket_unique_id = ticket_unique_id;
        this.ticket_title = ticket_title;
        this.ticket_discription = ticket_discription;
        this.ticketCatagory = ticketCatagory;
        this.user = user;
    }

    public int getTicket_generator_id() {
        return ticket_generator_id;
    }

    public void setTicket_generator_id(int ticket_generator_id) {
        this.ticket_generator_id = ticket_generator_id;
    }

    public String getTicket_unique_id() {
        return ticket_unique_id;
    }

    public void setTicket_unique_id(String ticket_unique_id) {
        this.ticket_unique_id = ticket_unique_id;
    }

    public String getTicket_title() {
        return ticket_title;
    }

    public void setTicket_title(String ticket_title) {
        this.ticket_title = ticket_title;
    }

    public String getTicket_discription() {
        return ticket_discription;
    }

    public void setTicket_discription(String ticket_discription) {
        this.ticket_discription = ticket_discription;
    }

    public TicketCatagory getTicketCatagory() {
        return ticketCatagory;
    }

    public void setTicketCatagory(TicketCatagory ticketCatagory) {
        this.ticketCatagory = ticketCatagory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
