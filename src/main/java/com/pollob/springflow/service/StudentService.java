// Ekhane amra define/declare korlam ki ki kaj korbo.
package com.pollob.springflow.service;

import java.util.List;
import com.pollob.springflow.model.Student;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();
}