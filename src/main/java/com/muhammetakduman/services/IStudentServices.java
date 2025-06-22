package com.muhammetakduman.services;

import com.muhammetakduman.entities.Student;

import java.util.List;

public interface IStudentServices {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
