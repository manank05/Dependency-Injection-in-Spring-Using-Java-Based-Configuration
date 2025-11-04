package com.example.springdi;

public class Student {
    private Course course;

    // Constructor-based Dependency Injection
    public Student(Course course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student object created using Dependency Injection.");
        course.showCourse();
    }
}
