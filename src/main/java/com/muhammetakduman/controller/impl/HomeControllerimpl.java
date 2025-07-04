package com.muhammetakduman.controller.impl;


import com.muhammetakduman.controller.IHomeController;
import com.muhammetakduman.dto.DtoHome;
import com.muhammetakduman.services.IHomeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/home")
public class HomeControllerimpl implements IHomeController {

    @Autowired
    private IHomeServices iHomeServices;

    @GetMapping(path = "/{id}")
    @Override
    public DtoHome findHomeById(@PathVariable(name = "id") Long id) {
        return iHomeServices.findHomeById(id);
    }
}
