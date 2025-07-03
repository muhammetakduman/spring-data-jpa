package com.muhammetakduman.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

/// null dönüyorsa fronta verme.
@JsonInclude(value = JsonInclude.Include.NON_NULL)

public class DtoCustomer {
    private Long id;
    private String name;
    private DtoAddress adrdress;

}
