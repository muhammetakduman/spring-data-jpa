package com.muhammetakduman.services;

import com.muhammetakduman.dto.DtoStudent;
import com.muhammetakduman.dto.DtoStudentIU;
import com.muhammetakduman.entities.Student;

import java.util.List;

public interface  IStudentServices {
    public DtoStudent saveStudent(DtoStudentIU student);
    public List<Student> getAllStudents();
    public Student getStudentById(Integer id);
    public void deleteStudent(Integer id);
    public Student updateStudent(Integer id , Student updateStudent);
}
