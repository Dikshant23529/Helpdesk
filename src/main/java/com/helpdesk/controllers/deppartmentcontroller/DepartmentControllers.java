/*
package com.helpdesk.controllers.deppartmentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.helpdesk.entity.department.Department;
import com.helpdesk.services.departmentservices.impl.DepartmentImpl;

@RestController
@RequestMapping("/api/v0/department/")
public class DepartmentControllers {

    @Autowired
    private DepartmentImpl departmentImpl;

    @PostMapping("create")
    public ResponseEntity<Department> createDepartment(@RequestParam String userid,
            @RequestBody Department department) {
        return new ResponseEntity<>(this.departmentImpl.createdepartment(userid, department), HttpStatus.CREATED);
    }

}
 */