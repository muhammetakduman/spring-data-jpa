package com.muhammetakduman.services.impl;

import com.muhammetakduman.dto.DtoDepartmen;
import com.muhammetakduman.dto.DtoEmployee;
import com.muhammetakduman.dto.DtoHome;
import com.muhammetakduman.entities.Employee;
import com.muhammetakduman.repository.EmployeeRepository;
import com.muhammetakduman.services.IEmployeeServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceimpl implements IEmployeeServices {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<DtoEmployee> findAllEmployess() {
        List<DtoEmployee> dtoEmployeeList = new ArrayList<>();
        List<Employee> employeeList = employeeRepository.findAll();

        if (employeeList != null && !employeeList.isEmpty()){
            for (Employee employee : employeeList){
                DtoEmployee dtoEmployee = new DtoEmployee();
                BeanUtils.copyProperties(employee,dtoEmployee);

                dtoEmployee.setDepartmen(new DtoDepartmen(employee.getDepartment().getId(),employee.getDepartment().getDepartmanName()));

            }
        }

        return dtoEmployeeList;
    }
}
