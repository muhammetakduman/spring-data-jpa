package com.muhammetakduman.services.impl;

import com.muhammetakduman.dto.DtoCourse;
import com.muhammetakduman.dto.DtoStudent;
import com.muhammetakduman.dto.DtoStudentIU;
import com.muhammetakduman.entities.Course;
import com.muhammetakduman.entities.Student;
import com.muhammetakduman.repository.StudentRepository;
import com.muhammetakduman.services.IStudentServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<DtoStudent> getAllStudents() {
        List<DtoStudent> dtoList = new ArrayList<>();

        List<Student> studentList = studentRepository.findAllStudents();
        for (Student student : studentList){
            DtoStudent dto = new DtoStudent();
            BeanUtils.copyProperties(student , dto);
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public DtoStudent getStudentById(Integer id) {
        DtoStudent dtoStudent = new DtoStudent();
        Optional<Student> optional = studentRepository.findById(id);

        if (optional.isEmpty()){
            return null;
        }
        Student dbStudent = optional.get();
        BeanUtils.copyProperties(dbStudent,dtoStudent);
        if (dbStudent.getCourses()!=null && !dbStudent.getCourses().isEmpty()){
            List<DtoCourse> dtoCourseList  = new ArrayList<>();
            for (Course course : dbStudent.getCourses()){
                DtoCourse dtoCourse = new DtoCourse();
                BeanUtils.copyProperties(course,dtoCourse);
                dtoCourseList.add(dtoCourse);
            }
            dtoStudent.setCourses(dtoCourseList);
        }
        return dtoStudent;
    }

    @Override
    public void deleteStudent(Integer id) {
//        DtoStudent dtoStudent = getStudentById(id);
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()){
            studentRepository.delete(optional.get());
        }
    }

    @Override
    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
        DtoStudent dto = new DtoStudent();
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()){
            Student  dbStudent = optional.get();
            dbStudent.setFirstName(dtoStudentIU.getFirstName());
            dbStudent.setLastName(dtoStudentIU.getLastName());
            dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());
            Student updatedStudent = studentRepository.save(dbStudent);
            BeanUtils.copyProperties(updatedStudent,dto);
            return dto;
        }
        return null;
    }
}
