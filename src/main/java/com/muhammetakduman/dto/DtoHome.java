package com.muhammetakduman.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DtoHome {
    private Long id;

    private BigDecimal price;

    private List<DtoRoom> rooms = new ArrayList<>();

}
