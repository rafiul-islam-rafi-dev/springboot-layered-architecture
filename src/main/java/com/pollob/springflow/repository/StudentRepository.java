// Database er sathe kotha bole
// ekhane automatically save(), findAll() e.t.c. method pabo.
package com.pollob.springflow.repository;

// "JpaRepository" holo Spring Data JPA er ready-made interface. ja already onek method create kore rakhche ex: save(), findAll() e.t.c.
import org.springframework.data.jpa.repository.JpaRepository;
// Student-Entity niye ei repositoy kaj korbe.
import com.pollob.springflow.model.Student;

/*
 * Interface karon:-
 * 1. Interface sudu rule likhbe, implementation likhbe na. implementation korbe SpringBoot. 
 * 2. SpringBoot runtime a automatically implementation class create kore. ei class hidden class amra dekhte pabo na.
 * 3. class use korle sob method manually likhte hobe.
 * 
 * <EntityType, PrimaryKeyType> So, <Student, Long>
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}
