package com.niafikra.demo.jpa;


import com.niafikra.demo.jpa.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void testRegisteringStudent(){
        Student student = new Student("Boniface", LocalDate.now().minusYears(20),76);
        studentService.register(student);
    }
}
