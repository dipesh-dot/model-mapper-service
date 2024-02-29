package com.dipesh.modelsmappper.service.serviceImplementation;

import com.dipesh.modelsmappper.converter.DtoConverter;
import com.dipesh.modelsmappper.dto.UserDto;
import com.dipesh.modelsmappper.entity.Student;
import com.dipesh.modelsmappper.repository.StudentRepository;
import com.dipesh.modelsmappper.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {


    private final StudentRepository studentRepository;

    public StudentServiceImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public UserDto saveStudent(Student student) {
        return DtoConverter.convert(studentRepository.save(student));
    }

    @Override
    public UserDto getByIdStudent(Long id) {
        return DtoConverter.convert(studentRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"student not found with id  : "+id)));
    }

    @Override
    public List<UserDto> getAllStudent() {
        List<UserDto> list = new ArrayList<>();
        for (Student student: studentRepository.findAll()){
            UserDto convertedStudent = DtoConverter.convert(student);
            list.add(convertedStudent);
        }
        return list ;
    }

    @Override
    public UserDto updateUser(Long id, Student student) {
        return null;
    }

    @Override
    public Boolean deleteStudent(Long id) {
        return null;
    }
}
