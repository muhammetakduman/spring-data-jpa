package com.muhammetakduman.dto;

import com.muhammetakduman.entities.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DtoCourse extends Course {
    private Long id;
    private String name;
}
