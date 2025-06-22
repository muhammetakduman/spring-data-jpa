package com.muhammetakduman.services.impl;

import com.muhammetakduman.entities.Student;
import com.muhammetakduman.repository.StudentRepository;
import com.muhammetakduman.services.IStudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceİmpls implements IStudentServices {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
