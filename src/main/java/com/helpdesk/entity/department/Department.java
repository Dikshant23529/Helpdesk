/*
package com.helpdesk.entity.department;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.helpdesk.entity.user.Role;
import com.helpdesk.entity.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int department_id;

    @Column(unique = true, nullable = false)
    private String department_name;

    @Column(unique = true, nullable = false)
    private String department_uuid = UUID.randomUUID().toString();

    @ManyToOne
    @JoinColumn(nullable = false)
    @JsonIgnore
    private User user;

    @Column(nullable = false)
    private LocalDateTime localDateTime = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(nullable = false, name = "role_id")
    @JsonIgnore
    private Role role;

    public Department() {
    }

    public Department(int department_id, String department_name, String department_uuid, User user,
            LocalDateTime localDateTime, Role role) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.department_uuid = department_uuid;
        this.user = user;
        this.localDateTime = localDateTime;
        this.role = role;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDepartment_uuid() {
        return department_uuid;
    }

    public void setDepartment_uuid(String department_uuid) {
        this.department_uuid = department_uuid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
 */