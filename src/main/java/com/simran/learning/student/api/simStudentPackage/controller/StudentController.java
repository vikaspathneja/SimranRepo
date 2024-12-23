package com.simran.learning.student.api.simStudentPackage.controller;

import com.simran.learning.student.api.simStudentPackage.model.Student;
import com.simran.learning.student.api.simStudentPackage.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentController {
    StudentService studentService = new StudentService();

@PostMapping

public Student addStudent(@RequestBody Student s){

    Student recStudent = studentService.addStudent(s);
    System.out.println(recStudent);
    return recStudent;
}

@GetMapping("/{id}")
public Student getStudentById(@PathVariable("id") Long Id){
    Student obj = studentService.getStudentById(Id);
    System.out.println(obj);
    return obj;

}
@DeleteMapping("/{id}")
public String deleteStudent(@PathVariable("id") Long Id){
    studentService.deleteStudentById(Id);
    return "the record has been deleted successfully for :"+Id;
}

@PutMapping("/{id}")
public Student updateStudent(@PathVariable("id") Long Id,@RequestBody Student s){
    Student updatedStudent = studentService.updateStudent(Id,s);
    System.out.println(updatedStudent);
    return  updatedStudent;
}

//    getStudents(){}
}
