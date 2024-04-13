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
import jakarta.persistence.Table;

@Entity
public class TicketCatagory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int catagory_id;

    @Column(unique = true, nullable = false)
    private String catagory_title;

    private String catagory_discription;

    @Column(nullable = false, unique = true)
    private String catagory_unique_id = UUID.randomUUID().toString();

    private LocalDateTime catagory_created_at = LocalDateTime.now();

    private LocalDateTime catagory_updated_at;

    @ManyToOne
    @JoinColumn(nullable = false)
    @JsonIgnore
    private User catagory_created_by_user;

    public TicketCatagory() {
    }

    public TicketCatagory(int catagory_id, String catagory_title, String catagory_discription,
            String catagory_unique_id, LocalDateTime catagory_created_at, LocalDateTime catagory_updated_at,
            User catagory_created_by_user) {
        this.catagory_id = catagory_id;
        this.catagory_title = catagory_title;
        this.catagory_discription = catagory_discription;
        this.catagory_unique_id = catagory_unique_id;
        this.catagory_created_at = catagory_created_at;
        this.catagory_updated_at = catagory_updated_at;
        this.catagory_created_by_user = catagory_created_by_user;
    }

    public TicketCatagory(String catagory_title, String catagory_discription, String catagory_unique_id,
            LocalDateTime catagory_created_at, LocalDateTime catagory_updated_at, User catagory_created_by_user) {
        this.catagory_title = catagory_title;
        this.catagory_discription = catagory_discription;
        this.catagory_unique_id = catagory_unique_id;
        this.catagory_created_at = catagory_created_at;
        this.catagory_updated_at = catagory_updated_at;
        this.catagory_created_by_user = catagory_created_by_user;
    }

    public int getCatagory_id() {
        return catagory_id;
    }

    public void setCatagory_id(int catagory_id) {
        this.catagory_id = catagory_id;
    }

    public String getCatagory_title() {
        return catagory_title;
    }

    public void setCatagory_title(String catagory_title) {
        this.catagory_title = catagory_title;
    }

    public String getCatagory_discription() {
        return catagory_discription;
    }

    public void setCatagory_discription(String catagory_discription) {
        this.catagory_discription = catagory_discription;
    }

    public String getCatagory_unique_id() {
        return catagory_unique_id;
    }

    public void setCatagory_unique_id(String catagory_unique_id) {
        this.catagory_unique_id = catagory_unique_id;
    }

    public LocalDateTime getCatagory_created_at() {
        return catagory_created_at;
    }

    public void setCatagory_created_at(LocalDateTime catagory_created_at) {
        this.catagory_created_at = catagory_created_at;
    }

    public LocalDateTime getCatagory_updated_at() {
        return catagory_updated_at;
    }

    public void setCatagory_updated_at(LocalDateTime catagory_updated_at) {
        this.catagory_updated_at = catagory_updated_at;
    }

    public User getCatagory_created_by_user() {
        return catagory_created_by_user;
    }

    public void setCatagory_created_by_user(User catagory_created_by_user) {
        this.catagory_created_by_user = catagory_created_by_user;
    }

}
