package com.StudentManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public String addStudent(Student student){
        repo.addStudent(student);
        return "Student added successfully";
    }

    public Student getStudent(int id){
        return repo.getStudent(id);
    }
}
