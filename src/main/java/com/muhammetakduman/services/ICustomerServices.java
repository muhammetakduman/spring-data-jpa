package com.muhammetakduman.services;

import com.muhammetakduman.dto.DtoCustomer;

public interface ICustomerServices {
    public DtoCustomer findCustomerById(Long id);
}
