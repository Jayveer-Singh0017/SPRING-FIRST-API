package com.StudentManagementApp;

public class Student {

    private int studentId;
    private String name;
    private int age;
    private String college;

    public Student(int studentId, String name, int age, String college) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
