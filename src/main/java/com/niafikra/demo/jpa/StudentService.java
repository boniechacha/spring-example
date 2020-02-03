package com.niafikra.demo.jpa;

import com.niafikra.demo.jpa.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public void register(Student student){
        studentRepository.save(student);
    }
}
