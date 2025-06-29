package com.muhammetakduman.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//insert ve update
public class DtoStudentIU {


    @NotEmpty(message = "First name alanı boş bırakılamaz")
    @NotNull(message = "First name alanı boş bırakılamaz")
    @Size(min = 3, max = 30 , message = "Böyle bir isim türkiyde yok.")
    private String firstName;

    @NotEmpty(message = "last name alanını soy isimde boş bırakılmaz.")
    private String lastName;
    private String birthOfDate;

}
