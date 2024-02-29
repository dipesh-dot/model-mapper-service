package com.dipesh.modelsmappper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private String name;
    private int phoneNumber;
    private int age;


}
