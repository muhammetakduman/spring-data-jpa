package com.muhammetakduman.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "student")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    @Column(name = "id" )
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "birth_of_date",nullable = true)
    private String birthOfDate;

    @ManyToMany
    @JoinTable(name = "student_course",
    joinColumns = @JoinColumn(name ="student_id" ),
    inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;
}
