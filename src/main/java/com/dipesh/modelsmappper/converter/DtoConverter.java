package com.dipesh.modelsmappper.converter;

import com.dipesh.modelsmappper.dto.UserDto;
import com.dipesh.modelsmappper.entity.Student;

public class DtoConverter {

    public static UserDto convert(Student entity){
        if(entity ==null)
            return null;
        UserDto dto = new UserDto();

        dto.setName(entity.getName());
        dto.setAge(entity.getAge());
        dto.setPhoneNumber(entity.getPhoneNumber());
        return dto;
    }
}
