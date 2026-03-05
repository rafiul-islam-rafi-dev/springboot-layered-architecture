// Ekhane amra define/declare korlam ki ki kaj korbo.
package com.pollob.springflow.service;

import java.util.List;
import com.pollob.springflow.model.Student;

/*
 * Interface karon:
 * akhane sudu "ki kaj hobe" seta declare kori
 * "kivabe kaj hobe" seta ServiceImpl a likhi. etai Abstraction
 */
public interface StudentService {

	/*
	 * "Student" holo returnType. Ei method ekta Student object return korbe.
	 * (Student student) "Student" holo DataType and "student" holo Parameter.
	 * Ei method er majhe ekta student object asbe.
	 * Mane ekta Student nebe and seta save korbe then saved Student return dibe.
	 */
    Student saveStudent(Student student);

    // onek gula Student return korte hobe tai List.
    List<Student> getAllStudents();
}