package com.muhammetakduman.controller.impl;

import com.muhammetakduman.controller.IEmployeeController;
import com.muhammetakduman.dto.DtoEmployee;
import com.muhammetakduman.services.IEmployeeServices;
import com.muhammetakduman.services.impl.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerimpl implements IEmployeeController {
    @Autowired
    private IEmployeeServices employeeServices;


    @GetMapping(path = "/list")
    @Override
    public List<DtoEmployee> findAllEmployess() {
        return employeeServices.findAllEmployess();
    }
}
