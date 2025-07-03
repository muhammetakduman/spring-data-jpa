package com.muhammetakduman.controller;

import com.muhammetakduman.dto.DtoAddress;

public interface IAddressController {
    public DtoAddress findAdressById(Long id);
}
