package com.muhammetakduman.services.impl;

import com.muhammetakduman.entities.Student;
import com.muhammetakduman.repository.StudentRepository;
import com.muhammetakduman.services.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceİmpls implements IStudentServices {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }
}
