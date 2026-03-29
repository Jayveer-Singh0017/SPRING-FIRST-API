package com.StudentManagementApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public String deleteStudent(int id){
        String resposnse = repo.deleteStudent(id);
        return resposnse;
    }

    public String updateStudentAge(int id,int age){
        Student student = repo.getStudent(id);
        student.setAge(age);

        return "Update age successfully";
    }

    public List<Student> getAllStudent(List<Student> allStudents){
        return repo.getAllStudents(allStudents);
    }

    public List<Student> getStudentByName(String name,List<Student> allStudents){
        return repo.getStudentByName(name,allStudents);
    }

    public String deletAllByAge(int age){
        return repo.deleteAllByAge(age);
    }
}


