package com.simran.learning.student.api.simStudentPackage.service;

import com.simran.learning.student.api.simStudentPackage.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentService implements StudentServiceInterface {
 List<Student> sList = new ArrayList<>();
private Long idCounter = 0L;
    @Override
    public Student addStudent(Student student) {
        if(student.getsName()!=null && student.getsMarks() != 0 && student.getsAge()!=0){
            idCounter++;
            student.setsId(idCounter);
            sList.add(student);
            return student;
        }
        else return null;
    }

    @Override
    public Student getStudentById(Long sId) {
        Student student1Id=null;
        Optional<Student> getId = sList.stream().filter(s -> s.getsId().equals(sId)).findFirst();
       if(getId.isPresent()){
           student1Id = getId.get();
       }
        return student1Id;
    }

    @Override
    public List<Student> getAllStudent() {
        return List.of();
    }

    @Override
    public Student updateStudent(Long Id,Student student) {
        Student updatedStudent = null;
        if(Id != null ){
           Optional<Student>studentOpt= sList.stream().filter(x->x.getsId().equals(Id)).findAny();
           if(studentOpt.isPresent()) {
               Student stuObj = studentOpt.get();
               sList.remove(stuObj);
               student.setsId(Id);
               sList.add(student);


           }
        }
       return updatedStudent;
    }

    @Override
    public void deleteStudentById(Long id) {
        //Student student1 = null;
    //Optional<Student> getId = sList.stream().filter(student -> student.getsId().equals(id)).findFirst();
    //sList.removeIf(student -> student.getsId().equals(id));
       Student sobj =  sList.stream().filter(x->x.getsId().equals(id)).findAny().get();
        sList.remove(sobj);
        System.out.println(sList);
    }
}
