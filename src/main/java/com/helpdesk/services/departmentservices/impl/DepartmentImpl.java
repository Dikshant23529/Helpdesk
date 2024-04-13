/*
package com.helpdesk.services.departmentservices.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helpdesk.entity.department.Department;
import com.helpdesk.entity.user.User;
import com.helpdesk.repositories.UserRepositiory;
import com.helpdesk.repositories.department.DepartmentRepo;
import com.helpdesk.services.departmentservices.DepartmentServices;

@Service
public class DepartmentImpl implements DepartmentServices {

    @Autowired
    private UserRepositiory userRepositiory;

    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public Department createdepartment(String userUniqueId, Department department) {

        User user = this.userRepositiory.findByUserUniqueId(userUniqueId);

        if (user == null) {
            throw new IllegalArgumentException("Please check with app admin");
        }

        department.setUser(user);
        department.setRole(null);
        return this.departmentRepo.save(department);

    }

    

    @Override
    public Department get_department_by_name(String useruniqueId, String departmentname) {

        User user = this.userRepositiory.findByUserUniqueId(useruniqueId);

        if (user == null) {
            throw new IllegalArgumentException("Please login to access this resource");
        }

        return this.departmentRepo.findByDepartment_name(departmentname);
    }

    @Override
    public List<Department> getAllDepartments(String useruniqueId) {
        User user = this.userRepositiory.findByUserUniqueId(useruniqueId);

        if (user == null) {
            throw new IllegalArgumentException("Please login to access this resource");
        }

        return this.departmentRepo.findAll();
    }

    @Override
    public Department update_department(String useruniqueId, String departmentuniqueId, Department department) {
        User user = this.userRepositiory.findByUserUniqueId(useruniqueId);

        if (user == null) {
            throw new IllegalArgumentException("Please login to access this resource");
        }

        Department department_by_id = this.departmentRepo.findByDepartment_uuid(departmentuniqueId);
        department_by_id.setDepartment_name(department.getDepartment_name());
        department_by_id.setUser(user);
        return this.departmentRepo.save(department_by_id);

    }

    @Override
    public Department delete_Department(String useruniqueId, String departmentuniqueId) {
        User user = this.userRepositiory.findByUserUniqueId(useruniqueId);

        if (user == null) {
            throw new IllegalArgumentException("Please login to access this resource");
        }

        Department department = this.departmentRepo.findByDepartment_uuid(departmentuniqueId);
        this.departmentRepo.delete(department);
        return department;

    }
 
}
*/
