package com.muhammetakduman.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//bean property için Entitiyle aynı field ismiyle burda enject etmemiz gerekiyor.
public class DtoStudent {
    private Integer id;
    private String firstName;
    private String lastName;
    private List<DtoCourse> courses = new ArrayList<>();
}
