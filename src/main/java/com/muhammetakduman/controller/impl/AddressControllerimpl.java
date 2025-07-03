package com.muhammetakduman.controller.impl;

import com.muhammetakduman.controller.IAddressController;
import com.muhammetakduman.dto.DtoAddress;
import com.muhammetakduman.services.IAddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerimpl implements IAddressController {

    @Autowired
    private IAddressServices iAddressServices;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoAddress findAdressById(@PathVariable(name = "id") Long id) {
        return iAddressServices.findAddressById(id);
    }
}
