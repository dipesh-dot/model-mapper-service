package com.dipesh.modelsmappper.controller;

import com.dipesh.modelsmappper.dto.UserDto;
import com.dipesh.modelsmappper.entity.Student;
import com.dipesh.modelsmappper.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("/save")
    public ResponseEntity<UserDto> saveStudent(@RequestBody Student student){
        return ResponseEntity.ok().body(studentService.saveStudent(student));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable Long id ){
        return ResponseEntity.ok().body(studentService.getByIdStudent(id));

    }
    @GetMapping("/all")
    public ResponseEntity<List<UserDto>> getall(){
        return ResponseEntity.ok().body(studentService.getAllStudent());

    }
}
