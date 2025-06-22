package com.muhammetakduman.controller.impl;

import com.muhammetakduman.controller.IStudentController;
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
    public Student saveStudent(@RequestBody Student student) {
        return iStudentServices.saveStudent(student);
    }

    @GetMapping(path = "/list")
    @Override
    public List<Student> getAllStudents() {
        return iStudentServices.getAllStudents();
    }

    @Override
    @GetMapping(path = "/list/{id}")
    public Student getStudentById(@PathVariable(name = "id") Integer id) {
        return iStudentServices.getStudentById(id);
    }

    @Override
    @DeleteMapping(path = "/delete/{id}")
    public void deleteStudent(@PathVariable(name = "id") Integer id) {
        iStudentServices.deleteStudent(id);
    }

}
