package com.simran.learning.student.api.simStudentPackage.service;

import com.simran.learning.student.api.simStudentPackage.model.Student;

import java.util.List;

public interface StudentServiceInterface {
    public Student addStudent(Student student);
    public Student getStudentById(Long sId);
    public List<Student> getAllStudent();
    public Student updateStudent(Long Id,Student student);
    void deleteStudentById(Long id);

}
