package com.muhammetakduman.controller;

import com.muhammetakduman.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {
    public List<DtoEmployee> findAllEmployess();
}
