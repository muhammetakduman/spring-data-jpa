package com.muhammetakduman.services.impl;

import com.muhammetakduman.dto.DtoStudent;
import com.muhammetakduman.dto.DtoStudentIU;
import com.muhammetakduman.entities.Student;
import com.muhammetakduman.repository.StudentRepository;
import com.muhammetakduman.services.IStudentServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceİmpls implements IStudentServices {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
        Student student = new Student();
        DtoStudent response = new DtoStudent();
        BeanUtils.copyProperties(dtoStudentIU,student);
        Student dbStudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbStudent,response);
        return response;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    @Override
    public Student getStudentById(Integer id) {
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        System.out.println("Bu idli kimse yok");
        return null;
    }

    @Override
    public void deleteStudent(Integer id) {
        Student dbDeleteStudent = getStudentById(id);
        if (dbDeleteStudent!=null){
            studentRepository.delete(dbDeleteStudent);
        }
    }

    @Override
    public Student updateStudent(Integer id, Student updateStudent) {
        Student dbStudent =getStudentById(id);
        if (dbStudent != null){
            dbStudent.setFirstName(updateStudent.getFirstName());
            dbStudent.setLastName(updateStudent.getLastName());
            dbStudent.setBirthOfDate(updateStudent.getBirthOfDate());
            return studentRepository.save(dbStudent);
        }
        return null;
    }
}
