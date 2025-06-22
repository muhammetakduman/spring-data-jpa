package com.muhammetakduman.controller;

import com.muhammetakduman.entities.Student;

import java.util.List;

public interface IStudentController {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(Integer id);
    public void deleteStudent(Integer id);
}
