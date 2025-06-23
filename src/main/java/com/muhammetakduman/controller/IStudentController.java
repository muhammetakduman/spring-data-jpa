package com.muhammetakduman.controller;

import com.muhammetakduman.dto.DtoStudent;
import com.muhammetakduman.dto.DtoStudentIU;
import com.muhammetakduman.entities.Student;

import java.util.List;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
    public List<DtoStudent> getAllStudents();
    public DtoStudent getStudentById(Integer id);
    public void deleteStudent(Integer id);
    public DtoStudent updateStudent(Integer id , DtoStudentIU dtoStudentIU);
}
