package com.muhammetakduman.services;

import com.muhammetakduman.dto.DtoAddress;

public interface IAddressServices {
    public DtoAddress findAddressById(Long id);
}
