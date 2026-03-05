// Kaj implement kore. Ekhane actual logic lekha hoyeche.
package com.pollob.springflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pollob.springflow.model.Student;
import com.pollob.springflow.repository.StudentRepository;

/*
 * Ei annotation er mane bujhai, ei class ta Service layer er component.
 * App run hole ei class k scan korbe and ekta object create korbe then Spring Container a rakhbe, etai Spring Bean.
 */
@Service
// "implemnts" mane StudentService interface er sob method implement korte hobe tai sob method access korchi.
public class StudentServiceImpl implements StudentService {

	/*
	 * Eta Dependency Injection er kaj kore. StudentServiceImpl er kaj korte StudentRepository lagbe karon Repository database access korte pare.
	 * Interface er manually "new"/object create kora jai na.
	 * Tai "Spring" background a nije automaticaaly repository er object implementation kore and sei object inject kore dey "@Autowired" annotaion use kore.
	 */
    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
    	
    	// Business login example.
//    	Service Implementation a "Business Logic" likha hoy. Service Implementation er kaj "Business Logic" lekha.
//    	if(student.getName() == null || student.getName().isEmpty()) {
//            throw new RuntimeException("Name cannot be empty");
//        }
    	
    	
    	/* 
    	 * predefine mehtod save()
    	 * student object er value "Repository" te return kore dicche "ServiceImpl"
    	 * Jate "Repository" Hibernate er help a SQL Query pathai database a
    	 * and "Database" student obj er value story kore.
    	 */
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
    	// predefine mehtod findAll(). eta Student object er sob user show kore list akare.
        return repository.findAll();
    }
}