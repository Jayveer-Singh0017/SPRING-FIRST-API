package com.StudentManagementApp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

//    studentId, Student
    Map<Integer,Student> studentDb = new HashMap<>();

    public void addStudent(Student student){
        studentDb.put(student.getStudentId(),student);
    }

    public Student getStudent(int id){
        return studentDb.get(id);
    }
}
