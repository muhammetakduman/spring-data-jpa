package com.muhammetakduman.services;

import com.muhammetakduman.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeServices {
    public List<DtoEmployee> findAllEmployess();
}
