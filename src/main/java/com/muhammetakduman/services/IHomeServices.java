package com.muhammetakduman.services;

import com.muhammetakduman.dto.DtoHome;

public interface IHomeServices {
    public DtoHome findHomeById(Long id);
}
