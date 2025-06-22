package com.muhammetakduman.controller.impl;

import com.muhammetakduman.controller.IStudentController;
import com.muhammetakduman.entities.Student;
import com.muhammetakduman.services.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpls implements IStudentController {
    @Autowired
    private IStudentServices iStudentServices;


    //DTO kullanılır
    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return iStudentServices.saveStudent(student);
    }
}
