package com.muhammetakduman.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError<T> {
    private String id;
    private Date errorTime;
    // hata mesajları illa bir list içinde dönmeyeği için generic tür tanımlaması yapmalıyız.
    private T errors;

}
