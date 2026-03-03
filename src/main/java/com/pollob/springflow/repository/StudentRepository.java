// Database er sathe kotha bole
// ekhane automatically save(), findAll() e.t.c. method pabo.
package com.pollob.springflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pollob.springflow.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
