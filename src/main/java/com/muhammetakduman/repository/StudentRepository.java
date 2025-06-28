package com.muhammetakduman.repository;

import com.muhammetakduman.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


    // custom queary HQL (HIBERNATE QUERY LANGUAGE)
    // YAZARKEN DB DEKİ TABLE DEĞİL DE CLASSLER VE FİELDLER KULLANILIR.
    @Query(value = "from Student" , nativeQuery = false)
    List<Student> findAllStudents();

    //eğer sql kullanamk istersek nativeQuery true çekmemiz gerekmektedir.
    //@Query(value = "selecet * from student" , nativeQuery = true)
    //List<Student> findAllStudents;


}
