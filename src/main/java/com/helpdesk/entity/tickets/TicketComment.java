package com.helpdesk.entity.tickets;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.helpdesk.entity.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TicketComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticket_comment_id;

    @Column(nullable = false, unique = true)
    private String ticket_unique_id = UUID.randomUUID().toString();

    @Column(nullable = false)
    private String comment;

    @ManyToOne
    @JoinColumn(nullable = false)
    @JsonIgnore
    private TicketGenerator ticketGenerator;

    @ManyToOne
    @JoinColumn(nullable = false)
    @JsonIgnore
    private User user;

    @Column(nullable = false)
    private LocalDateTime commentAddedTime = LocalDateTime.now();

    public TicketComment() {
    }

    public TicketComment(int ticket_comment_id, String ticket_unique_id, String comment,
            TicketGenerator ticketGenerator, User user, LocalDateTime commentAddedTime) {
        this.ticket_comment_id = ticket_comment_id;
        this.ticket_unique_id = ticket_unique_id;
        this.comment = comment;
        this.ticketGenerator = ticketGenerator;
        this.user = user;
        this.commentAddedTime = commentAddedTime;
    }

    public TicketComment(String ticket_unique_id, String comment, TicketGenerator ticketGenerator, User user,
            LocalDateTime commentAddedTime) {
        this.ticket_unique_id = ticket_unique_id;
        this.comment = comment;
        this.ticketGenerator = ticketGenerator;
        this.user = user;
        this.commentAddedTime = commentAddedTime;
    }

    public int getTicket_comment_id() {
        return ticket_comment_id;
    }

    public void setTicket_comment_id(int ticket_comment_id) {
        this.ticket_comment_id = ticket_comment_id;
    }

    public String getTicket_unique_id() {
        return ticket_unique_id;
    }

    public void setTicket_unique_id(String ticket_unique_id) {
        this.ticket_unique_id = ticket_unique_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public TicketGenerator getTicketGenerator() {
        return ticketGenerator;
    }

    public void setTicketGenerator(TicketGenerator ticketGenerator) {
        this.ticketGenerator = ticketGenerator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCommentAddedTime() {
        return commentAddedTime;
    }

    public void setCommentAddedTime(LocalDateTime commentAddedTime) {
        this.commentAddedTime = commentAddedTime;
    }

}
