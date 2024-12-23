package com.simran.learning.student.api.simStudentPackage.model;

public class Student {
 private String sName;
 private Long sId;
 private Long sMarks;
 private Integer sAge;
 //private String sEmailAdd;

 public Student(String sName, Long sId, Long sMarks, Integer sAge) {
  this.sName = sName;
  this.sId = sId;
  this.sMarks = sMarks;
  this.sAge = sAge;
  //this.sEmailAdd = sEmailAdd;
 }

 public String getsName() {
  return sName;
 }

 public void setsName(String sName) {
  this.sName = sName;
 }

 public Long getsMarks() {
  return sMarks;
 }

 public void setsMarks(Long sMarks) {
  this.sMarks = sMarks;
 }

 public Long getsId() {
  return sId;
 }

 public void setsId(Long sId) {
  this.sId = sId;
 }

 public Integer getsAge() {
  return sAge;
 }

 public void setsAge(Integer sAge) {
  this.sAge = sAge;
 }

 @Override
 public String toString() {
  return "Student{" +
          "sName='" + sName + '\'' +
          ", sId=" + sId +
          ", sMarks=" + sMarks +
          ", sAge=" + sAge +
          '}';
 }
}
