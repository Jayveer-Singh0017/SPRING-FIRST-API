package com.StudentManagementApp;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public String deleteStudent(int id){
        if(!studentDb.containsKey(id)){
            return "Student not exists in DB.";
        }
        studentDb.remove(id);

        return "Student remove from DB successfully";
    }

    public List<Student> getAllStudents(List<Student> allStudent){
        for(Integer key : studentDb.keySet()){
            allStudent.add(studentDb.get(key));
        }
        return allStudent;
    }

    public List<Student> getStudentByName(String name,List<Student> allStudents){

        for(Integer key : studentDb.keySet()){
            Student student = studentDb.get(key);
            if(student.getName().equals(name)){
                allStudents.add(student);
            }
        }

        return allStudents;
    }

    public String deleteAllByAge(int age){
        for(Integer key : studentDb.keySet()){
            Student student = studentDb.get(key);
            if(student.getAge() == age){
                studentDb.remove(key);
            }
        }

        return "Delete all students by age successfully";
    }
}
