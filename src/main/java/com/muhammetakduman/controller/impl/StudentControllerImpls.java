package com.muhammetakduman.controller.impl;

import com.muhammetakduman.controller.IStudentController;
import com.muhammetakduman.dto.DtoStudent;
import com.muhammetakduman.dto.DtoStudentIU;
import com.muhammetakduman.entities.Student;
import com.muhammetakduman.services.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpls implements IStudentController {
    @Autowired
    private IStudentServices iStudentServices;


    //DTO kullanılır
    @PostMapping(path = "/save")
    @Override
    public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {
        return iStudentServices.saveStudent(dtoStudentIU);
    }

    @GetMapping(path = "/list")
    @Override
    public List<DtoStudent> getAllStudents() {
        return iStudentServices.getAllStudents();
    }

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoStudent getStudentById(@PathVariable(name = "id") Integer id) {
        return iStudentServices.getStudentById(id);
    }

    @Override
    @DeleteMapping(path = "/delete/{id}")
    public void deleteStudent(@PathVariable(name = "id") Integer id) {
        iStudentServices.deleteStudent(id);
    }

    @Override
    @PutMapping(path = "/update/{id}")
    public DtoStudent updateStudent(@PathVariable(name = "id") Integer id, @RequestBody DtoStudentIU dtoStudentIU) {
        return iStudentServices.updateStudent(id,dtoStudentIU);
    }

}
