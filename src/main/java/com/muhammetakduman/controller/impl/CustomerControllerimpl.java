package com.muhammetakduman.controller.impl;

import com.muhammetakduman.controller.ICustomerController;
import com.muhammetakduman.dto.DtoCustomer;
import com.muhammetakduman.services.ICustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/customer")
public class CustomerControllerimpl implements ICustomerController {
    @Autowired
    private ICustomerServices customerServices;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoCustomer findCustomerById(@PathVariable(name = "id") Long id) {
        return customerServices.findCustomerById(id);
    }
}
