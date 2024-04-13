package com.helpdesk.entity.user;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    @Column(nullable = false, unique = true)
    private String roleName;

    @Column(nullable = false, unique = true)
    private String roleUUID = UUID.randomUUID().toString();

    public Role() {
    }

    public Role(int roleId, String roleName, String roleUUID) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleUUID = roleUUID;
    }

    public Role(String roleName, String roleUUID) {
        this.roleName = roleName;
        this.roleUUID = roleUUID;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleUUID() {
        return roleUUID;
    }

    public void setRoleUUID(String roleUUID) {
        this.roleUUID = roleUUID;
    }

}
