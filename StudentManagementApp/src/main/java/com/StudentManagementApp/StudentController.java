package com.StudentManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/V1/student")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping
    public String addStudent(@RequestBody Student student){
        String response = service.addStudent(student);
        return response;
    }

    @GetMapping
    public Student getStudent(@RequestParam("id") int id){
        return service.getStudent(id);
    }

    @GetMapping("/{id}")
    public Student getStudentByUsingPathVariable(@PathVariable("id") int id){
        return service.getStudent(id);
    }

    // delete a student by id
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        String response = service.deleteStudent(id);
        return response;
    }

    // update the age particular student
    // get all students
    // get all students based on name
    // delete all students of a particular age


    // update the age particular student
    @PutMapping
    public String updateStudentAge(@RequestParam("id") int id, @RequestParam("age") int age){
        String response = service.updateStudentAge(id,age);
        return response;
    }

    // get all student
    @GetMapping("/all")
    public List<Student> getAllStudent(){
        List<Student> allStudents = new ArrayList<>();
        allStudents = service.getAllStudent(allStudents);
        return allStudents;
    }

    @GetMapping("/name/{name}")
    public List<Student> getStudentByName(@PathVariable("name") String name){
        List<Student> allStudents = new ArrayList<>();
        allStudents = service.getStudentByName(name,allStudents);
        return allStudents;
    }

    @DeleteMapping()
    public String deleteAllByAge(@RequestParam("age") int age){
        String response = service.deletAllByAge(age);
        return response;
    }

}

