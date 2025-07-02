package com.muhammetakduman.controller;

import com.muhammetakduman.dto.DtoCustomer;

public interface ICustomerController {
    public DtoCustomer findCustomerById(Long id);
}