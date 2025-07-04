package com.muhammetakduman.controller;

import com.muhammetakduman.dto.DtoHome;

public interface IHomeController {
    public DtoHome findHomeById(Long id);
}
