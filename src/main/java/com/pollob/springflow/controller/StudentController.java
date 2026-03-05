// User request handle kore.
package com.pollob.springflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pollob.springflow.model.Student;
import com.pollob.springflow.service.StudentService;

/*
 * "@RestController" 2tar Combination "@ResponseBody + @Controller"
 * "@RestController" HTTP request hangle kore. Ex: GET, POST, PUT, DELETE, PATCH agula RESTFul API create kore.
 * note:-
 * "@RESTful API" holo jar maddhome client HTTP request pathiye servcer theke data ney ba server a data pathai.
 * "@RestController" SpringBoot a REST API create korar jonno "@RestController" user kora hoy. Client/database a data pathnor jonno use kora hoy.
 * "@Controller (MVC Controller)" eta browser a HTML page dekhanor jonno use kora hoy.
 */
@RestController
// Base URL create korte ei annotation use kora hoy. Ex: "http://localhost:5454/students"
@RequestMapping("/students")
// RestController use korai ei class akhon "Web Layer" component.
public class StudentController {

	/*
	 * Interface er manually object create kora jai na.
	 * tai "@Autowired" use korai "Spring" automatically StudentService inject kore dibe. 
	 */
    @Autowired
    private StudentService service;

    /*
     * Ei annotation dara new data create kora hoy.
     * method call hobe.   POST "http://localhost:5454/students/input"
     */
    @PostMapping("/input")
    // '@RequestBody" ei annotation use korai, Spring internally automatically client theke asa "JSON akarer data" ke Student object a convert kore.
    public Student addStudent(@RequestBody Student student) {
    	// convert kora "Student object" return kore dey StudentServic a.
        return service.saveStudent(student);
    }

    /* 
     * Ei annotation dara "data" show/dekhar jonno use hoy.
     * method call hobe.   POST "http://localhost:5454/students/all"
     */
    @GetMapping("/all")
    public List<Student> getStudents() {
        return service.getAllStudents();
    }
}