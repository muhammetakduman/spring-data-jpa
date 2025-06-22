package com.muhammetakduman.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//bean property için Entitiyle aynı field ismiyle burda enject etmemiz gerekiyor.
public class DtoStudent {
    private String firstName;
    private String lastName;

}
