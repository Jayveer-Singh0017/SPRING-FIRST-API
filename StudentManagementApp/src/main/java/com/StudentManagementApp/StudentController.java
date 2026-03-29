package com.StudentManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        String response = service.addStudent(student);
        return response;
    }

    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("id") int id){
        return service.getStudent(id);
    }

    @GetMapping("/get_student/{id}")
    public Student getStudentByUsingPathVariable(@PathVariable("id") int id){
        return service.getStudent(id);
    }


}
