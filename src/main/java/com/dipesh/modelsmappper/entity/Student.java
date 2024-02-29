package com.dipesh.modelsmappper.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE ,generator = "student_tb_seq_gen")
    @SequenceGenerator(name = "student_tb_seq_gen",sequenceName = "student_tb_seq",allocationSize = 1)
    private Long id;
    private String name;
    private int phoneNumber;
    private int age;
    private String email;
    private String username;
    private String password;

}
