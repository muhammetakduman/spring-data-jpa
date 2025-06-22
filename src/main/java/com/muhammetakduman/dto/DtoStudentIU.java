package com.muhammetakduman.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//insert ve update
public class DtoStudentIU {
    private String firstName;
    private String lastName;
    private String birthOfDate;

}
