package com.dipesh.modelsmappper.service;


import com.dipesh.modelsmappper.dto.UserDto;
import com.dipesh.modelsmappper.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    UserDto saveStudent(Student student);
    UserDto getByIdStudent(Long id);
    List<UserDto>getAllStudent();
    UserDto updateUser(Long id ,Student student);
    Boolean deleteStudent(Long id);





}
